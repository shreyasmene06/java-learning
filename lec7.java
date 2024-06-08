import java.util.Scanner;

public class lec7 {
    public static void printMyName(String name){
        System.out.println(name);
        return;

    }
    public static int calcsum(int a,int b) {
        System.out.print("sum is :");
        int sum=a+b;
        return sum;

    }
    public static int fact(int a) {
        
        int fac=1;
        for(int i=a;i>=1;i--){
            fac=fac*i;
        }return fac;

    }
    public static int multi(int a,int b) {
        int prod=a*b;
        return prod;
    }
    public static void primetest(int a) {
        int x=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                x=0;
            }
        else{
            x=1;
        }
        }if(x==0){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        int a =sc.nextInt();
        int b=sc.nextInt();
        printMyName(name);
        int sum=calcsum(a, b);
        System.out.println(sum);
        System.out.println("the sum is: "+multi(a, b));
        System.out.println("factorial is :"+ fact(a));
        primetest(a);
        sc.close();
    }
}
