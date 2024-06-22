import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static List<Integer> SwapArithmeticMethod (List<Integer> numbers){

        List<Integer> numbersSwapedArithmetic = new ArrayList<>();

        int a = numbers.get(0);
        int b = numbers.get(1);

        a = a + b;
        b = a - b;
        a = a - b;

        numbersSwapedArithmetic.add(a);
        numbersSwapedArithmetic.add(b);
        return numbersSwapedArithmetic;

    }

    public static List<Integer> RepeatLoopMethod (List<Integer> numbers){

        List<Integer> numbersSwapedLoop = new ArrayList<>();

        for (int i = numbers.size() -1 ; i >= 0; i--){
            numbersSwapedLoop.add(numbers.get(i));
        }
        return numbersSwapedLoop;
    }

}
