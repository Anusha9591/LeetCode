package Sort;

import java.util.ArrayList;
import java.util.List;

//range given [1,n]
//I/p: nums=[4,3,2,7,8,2,3,1] n=8
//o/p:[5,6]
//I/P:nums=[1,1]
//o/p[2]
//find all missing nos in an array
//Tips:If range =[0,N] then every element will be at index=value
//If range=[1,N] every element will be at index=value-1
public class FindAllMissingNos_CS {

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);

            } else {
                i++;
            }

        }
        //find all missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
          return ans;

    }
     static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}



