import java.util.Scanner;

class Calculator{
    public double calculator(double a,double b,String typeofoperator){

        switch(typeofoperator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                System.out.println("Enter valid Operator ");

        }

        return 0;


    }
}

public class Problem1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator cs=new Calculator();
        System.out.println("Enter Value of a ");
        double a=sc.nextDouble();
        System.out.println("Enter Value of b ");
        double b=sc.nextDouble();
        System.out.println("Enter an Operator ");
        String typeofoperator=sc.next();

        double Result=cs.calculator(a, b, typeofoperator);
        System.out.println("Result : "+Result);


    }

}