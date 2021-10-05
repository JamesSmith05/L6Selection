import java.util.Scanner;

public class NestedIf {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number ");
        double pay = input.nextDouble();
        if (pay < 1000){
            System.out.println("Tax is 0%");
        }
        else if (pay >= 1000 && pay < 1200){
            System.out.println("Tax is 5%");
        }
        else if (pay >= 1200 && pay < 1500){
            System.out.println("Tax is 10%");
        }
        else{
            System.out.println("Tax is 15%");
        }
    }
}
