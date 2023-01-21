import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        Scanner in= new Scanner(System.in);

        System.out.println("Enter a number to see if it’s even or odd");
        number=in.nextInt();

        if ((number / 2)*2==number)

            System.out.println(+number+ " is even number.");

        else
            System.out.println(+number+ " is odd number");

    }
}// end class OddEven
