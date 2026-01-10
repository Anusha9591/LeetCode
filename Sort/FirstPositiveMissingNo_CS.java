package Sort;

//IDEA: Ignore elements that are -ve and greater than N

public class FirstPositiveMissingNo_CS {

    public static void main(String[] args) {
        int arr[]={0,2,1,3};

        System.out.println(MissingPositiveNumber(arr));
    }


    static int MissingPositiveNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);

            }else{
                i++;
            }
        }
        //search for first missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        //case 2
        return arr.length+1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}
