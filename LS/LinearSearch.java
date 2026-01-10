package LS;

public class LinearSearch {
    public static void main(String[] args) {
int[] nums={23,33,4,5,66,7,8,99,0};
        int target=5;
int ans=linearSearch(nums,target);
        System.out.println(ans);
    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1

    static int linearSearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index=0;index<arr.length;index++){
             if(arr[index]==target){
                 return index;
             }
        }
        return -1;
    }
    //returning element
    static int linearSearch2(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return arr[index];
            }
        }
        return -1;
    }
}
