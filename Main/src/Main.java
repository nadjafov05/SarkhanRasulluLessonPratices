import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String e = foo(1);
        System.out.println(e);
    }
    public static String foo(int a){
        String result = (a>0)? "+1":(a < 0)? "-1":"0";
        return result;
    }

}