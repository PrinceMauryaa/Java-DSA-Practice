public class PracticeArr {


    public static boolean noDub(int arr[]){

        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = 0 ;j < arr.length ; j++){
                if (i == j){
                    continue;
                }
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }


        return false;
    }


    
    public static void main(String[] args) {

        int arr[] = {1,3,5,5,6};
        System.out.println(noDub(arr));
        
    }

    
}
