import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int correctAnswer = num1 + num2;

        System.out.println("What is " + num1 + " + " + num2 + "?");
        int userAnswer = sc.nextInt();

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }

        sc.close();
    }
}