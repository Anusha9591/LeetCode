package Sort;

import java.util.Arrays;

//Lecture--Cyclic sort
//Input:nums=[3,0,1]
//o/p:2
//n=3 so all the no's are in the range[0,3] , 2 is the missing number
//Numbers from 0 till N----> Total there will be N+1  no's
//if no's from 0 to N every element will be at its own index element==index
//if N is presnt ignore it since we cannot put it in the correct index
// If the range is [0,2] and arr is [1,0,2]  and N=3 then return N which is 3 as its not present
//go and check the problem statement correctly to understand
public class MissingNumber_CS {

    public static void main(String[] args) {
        int arr[]={4,0,2,1};

        System.out.println(MissingNumber(arr));
    }


    static int MissingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
                swap(arr,i,arr[i]);

            }else{
                i++;
            }
        }
        //search for first missing number
          for(int index=0;index<arr.length;index++){
              if(arr[index]!=index){
                  return index;
              }
          }
          //case 2
        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
 }


