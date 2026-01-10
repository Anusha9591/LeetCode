package LS;

public class SearchInRange {

        public static void main(String[] args) {
            int[] nums={23,33,4,5,66,7,8,99,0};
            int target=99;
            int ans=linearSearch(nums,target,1,5);
            System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target,int start, int end){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index=start;index<=end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
