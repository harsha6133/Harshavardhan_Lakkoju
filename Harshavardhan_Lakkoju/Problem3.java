import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        for(int i=1;i<=x;i++){

            if(i%2!=0){
                for(int j=1;j<=i;j++){
                    System.out.print(((2*j)-1)+" ");
                }
            }
            else{
                for(int j=1;j<=i-1;j++){
                    System.out.print(((2*j)-1)+" ");
                }
                
            }
            
            System.out.println();
        }
    }
    
}
