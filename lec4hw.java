import java.util.*;
public class lec4hw {
    public static void main(String[] args){
        //even no. till n
       /*  Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n upto which even no. are required : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();*/



        //infinite LOOP
        /*for(;;){
            System.out.println("hello izaan");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1 TO ENTER MARKS OR 0 TO EXIT : ");
        for(;;){
            int x=sc.nextInt();
            if(x==1){
                System.out.println("ENTER MARKS :");
                int marks=sc.nextInt();
                if(marks>=90 && marks<=100){
                    System.out.println("This is Good");
                }else if(marks>=60 && marks<=80){
                    System.out.println("this is also good");
                }else if(marks>=0 && marks<=59){
                    System.out.println("good efforts");
                }
            }else if(x==0){
                System.out.println("THANKS FOR VISITING");
                break;
            }
             
        }
        
        


    }
}
