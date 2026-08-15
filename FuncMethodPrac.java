public class FuncMethodPrac {
    
    public static int Avg3no(int a , int b , int c){

        int sum = a+b+c;
        return sum/3;

    }

    public static boolean isEvan (int a){
        if(a%2 == 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        
        // average off 3 number !1

        // System.out.println(Avg3no(4,5 ,7));

        // Check number is Even or False !!

        System.out.println(isEvan(6));


    }

}
