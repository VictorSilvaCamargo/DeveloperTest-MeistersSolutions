import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static List<String> filterString (List<String> input){

        List<String> filteredList =  input.stream()
                .filter(s -> s.startsWith("a") && s.length() == 3)
                .collect(Collectors.toList());

        return filteredList;
    }
}
