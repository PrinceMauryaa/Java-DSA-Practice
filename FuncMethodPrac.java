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

    public static int poww(int num , int po){
        int res = 1;
        for(int i = 1 ; i <= po; i++){
            res = res * num;
        }
        return res;
    }

    public static boolean isPalindron(int num){

        double num_rev = 0;
        for(int i = 0 ; i < num ; i++){
            num_rev = num_rev + (num%10)*Math.pow(10,i);
            num = num/10;
        }

        if(num == num_rev){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        
        // average off 3 number !1

        // System.out.println(Avg3no(4,5 ,7));

        // Check number is Even or False !!

        // System.out.println(isEvan(6));

        // check the number is palindom !!

        System.out.println(isPalindron(121));


    }

}
