import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=1;i<=9;i++){
            hm.put(i,0);
        }

        for(int num:arr){
            for(int i=1;i<=9;i++){
                if(num%i==0){
                    hm.put(i, hm.get(i)+1);
                }
            }
        }

        System.out.println(hm);





        
    }
    
}
