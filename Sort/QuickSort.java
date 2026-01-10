package Sort;
import java.util.Arrays;
//pivot: choose any element
//After first pass all the elements<p will be on the LHS of p and
// elements>p will be at RHS of p
//after every pass we are putting the pivot at the right position
//In merge sort even if the array is sorted then too it will go to the base condition
//In quick sort  this won't happen
//Check hybrid sorting algorithm

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int nums[],int low,int high){

        //these pointers(s,e) are for swapping while low and high are the real pointers
        int s=low;
        int e=high;
        if (low >=high) {
            return;
        }

        int m=s+(e-s)/2;
        int pivot=nums[m];
        while(s<=e){
            //also a reason why if its already sorted it will not swap
           while(nums[s]<pivot){
               s++;
           }
           while(nums[e]>pivot){
               e--;
           }

           if(s<=e){
               int temp=nums[s];
               nums[s]=nums[e];
               nums[e]=temp;
               s++;
               e--;
           }
        }

        //now my pivot is at correct index, please sort 2 halves now
        sort(nums,low,e);
        sort(nums,s,high);


    }

}
