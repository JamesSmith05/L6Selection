import java.util.Scanner;

public class Grading {

    public static void main(String[] arg){

        boolean Switch = true;
        while (Switch == true){
            Scanner input = new Scanner(System.in);
            System.out.println("Total marks available... ");
            int TotalMark = input.nextInt();
            System.out.println("Student marks... ");
            int StudentMark = input.nextInt();
            double percentage = ((StudentMark/TotalMark)*100);
            if (percentage > 80){
                System.out.println("Grade A");
            }
            else if (percentage > 70){
                System.out.println("Grade B");
            }
            else if (percentage > 60){
                System.out.println("Grade C");
            }
            else if (percentage > 50){
                System.out.println("Grade D");
            }
            else if (percentage > 40){
                System.out.println("Grade E");
            }
            else{
                System.out.println("Grade U");
            }
            System.out.println("");
        }

    }
}
