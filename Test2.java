import java.util.stream.Collectors;

public class Test2 {

    public static String removeWhiteSpaces (String s) {

        StringBuilder stringWithoutSpaces = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c != ' '){
                stringWithoutSpaces.append(c);

            }
        }
        return stringWithoutSpaces.toString();

    }
}
