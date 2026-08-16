public class PatternPart2 {


    public static void HollowBox(int a){

        for(int i = 1 ; i <= a ; i ++){
            for(int j = 1 ; j <= a ; j ++){
                if(i == 1 || i == a || j == 1 || j == a){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }



    public static void InvTrangle( int a){


        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++){
                if (j >= a-i){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println(" ");
        }

    }

    public static void InvPiraWithNum(int num ){
        for(int i = num; i >= 1 ; i-- ){
            for (int j = 1 ; j <= i ; j++ ){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static void FloiedTrangle( int num )
    {
        int a = 1;
        for(int i = 1; i <= num ; i++ ){
            for (int j = 1 ; j <= i ; j++ ){
                System.out.print(a+" ");
                a++;
            }
            System.out.println("");
        }
    }

    public static void ZeroOneTrangle(int num){

        int a = 1;
        for(int i = 1; i <= num ; i++ ){
            for (int j = 1 ; j <= i ; j++ ){
                if(a % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                a++;
            }
            System.out.println("");
        }
        
    }


    public static void butterFly(int num){

        for(int i = 1 ; i <= num ; i++){

            for(int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            for(int a = 1 ; a <= 2*(num-i) ; a++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println("");

        }
         for(int i = num ; i > 0 ; i--){

            for(int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            for(int a = 1 ; a <= 2*(num-i) ; a++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println("");

        }

    }
    


    public static void main(String[] args) {

        // HollowBox(5);
        // InvTrangle(8);
        // InvPiraWithNum(5);
        // FloiedTrangle(5);
        // ZeroOneTrangle(6);

        butterFly(4);
        
    }
}
