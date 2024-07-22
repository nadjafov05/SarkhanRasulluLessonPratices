import java.util.Scanner;

public class LessonsWork {
    public static void pratices1(){
        System.out.println("Convert Int to String");
        int number = 123;
        String str = String.valueOf(number);

        if(str.equals("123")){
            System.out.println(number + " Translate the number into a string"+" : one hundred twenty-five");
        }
    }

    public static void pratices2(){
        System.out.println("Print all the numbers divisible by 2 from 0 to the given number");
        Scanner sc = new Scanner(System.in);
        System.out.print("reqem daxil edin: ");
        int enterNumber = sc.nextInt();

        for (int i=0;i<=enterNumber;i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void pratices3(){
        System.out.println("Swap two variables without using a third variable");
        int a = 11;
        int b = 22;

        a = b + a; // 5
        b = a - b; //3
        a = a - b; //2
        System.out.println(a);
        System.out.println(b);
    }

    public static void pratices4(){
        System.out.println("Find the number of digits in the number.//12345");
        int reqemler = 456789654;
        String str = String.valueOf(reqemler);
        System.out.println(str.length());
    }

    public static boolean pratices5(){
        System.out.println("Check if the given string is equal to its reverse");

        String str = "SOS";
        for (int i=0;i<str.length();i++){
            char sol = str.charAt(i);
            char sag = str.charAt(str.length()-1-i);
            if (sol != sag){
                return false;
            }
        }
        return true;
    }

    public static boolean pratices6(){
        System.out.println("Write a method to determine if the reverse of the entered number is the same as the origina");
        int a = 7573;
        String str = String.valueOf(a);
        for (int i=0;i<str.length();i++){
            char sol = str.charAt(i);
            char sag = str.charAt(str.length()-1-i);
            if (sol != sag){
                return false;
            }
        }
        return true;
    }

    public static void pratices7(int number,char symvol,boolean booleans){
        System.out.println("Print the character 'c' up to 'a' times. If the boolean variable is true, " +
                "\n print it line by line, otherwise print it side by side");
        for (int i=0;i<number;i++){
            if (booleans == true){
                System.out.println(symvol);
            }else {
                System.out.print(symvol);
            }
        }
    }

    public static void pratices8(int a,int b,int c){
        System.out.println("Raise all numbers from a to b to the power of c using Math.powclearc");
        for (;a<=b;a++){
            System.out.println(Math.pow(a,c));
        }
    }

    public static String pratices9(int a){
        System.out.println("Write a method that determines whether the entered number is positive, negative, or zero.");
        String result = (a>0)? "+1":(a < 0)? "-1":"0";
        return result;
    }

    public static void pratices10(int a,int b,int c,int d){
        System.out.println("Sure! Below is the Java method that accepts four numbers and returns true if any two of the numbers are equal:\n");

        if (a == b || a == c || a == d) {
            System.out.println(true);
        }else if (b == a || b == c || b == d){
            System.out.println(true);
        }else if (c == a || c == b || c == d){
            System.out.println(true);
        }else if (d == a || d == b || d == c){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
