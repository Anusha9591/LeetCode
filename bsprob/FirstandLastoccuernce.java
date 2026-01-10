//First and last occurence of an element in an sorted array
//eg arr={1,2,4,7,7,7,7,8} target=7
//ans=3 and 6

package bsprob;
//
//public class FirstandLastoccuernce {
//
//    public static int[] searchRange(int[] nums, int target){
//        int[] ans={-1,-1};
//        boolean findStartIndex;
//        ans[0]=search(nums,target,findStartIndex=true);
//        if(ans[0]!=-1){        //ans[0] is starting or first occurence of the element
//            ans[1]=search(nums,target,findStartIndex=false);
//        }
//        return ans;
//    }
//    static int  search(int[] nums,int target,boolean findStartIndex){
//        int ans=-1;
//        int l=0;
//        int r=nums.length-1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//
//            // If the element is present at the
//            // middle itself
//            if (nums[mid] == target) {
//                ans= mid;
//                if(findStartIndex){
//                     r=mid-1;
//               }else{
//                    l=mid+1;
//                }
//                // If element is smaller than mid, then
//                // it can only be present in left subarray
//                // so we decrease our r pointer to mid - 1
//            } else if (nums[mid] > target) {
//                r = mid - 1;
//
//                // Else the element can only be present
//                // in right subarray
//                // so we increase our l pointer to mid + 1
//            } else {
//                l = mid + 1;
//            }
//        }
//
//        // We reach here when element is not present
//        // in array
//        return -1;
//    }
//
//    // Driver method to test above
//    public static void main(String args[])
//    {
//
//        int arr[] = { 2,10,3, 4, 10,10,10 ,40 };
//        int n = arr.length;
//        int x = 10;
//
//     int ans[]=searchRange(arr,x);
//     for(int i :ans) {
//         System.out.println(i);
//     }
//    }
//}
// Java implementation of iterative Binary Search
import java.util.Arrays;
public class FirstandLastoccuernce {

    public static void main(String[] args) {
        int arr[]={-3,-1,0,2,3,3,3,3,3,3,17,-3,99,101};
        int target=3;
        int ans[]=searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
static int[] searchRange(int[] arr,int target){
        int[] ans={-1,-1};
        ans[0]=search(arr,target,true);
        if(ans[0]!=-1){
            ans[1]=search(arr,target,false);
        }
      return ans;
}

    static int search(int arr[],int target,boolean firstOccurence){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //potential answer
                ans=mid;
                if(firstOccurence){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }
        }

        return ans;
    }

}