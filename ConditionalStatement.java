import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       // Print the largest of 2 numbers

    //    int num1 = 45;
    //    int num2 = 98;

    //    if (num1>num2){
    //     System.out.println(num1);
    //    }
    //    else{
    //     System.out.println(num2);
    //    }

      // Print if a number is odd number

    //   System.out.println("Enter The number :");
    //   int newNum = scan.nextInt();

    //   if(newNum%2==0){
    //     System.out.println("Number is Even !!");
    
    //   }
    //   else{
    //     System.out.println("Number is Odd !!");
    //   }

    // Adult Calculator

    // System.out.println("Enter Your age :");
    // int age = scan.nextInt();

    // if (age >=18){
    //     System.out.println("You Are Adult !! :) ");
    // }
    // else if (age>=13) {
    //     System.out.println("You Are Teenager !! :)");
    // }
    // else{
    //     System.out.println("You are Child :(");
    // }

    // Income Tax Cal calculator
    
    System.out.println("Enter Your Income !!");
    int income = scan.nextInt();

    if (income<=500000){
        System.out.println("Zero tax");
    }
    else if(income<=1000000){
        System.out.println("Your Taxx is 20% is "+income*0.20);
    }
    else{
        System.out.println("Your Taxx is 30% is "+income*0.30);
    }
    
    

    }
}