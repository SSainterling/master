import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        System.out.println("Enter 2 integers and an operation");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        char c = obj.next().charAt(0);
        int r=0;
        switch (c){
            case '+':
                r = a+b;
                break;
            case '-':
                r = a-b;
                break;
            case '*':
                r = a*b;
                break;
            case '/':
                r = a/b;
                break;
            case '%':
                r = a%b;
                break;
        }
        System.out.println(a+" "+c+" "+b+" = "+r);
    }
}// end class Integer
