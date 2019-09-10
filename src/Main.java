import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double average;
        int sum = 0;

        int i=0;
        while (i < 20){
            System.out.print("Enter a student grade: ");
            sum += scan.nextInt();
            scan.nextLine();
            System.out.print("Enter 'quit' to quit or any key to continue: ");
            String response = scan.next();
            if (response.equalsIgnoreCase("quit")){
                System.out.println("Exiting loop.");
                i++;
                break;
            }
            i++;
        }
        average = sum/i;
        System.out.println("The sum of " + i + " grades is " + sum);
        System.out.println("The average is " + average);
    }
}
