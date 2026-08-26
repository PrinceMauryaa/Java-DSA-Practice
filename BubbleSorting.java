public class BubbleSorting {


    public static void sort(int arr[]){ 

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        for(int i = 0; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }


    public static void SmalSort(int arr[]){
        int smlVal = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i]>arr[j]){
                    smlVal = arr[j];
                    arr[j] = arr[i];
                    arr[i] = smlVal;
                }
            }

        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }


        System.out.println("Small First Done!!");
    }


    public static void main(String[] args) {
        int arr[] = {12,4,6,78,7,3,8,9};
        int Num[] = {99,1,56,37,39,55,36,90,28,45,27,19};


        SmalSort(Num);


    }
}
