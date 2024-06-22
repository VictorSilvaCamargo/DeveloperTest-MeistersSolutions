import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("abc", "def", "ghi", "aef", "agh", "ij", "akl", "test", "avocado", "ave");

        // Problem 1: Filter strings starting with 'a' and exactly 3 letters
        List<String> filteredList = Test1.filterString(strings);
        System.out.println("Problem 1: Filter strings starting with 'a' and exactly 3 letters");
        System.out.println("Result: " + filteredList);
        System.out.println();

        // Problem 2: Remove white spaces from a string without using replace()
        String string = "text with white spaces";
        String newString = Test2.removeWhiteSpaces(string);
        System.out.println("Problem 2: Remove white spaces from a string without using replace()");
        System.out.println("Result: " + newString);
        System.out.println();

        // Problem 3: Swap two numbers without using a third variable
        List<Integer> list = new ArrayList<>();
        list.add(7); // first number
        list.add(20); // second number

        List<Integer> numbersSwapped1 = Test3.SwapArithmeticMethod(list);
        System.out.println("Problem 3: Swap two numbers without using a third variable (Arithmetic Method)");
        System.out.println("Result: " + numbersSwapped1);

        List<Integer> numbersSwapped2 = Test3.RepeatLoopMethod(list);
        System.out.println("Problem 3: Swap two numbers without using a third variable (Repeated Loop Method)");
        System.out.println("Result: " + numbersSwapped2);
    }
}
