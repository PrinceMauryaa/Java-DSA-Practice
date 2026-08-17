public class ArrayPt1 {


    public static int NumIndex(int arr[] ,int key){

        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }


    public static int Largest(int arr[]){
        int larget = arr[0];
        for (int i = 1 ; i < arr.length ; i++){
            if(larget < arr[i]){
                larget = arr[i];
            }
           
        }

        return larget;
    }


    public static void BiSort(int arr[]  , int num){
        // int start = arr[0];
        // int end = arr[arr.length-1];
        // int mid = arr[(start+end)/2];

        // while (mid == num) {

        //     if(mid + num){
        //         start = mid + 1;
        //     }
        //     else{
        //         end =  mid - 1;
        //     }
            
            
        // }

        // System.out.println(mid);

    }

    public static int[] Reverse(int Arr[]){
        int first = 0;
        int last = Arr.length-1;

        while (first < last) {
            
            int temp = Arr[first];
            Arr[first] = Arr[last];
            Arr[last] = temp;

            first++;
            last--;
            
        }
        return Arr;
    }

    public static void PrintArr(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }




    public static void main(String[] args) {

        // Array
        int BinArr[] = {2,6,8,10,12,16,18,22};
        int Num[] = {99,1,56,37,39,55,36,90,28,45,27,19};
        int key = 15;
        // if(NumIndex(Num, key) == -1){
        //     System.out.println("NOT FOUND !!");
        // }
        // else{
        //     System.out.println("INDEX : "+NumIndex(Num, key));
        // }

        // System.out.println(Largest(Num));

        // BiSort(BinArr, 8);

       PrintArr( BinArr = Reverse(BinArr) ) ;

        



    }
}
