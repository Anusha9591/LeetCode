

//*****MOST IMPORTANT*******//
//Cyclic Sort--->sorting in one pass or using only one for loop that makes only N comparisons
//IDEA: when given no's from range 1 to N use cyclic sort---------VVIMP

package Sort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int arr[]={5,3,4,1,6,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

static void sort(int[] arr){
    int i=0;
    while(i<arr.length){
        int correctIndex=arr[i]-1;
        if(arr[i]!=arr[correctIndex]){
            swap(arr,i,correctIndex);

        }else{
            i++;
        }

    }

}

    private static void swap(int[] arr, int first, int second) {
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;

    }

}


