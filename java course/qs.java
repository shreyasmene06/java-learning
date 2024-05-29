import java.util.*;
public class qs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int total=0;
        for(int i=1;i<=5;i++){
            System.out.println("enter marks of subject");
           
            int n=sc.nextInt();
            total=total+n;
        }
        double percentage=(total/500.0*100);
        System.out.print("your percentage is:");
        System.out.print(percentage);
        sc.close();
    }
   

}
