/*import java.util.Scanner;
public class lec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x>y){
            System.out.println("x is greater than y");
        }else if(x==y){
            System.out.println("x is equal to y");
        }else{
            System.out.println("y is greater than x");
        }
        sc.close();
    }
}*/
import java.util.Scanner;

public class CompareNumbers{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("The greater number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greater number is: " + num2);
        } else {
            System.out.println("The numbers are equal");
        }


        scanner.close();
    }
}