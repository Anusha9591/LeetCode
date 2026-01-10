package Sort;
import java.util.Arrays;


public class Practice {

    public static void main(String[] args) {
        int arr[]={3,2,4,1,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicsort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }

    static void swap(int arr[], int first, int second){
        int temp=arr[first];
         arr[first]=arr[second];
        arr[second]=temp;
    }

    static void insertion(int nums[]){

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }

    }

    static void selection(int nums[]){
        for(int i=0;i<nums.length;i++) {
            int last = nums.length - i - 1;
            int maxIndex=getMax(nums,0,last);
            swap(nums,maxIndex,last);
        }
    }
    static int getMax(int arr[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
