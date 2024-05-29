public class lec5 {
    public static void main(String args[]) {
        /* RECTANGLE PATTERN
        int n=4;
        int m=5;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        //RECTANGLE HOLLOW
        /*int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } System.out.println();
        }      
        */


        //half triangle
        /*int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();

        }
        */


        //inverted triangle
        /*int n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();

        }
        */



        //inverted half pyramid
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.println(" ");
                }
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
            }
        }
    
    }

