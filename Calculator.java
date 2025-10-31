import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculator {
    public static String add(double a,double b){
        return String.valueOf(a+b);
    }
    public static String subtract(double a,double b){
        return String.valueOf(a-b);
    }
    public static String multiply(double a,double b){
        return String.valueOf(a*b);
    }
    public static String divide(double a,double b){
        if(b==0) return "Error: Division by zero";
        return String.valueOf(a/b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter first number:");
        double x=sc.nextDouble();
        System.out.println("Enter operator(+,-,*,/):");
        char op=sc.next().charAt(0);
        System.out.println("Enter second number:");
        double y=sc.nextDouble();
        String result;
        if(op=='+'){ result=add(x,y); }
        else if(op=='-'){ result=subtract(x,y); }
        else if(op=='*'){ result=multiply(x,y); }
        else if(op=='/'){ result=divide(x,y); }
        else{ result="Invalid operator"; }

        System.out.println("Result: "+result);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter numeric value.");
        }
        catch(Exception e){
            System.out.println("An Unexpected error occurred: "+e.getMessage());
        }
        finally{
            System.out.println("===================PROGRAM ENDED===================");
        sc.close();
    }
}
}
