package Recursion_Pattern_BS_SS;
import java.util.Arrays;

// * * * *
// * * *
// * *
// *
public class Trainglepattern {
    public static void main(String[] args) {
//        Triangle(4,0);
//        Triangle2(4,0);
        int arr[]={2,5,8,23,55,78,80};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void Triangle(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            Triangle(row,col+1);
        }else{
            System.out.println();
            Triangle(row-1,0);
        }



    }
    static void Triangle2(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){

            Triangle2(row,col+1);
            System.out.print("*");
        }else{

            Triangle2(row-1,0);
            System.out.println();
        }



    }
    static void bubble(int[] arr, int r,int c){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }else{
            bubble(arr,r-1,0);
        }
    }


}
