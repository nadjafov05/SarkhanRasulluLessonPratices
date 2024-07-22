import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char chars = foo("SALAM",3);
        System.out.println(chars);

    }
    public static char foo(String str,int d){
        return str.charAt(d);
    }

}