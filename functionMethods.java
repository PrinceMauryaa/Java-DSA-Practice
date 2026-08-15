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


    public static int fact (int num){

        int res = 1 ;
        for(int i = 1; i <= num ; i++){
            res = i*res;
        }
        return res;
    }

    public static int BioCof(int n , int r){

        int a = fact(n);
        int b = fact(r);
        int c = r-n;

        int res = a/(b*c);

        System.out.println(res);


        return res;


    }

    public static boolean isPrime(int num){

        if(num == 2){
            return true;
        }
        for(int i=2 ; i < num/2 ; i++){
            if(i%num==0){
                return true;
            }
        }

        return false;

    }

    public static void countPrime(int num){

        for ( int i = 2 ; i <= num ; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }



    public static void main(String[] args) {
        

        // swap 

        // swap(inText(),inText());



        // multiply

        // multi(inText(),inText());

        // factorial


        // System.out.println(fact(5));



        // Bionominal Cofficient nCr = n! / r! (n-r)!

        // System.out.println(BioCof(2,5));

        // print prime number !!
        countPrime(100);




        // 
    }
}