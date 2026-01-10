package Sort;

import java.util.ArrayList;
import java.util.List;

//lecture-CS
// Set Mismatch
//I/p:nums=[1,2,2,4]
//o/p[2,3]
public class SetMismatch_CS {

    public static void main(String[] args) {
        int arr[]={1,2,2,4};

        System.out.println(MissingNumber(arr));
    }


    static List<Integer> MissingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            if( arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);

            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {

                ans.add(arr[index]);
                ans.add(index + 1);
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
