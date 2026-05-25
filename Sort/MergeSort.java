package Sort;

import java.util.Arrays;



public class MergeSort {

    public static void main(String[] args) {
         int arr[]={5,4,3,2,1};
           arr=mergesort(arr);
             System.out.println(Arrays.toString(arr));
//mergesortInPlace(arr,0,arr.length);
//        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){

        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=mergesort(Arrays.copyOfRange(arr,0,mid));
        int right[]=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int[]first, int[] second ){
        int[] mix=new int[first.length+ second.length];
        int i=0,j=0,k=0;
        while(i<first.length&& j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;

            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete

        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergesortInPlace(int[] arr,int s,int e){

        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergesortInPlace(arr,s,mid);
       mergesortInPlace(arr,mid,e);
         mergeinplace(arr,s,mid,e);
    }

    static void mergeinplace(int[] arr, int s,int m,int e ){
        int[] mix=new int[e-s];
        int i=s,j=m,k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;

            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete

        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
       for(int l=0;l<mix.length;l++){
           arr[s+l]=mix[l];
       }
    }
}
