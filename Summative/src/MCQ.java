import java.io.*;
import java.util.Scanner;

public class MCQ {
    public static void askName() {

        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name + ".\n  Please select your test");
    }

    public static void operation() throws Exception{
        System.out.println("  Enter 1 for HTML Tests");
        System.out.println("  Enter 2 for JAVA Tests");
        System.out.println("  Enter 3 for JavaScript Tests\n");
        int score = 0;
        int total = 10;
//        File a = new File("csv files");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("HTML Test");
            System.out.println("Instruction: Please enter the letter of the correct answer(Small Letters only)\n");
            File a = new File("csv files/HTML_MCQ.csv");
            Scanner html = new Scanner(a);
            while (html.hasNextLine()) {
                String line = html.nextLine();
                String[] line_array = new String[6];
                line_array = line.split(",");
                System.out.println(line_array[0]);
                System.out.println(line_array[1]);
                System.out.println(line_array[2]);
                System.out.println(line_array[3]);
                System.out.println(line_array[4]);
                String correctAnswer = line_array[5];

                Scanner javaScript1 = new Scanner(System.in);
                String javaAns = javaScript1.nextLine();
                if(javaAns.equals(correctAnswer)) {
                    System.out.println("Correct Answer!");
                    score++;
                    System.out.println("Your Current score is " + score + "\n");
                }else {
                    System.out.println("Wrong: The Correct answer is " + correctAnswer);
                    System.out.println("Your Current score is " + score + "\n");
                }
            }
            html.close();

        } else if (option == 2) {
            System.out.println("Java Test");
            System.out.println("Instruction: Please enter the letter of the correct answer(Small Letters only)\n");
            File b = new File("csv files/JAVA_MCQ.csv");
            Scanner java = new Scanner(b);
            while (java.hasNextLine()) {
                String line = java.nextLine();
                String[] line_array1 = new String[6];
                line_array1 = line.split(",");
                System.out.println(line_array1[0]);
                System.out.println(line_array1[1]);
                System.out.println(line_array1[2]);
                System.out.println(line_array1[3]);
                System.out.println(line_array1[4]);
                String correctAnswer = line_array1[5];

                Scanner html1 = new Scanner(System.in);
                String javaAns = html1.nextLine();
                if(javaAns.equals(correctAnswer)) {
                    System.out.println("Correct Answer!");
                    score++;
                    System.out.println("Your Current score is " + score + "\n");
                }else {
                    System.out.println("Wrong: The Correct answer is " + correctAnswer);
                    System.out.println("Your Current score is " + score + "\n");
                }
            }
            java.close();

        } else if (option == 3) {
            System.out.println("JavaScript Test");
            System.out.println("Instruction: Please enter the letter of the correct answer(Small Letters only)\n");
            File c = new File("csv files/JavaScript_MCQ.csv");
            Scanner javaScript = new Scanner(c);
            while (javaScript.hasNextLine()) {
                String line = javaScript.nextLine();
                String[] line_array2 = new String[6];
                line_array2 = line.split(",");
                System.out.println(line_array2[0]);
                System.out.println(line_array2[1]);
                System.out.println(line_array2[2]);
                System.out.println(line_array2[3]);
                System.out.println(line_array2[4]);
                String correctAnswer = line_array2[5];

                Scanner javaScript1 = new Scanner(System.in);
                String javaAns = javaScript1.nextLine();
                if(javaAns.equals(correctAnswer)) {
                    System.out.println("Correct Answer!");
                    score++;
                    System.out.println("Your Current score is " + score + "\n");
                }else {
                    System.out.println("Wrong: The Correct answer is " + correctAnswer);
                    System.out.println("Your Current score is " + score + "\n");
                }
            }
            javaScript.close();
        } else {
            System.out.println("Only choose numbers 1-3");
            operation();
        }

        int wrongAns = total - score;
        int percent = (100 * score) / total;
        System.out.println("You have " + score + " correct and " + wrongAns + " wrong answer/s:");
        System.out.println("You scored " + percent +"%");
    }
//        try{
//
//        }catch (Exception e) {
//            System.out.println("Choose numbers 1-3 only");
//            operation();
//        }
//    }

    public static void main(String[] args) throws Exception {
        askName();
        operation();
    }
}

