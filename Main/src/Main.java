import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    }

    public static void pratices16(String a,int begin,int end) {
        if (begin < 0 || end > a.length() || begin > end ){
            System.out.println("eror verdi...");
        }else {
            for (int i= begin;i<end;i++){
                System.out.println(a.charAt(i));
            }
        }
    }
}