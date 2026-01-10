package Sort;

import java.util.ArrayList;
import java.util.List;

//lecture:CS
//Find the Duplicate Number in an Array
//I/p:nums=[1,3,4,2,2,3]
//O/p:[2,3]
//I/p:nums=[1,1]
//o/p:1
public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        System.out.println(DuplicateNumber(nums));
    }

    static List<Integer> DuplicateNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);

            }else{
                i++;
            }
        }
        //search for first missing number
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }

        return ans;
    }





    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}







