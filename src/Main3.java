import java.util.Scanner;

public class Main3 {
    public static void main(String[] arg) {
        final double vat = 1.2;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number ");
            double price = input.nextDouble();
            System.out.println("Your price +VAT is " + (vat*price));
        }

    }
}
