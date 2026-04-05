import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number one: ");
        int num1= sc.nextInt();
        System.out.println("Enter a operators (+,-,*,/): ");
        char op= sc.next().charAt(0);
        System.out.println("Enter a number two: ");
        int num2= sc.nextInt();
        int result;
        switch(op){
            case '+':
            result = num1+num2;
            System.out.println("Result = " + result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("Result = " + result);
                break;
            case'*':
                result= num1*num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                result= num1/num2;
                System.out.println("Result = " + result);
                break;
            default:
                System.out.println("invalid operator");
                break;
        }


    }
}