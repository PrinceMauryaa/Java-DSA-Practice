import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // int rang = scan.nextInt();

        // int count = 01 ;

        // while (count<100) {
        //     System.out.println("Hello"+count);
        //     count++;
            
        // }

        // Count 1-10

        // while (count <= rang) {
        //     System.out.println("no. :"+count);
        //     count++;
        // }



        // sum of first n numbers 

        // int res = 0;
        // while (count<rang) {
        //     res += count;
        //     count++;
        // }

        // System.out.println("Result is :"+res);


        // For Loop 

        // for(int i = 1 ; i<=10 ; i++){
        //     System.out.println("Hello Bro : "+i);
        // }

        // Printing square 

        // for(int j = 1 ; j<=10 ; j++){
        //     System.out.println("");
        // for(int i = 1 ; i<=10 ; i++){
        //     System.out.print("*");
        // }}


        // Flip an Number 

        // int num = 12345;
        // int lstNum = 0;
        // int newnum = 0;
        // while (num > 0) {
        //     lstNum = num % 10 ;
        //     newnum = (newnum *10) + lstNum;
        //     num = num /10;
        // }
        // System.out.print(newnum);


        // Break Statement 

        // do{
        //     System.out.println("Enter the number : ");
        //     int num = scan.nextInt();
        //     if (num % 10 == 0) {
        //         System.out.println("end Ho gya");
        //         break;
        //     }
        // }while(true);


        // Continue 
        // for(int i = 0 ; i< 100 ; i ++){
        //     if (i %10 == 0){
        //         continue;
        //     }
        //     System.out.println("Your number : "+i);
        // }


        // Prime Numberr
        // System.out.println("Enter number :");
        // int num = scan.nextInt();
        // boolean isPrime = true;

        // for (int i = 2 ; i <= num/2 ; i++){
        //     if (num % i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }
        
        // if (isPrime == false){
        //     System.out.println("This is not Prime !");
        // }
        // else{
        //     System.out.println("This Is  Prime");
        // }


        // Write a program that reads a set of integers , and then prints the sum of the even and odd integers.


        // int evenSum =0;
        // int oddSum =0;

        // do{
        //     System.out.print("Enter the number :");
        //     int num = scan.nextInt();
        //     if (num % 2 == 0){
        //         evenSum += num;
        //     }
        //     else{
        //         oddSum += num;
        //     }
        //     System.out.println("Press 1 to continue and 0 to  end !!");
        //     int temp = scan.nextInt();
        //     if (temp == 0) {
        //         break;
        //     }
        // }while(true);

        // System.out.println("Sum of all Even : "+evenSum);
        // System.out.println("Sum of all Odd : "+oddSum);


        //FActorial 

        System.out.println("Enter the number :");
        int num = scan.nextInt();
        int fact = 1;


        for(int i=num ; i>0 ;i--){
            fact = fact * i ;
        }

        System.out.println("FActorial of Num is : "+fact);
        // Table

    }
    
}
