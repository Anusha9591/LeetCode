package LeetCode.Arrays;

public class max {
    public static void main(String[] args) {
        int arr[]={1,5,4,6,7,88,9,5};
        System.out.println(getMax(arr));
        System.out.println(getMaxRange(arr,2,6));
    }

  static int getMax(int[] arr) {
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];

            }
        }

        return maxVal;
    }

    static int getMaxRange(int[] arr,int start,int end) {
        if(end>start ){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxVal=arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];

            }
        }

        return maxVal;
    }

}