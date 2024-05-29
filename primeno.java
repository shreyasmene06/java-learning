import java.util.Scanner;

public class primeno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. to check");
        int n = sc.nextInt();
        int flag=1;
        if(n>1){
            for(int i=2;i<n;i++){
                if(n%i==0){ 
                    flag=1;
                }
            else{
                flag=0;
                }
            }
        }else{
            System.out.println("not prime");
            flag=0;
        }
        if(flag==1){
            System.out.println("not prime");
        }else if(flag==0){
            System.out.println("prime");
        }
        sc.close();
    }
}
