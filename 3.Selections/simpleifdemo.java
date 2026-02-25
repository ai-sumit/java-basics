import java.util.Scanner;
public class simpleifdemo { //you can't use underscore in class name,number can't be the first character of class name, and you can't use reserved keywords as class name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
}
}
