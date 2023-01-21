import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles travelled: ");
        double miles = scan.nextDouble();

        System.out.println("Enter Gallons: ");
        double gallons = scan.nextDouble();

        double mpg=miles/gallons;
        System.out.println("miles per gallons is " + mpg);
    }
}// end class GasMileage
