
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();
        String reg = "^[A-Z][A-Za-z0-9_!@#\\$%\\^\\&*\\)\\(+=.\\s+]*[.]$";
        Pattern pat = Pattern.compile(reg);
        Matcher matcher = pat.matcher(input);
        if(matcher.find())
            System.out.println("String is in sentence format");
        else
            System.out.println("String is not in sentence format");
    }
}