import java.util.Scanner;
public class Main {
    public static void main (String arg[]) {
        int num = 0;
        String strInput;
        boolean isValid = false;
        Scanner userInput = new Scanner(System.in);
        while(isValid == false) {
            System.out.print("Enter an integer value: ");
            strInput = userInput.nextLine();
            try{
                num = Integer.parseInt(strInput);
                isValid = true;
            } catch(NumberFormatException e) {
                System.out.println("Error – Please enter an integer value");
            }
        }
        System.out.println("You entered the number "+ num);
    }
}