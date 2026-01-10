package Recursion1;

public class BS {

    public static void main(String[] args) {
int[] arr={1,5,8,14,15,55,66,78,108};
int target=14;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int []arr, int target, int start, int end){
       if(start>end){
           return -1;
       }

        int mid=start+(end-start)/2;
       if(arr[mid]==target){
           return mid;
       }
       if(arr[mid]> target){
           return search(arr, target,start,mid-1);

       }
       return search(arr,target,mid+1,end);
    }
}
