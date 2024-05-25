import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First No :");
        int a = sc.nextInt();
        System.out.println("enter Second No :");
        int b = sc.nextInt();
        System.out.println("FOR ADDITION : 1 , FOR SUBTRACTION :2 , FOR MULTIPLICATION :3 , FOR DIVISION :4 , FOR MODULUS :5");
        int operation = sc.nextInt();
        if (operation ==1){
            System.out.println(a+b);
        }else if (operation==2){
            System.out.println(a-b);
        }else if (operation==3){
            System.out.println(a*b);
        }else if (operation==4){
            System.out.println(a/b);
        }else if (operation==5){
            System.out.println(a%b);
        }
        sc.close();
    }

}
