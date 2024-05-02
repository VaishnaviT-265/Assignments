import java.util.*;

public class Calculator
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);  
    double num1,num2, result;  
    System.out.println("******************* Calculator **********************");
    System.out.println("Enter first number: ");
    num1 = getInput(sc);
    System.out.println("Enter second number: ");
    num2 = getInput(sc); 
    System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Division \nEnter Operation :");
    int ch=sc.nextInt();
    switch (ch) {
        case 1:
            result=num1+num2;
            System.out.println("Result : " + result); 
            break;
        case 2:
            result=num1-num2;
            System.out.println("Result : " + result); 
            break;
        case 3:
            result=num1*num2;
            System.out.println("Result : " + result); 
        case 4:
            if(num2==0)
            {
                System.out.println("Error! Division by zero is not allowed");
                return;
            }
            result=num1/num2;
            System.out.println("Result : " + result); 
            break;
        default:
            System.out.println("Error! Invalid operation");
            break;
    } 
    } 

    public static double getInput(Scanner sc)
    {
       while(!sc.hasNextDouble())
       {
        System.out.print("Invalid input. Please Enter a number: ");
        sc.next();
       }
       return sc.nextDouble();
    }

    


}