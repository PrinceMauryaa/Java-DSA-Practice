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


    public static void main(String[] args) {

        HollowBox(5);
        
    }
}
