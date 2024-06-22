import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<String> strings = List.of("abc", "def", "ghi", "aef", "agh", "ij", "akl", "test", "avocado", "ave");
//
//        List<String> FilteredList = Test1.filterString(strings);
//        System.out.println(FilteredList);

        String string = "text with white spaces";
        String newString = Test2.removeWhiteSpaces(string);

        System.out.println(newString);
    }
}
