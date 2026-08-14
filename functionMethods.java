import java.util.Scanner;

public class functionMethods {

    public static int inText(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void swap (int a , int b){
        int temp ;
        temp = a ;
        a = b;
        b = temp;
         System.out.println("A is : " + a);
         System.out.println("B is : "+b);
    }

    public static int multi(int a, int b){

        return a*b;
    }





    public static void main(String[] args) {
        

        // swap 

        swap(inText(),inText());



        // multiply

        multi(inText(),inText());

        // factorial



        // Bionominal Cofficient nCr = n! / r! (n-n)!

        // 
    }
}