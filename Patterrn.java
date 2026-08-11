import java.util.Scanner;

public class Patterrn {

    public static void main (String abc[]){

        // first Pattern
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente The Size Of triangle :: ");
        int size = scan.nextInt();

        // for(int i = 1 ; i <= size ; i++){
        //     for(int j = i ; j > 0 ; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // inveted Triangle !!



        // for(int i = 1 ; i<= size ; i++){
        //     for(int j = size ; j > i ; j-- ){

        //         System.out.print("*");
        //     }
        //     System.out.println("");

        // }



        // Half Piramid 

        for(int i = 1; i<=size;i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}