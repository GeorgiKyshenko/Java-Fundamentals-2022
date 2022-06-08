package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VehicleCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();

        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(vehicle);

            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {
            String model = line;
            vehicleList.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));
            line = scanner.nextLine();
        }
        List<Vehicle> cars = vehicleList.stream().filter(vehicle -> vehicle.getType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> trucks = vehicleList.stream().filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());

        double carsAveragePower = avgHp(cars);
        double trucksAveragePower = avgHp(trucks);
        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAveragePower);
        System.out.printf("Trucks have average horsepower of: %.2f.", trucksAveragePower);

    }

    static double avgHp(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsepower).sum() / vehicles.size();
    }

    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %d", getType().toUpperCase().charAt(0) + getType().substring(1), model, color, horsepower);
        }
    }
}
