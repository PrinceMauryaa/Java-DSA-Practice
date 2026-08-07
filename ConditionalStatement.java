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
    
    // System.out.println("Enter Your Income !!");
    // int income = scan.nextInt();

    // if (income<=500000){
    //     System.out.println("Zero tax");
    // }
    // else if(income<=1000000){
    //     System.out.println("Your Taxx is 20% is "+income*0.20);
    // }
    // else{
    //     System.out.println("Your Taxx is 30% is "+income*0.30);
    // }
    
    // Print the largest number 

    // System.out.println("Enter The number a :");
    // int a = scan.nextInt();
    // System.out.println("Enter The number b :");
    // int b = scan.nextInt();
    // System.out.println("Enter The number c :");
    // int c = scan.nextInt();

    // if (a > b){
    //      if (a>c){
    //         System.out.println(a+" is Largest !!!");
    //      }
    //      else{
    //         System.out.println(c+" is Largest !!!");
    //      }
    // } 
    // else{
    //    if (b>c){
    //         System.out.println(b+" is Largest !!!");
    //      }
    //      else{
    //         System.out.println(c+" is Largest !!!");
    //      }
    // }

    // Ternary Operator 

    // String res = (7>16)?"hell":"Bye";

    // System.out.println(res);

    // Passed Or FAiled ??
    // System.out.println("Enter Your Mark :");
    // int Mark = scan.nextInt();
    // String Result = (Mark <33)? "Failed":"Passed";
    // System.out.println("Your Are "+Result);

    // Switch Statement

    // int in = scan.nextInt();

    // switch (in) {
    //     case 1:
    //         System.out.println("ye pehla wala hai !!");
    //         break;
    //     case 2:
    //         System.out.println("ye dusra wala hai !!");
    //         break;
    //     case 3:
    //         System.out.println("ye tesra wala hai !!");
    //         break;
    //     case 4:
    //         System.out.println("ye chautha wala hai !!");
    //         break;
    //     default:
    //         System.out.println("Sattt Karor !!!!!!");
    //         break;
    // }
    // Making Calculator Using This 

        // System.out.println("Enter The Numbers ::");
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();

        // System.out.println("Enter The Operator + - * / % :: ");
        // String OperatorMath = scan.next();
        // switch (OperatorMath) {
        //     case "+":
        //         System.out.println(num1+num2);
        //         break;
        //     case "-":
        //         System.out.println(num1-num2);
        //         break;
        //     case "*":
        //         System.out.println(num1*num2);
        //         break;
        //     case "/":
        //         System.out.println(num1/num2);
        //         break;
        //     case "%":
        //         System.out.println(num1%num2);
        //         break;
        //     default:
        //         System.out.println("Invalid Operator !!");
        //         break;
        // }


        // Find Number is Positve or Not ?

        // System.out.println("Enter The number :");
        // int numm = scan.nextInt();

        // if (numm>=0){
        //     System.out.println("Number is Positive !!");
        // }
        // else
        // {
        //     System.out.println("Number is Negative !!!");
        // }

        // double temp=103.5;

        // if (temp >100){
        //     System.out.println("YOR Have Fever !!");
        // }
        // else{
        //     System.out.println("No fever ");
        // }
        // Print Week by numbers 

        // System.out.println("Enter The Number :");
        // int week = scan.nextInt();

        // switch (week) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thursday");
        //         break;
        //     case 6:
        //         System.out.println("Friday");
        //         break;
        //     case 7:
        //         System.out.println("Saterday");
        //         break;
        
        //     default:
        //         System.out.println("Invalid");
        //         break;
        // }


        System.out.println("Enter The Year !");
        int year = scan.nextInt();

       if(year/4==0){
        if(year/100==0){
            if(year/400==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not Leap");
            }
            
        }
            else{
            System.out.println("Not Leap");
            }
       }
       else{
        System.out.println("Not Leap");
       }








    }
}