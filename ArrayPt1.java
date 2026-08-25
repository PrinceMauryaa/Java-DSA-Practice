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

    public static void PairArr(int Arr[]){

        for(int i = 0 ; i < Arr.length ; i++){

            for (int j = i+1 ; j < Arr.length ; j++)
                {
                if(i == j){
                    System.out.print("");
                }else{
                    System.out.print(Arr[i] + ","+Arr[j] + "  ,  ");
                }
            }
            System.out.println("");
        }


    }

    public static void subArray(int num[]){

        int maxVal = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < num.length ; i++){
            int start = i ;
            for(int j = i ; j < num.length ; j++ ){
                int end = j ;
                for(int k = start ; k <= end ; k++){
                    System.out.print(num[k]+" ");
                    sum = sum+num[k];
                }
                System.out.print(" -- Sum :"+sum);
                if(maxVal < sum){
                    maxVal = sum;
                }
                sum = 0;
                
                System.out.println("");
            }
            System.out.println("");
        }
         System.out.println("Maximum Sum = "+ maxVal);


    }

    public static int TrappedWater(int arr[]){

        if (arr.length<3) {
            return 0;
        }
        int leftMax = 0 ;
        int rightMax = 0 ;
        int countWater = 0;

        for(int i = 0; i < arr.length ; i ++){
            for(int j = i; j > 0; j--){
                if(arr[j] > leftMax){
                    leftMax = arr[j];
                }
            }
            for(int j = i; j < arr.length; j++){
                if(arr[j] > rightMax){
                    rightMax = arr[j];
                }
            }
            int minNum = Math.min(leftMax,rightMax);
            if(minNum-arr[i] > 0){
                countWater = countWater + (minNum-arr[i]);
            }
        }
        return countWater;
    }
    
    public static void main(String[] args) {

        // System.out.println(" HELLO THIS IS JAVA LANG..");

        // Array
        int BinArr[] = {2,6,8,-10,12,16,-18,-22};
        int Num[] = {99,1,56,37,39,55,36,90,28,45,27,19};
        int key[] = {15,7};
        int TapWat[] = {4,2,0,6,3,2,5};
        // if(NumIndex(Num, key) == -1){
        //     System.out.println("NOT FOUND !!");
        // }
        // else{
        //     System.out.println("INDEX : "+NumIndex(Num, key));
        // }

        // System.out.println(Largest(Num));

        // BiSort(BinArr, 8);

        //PrintArr( BinArr = Reverse(BinArr) ) ;

        // PairArr(BinArr);

        // Print Subarrays .. !!
        
        // subArray(BinArr);

        // rain wala question

        // tapping rain watter 

        System.out.println(TrappedWater(TapWat));


    }
}
