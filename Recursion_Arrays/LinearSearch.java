package Recursion_Arrays;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={1,4,5,6,3,5,5,7,39,99};
        int target=5;
//        System.out.println(findIndex(arr,target,0));
//        findAllIndex(arr,target,0);
//        System.out.println(list);
//        ArrayList<Integer> ans=findAllIndexList(arr,target,0,new ArrayList<>());
//        System.out.println(ans);
        System.out.println(findAllIndexList2(arr,4,0));
    }
static boolean find(int arr[],int target,int index){
    if(index==arr.length){
        return false;
    }

    return arr[index]==target || find(arr,target,index+1);
}
static int findIndex(int arr[],int target,int index) {
    if(index==arr.length){
        return -1;
    }
    if(arr[index]==target) {
        return index;
    }else{

    return findIndex(arr,target,index+1);
}

}

    static int findIndexFromLast(int arr[],int target,int index) {
        if(index==-1){
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }else{

            return findIndex(arr,target,index-1);
        }

    }

//Find all the index if duplicate elements are found

    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int arr[],int target,int index) {
        if(index==arr.length){
            return;
        }
        if(arr[index]==target) {
            list.add(index);
        }

          findAllIndex(arr,target,index+1);


    }
    //returning arraylist

    static ArrayList<Integer> findAllIndexList(int arr[],int target,int index,ArrayList<Integer> list) {
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target) {
            list.add(index);
        }

        return findAllIndexList(arr,target,index+1,list);

    }

    //Goal: return the list but dont take it in argument
    //Return type is arraylist
    //challenges-->Every call will have a new list
     // we can do one thing while returning the list we can check if the previous call has any ans in the list check it if it has add that also to your list

    static ArrayList<Integer> findAllIndexList2(int arr[],int target,int index) {
        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index]==target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls= findAllIndexList2(arr,target,index+1);
         list.addAll(ansFromBelowCalls);
         return list;
    }




}
