package LeetCode.bsprob;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int arr[]={-3,-1,0,2,3,5,8,9,12,17,88,99,101};
        int arr[]={101,99,77,66,55,45,43,41,33,32,31,30,21,10,1,-1,-2};
        int target=-1;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }


    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        //find asc or desc
        boolean isAsc=arr[start]<arr[end];
        System.out.println(isAsc);
        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }

}
