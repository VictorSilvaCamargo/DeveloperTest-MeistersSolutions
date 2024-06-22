import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = List.of("abc", "def", "ghi", "aef", "agh", "ij", "akl", "teste", "avocado", "ave");

        List<String> FilteredList = Test1.filterString(strings);
        System.out.println(FilteredList);
    }
}
