public class ArrayPt1 {


    public static int NumIndex(int arr[] ,int key){

        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i]==key){
                System.out.println("Index : "+i);
                return i;
            }
        }
        return -1;

    }





    public static void main(String[] args) {

        // Array
        int Num[] = {1,56,37,39,55,36,90,28,45,27,19};
        int key = 55;
        System.out.println(NumIndex(Num, key));
        
        
    }
}
