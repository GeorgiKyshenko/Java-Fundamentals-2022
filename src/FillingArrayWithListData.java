import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FillingArrayWithListData {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("John 10", "Peter 12", "Someone 15"));
        String[] array = new String[list.size()];

        list.toArray(array);

        for (int i = 0; i < array.length; i++) {             // Всеки елемент от масива го разделям в отделен масив.

            String[] array2 = array[i].split(" ");

            String name = array2[0];                            // Взимам името и годините по отделно от вторият масив.
            int age = Integer.parseInt(array2[1]);

            System.out.println(Arrays.toString(array2));
        }
    }
}


