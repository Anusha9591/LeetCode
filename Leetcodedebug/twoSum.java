package Leetcodedebug;
import java.util.Arrays;
class twoSum {

    public static void main(String[] args) {
        int[] arr={1,5,3,2,7,88,9,55};
        int res[]=new int[2];
        res=twoSum(arr,9);
        System.out.println(Arrays.toString(res));


    }
    public static int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int arr[]=new int[2];
        Arrays.sort(nums);
        while(left<right){
            if(nums[left]+nums[right]>target){
                right--;
            }else{
                left++;
            }
            if(nums[left]+nums[right]==target){
                arr[0]=left;
                arr[1]=right;
            }
        }
        return arr;
    }
}