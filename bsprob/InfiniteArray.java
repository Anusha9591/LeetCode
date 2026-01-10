package bsprob;
//position of an element in infinite sorted array
public class InfiniteArray {
    public static void main(String[] args) {
int[] arr={3,6,8,9,10,15,19,33,45,66,100,190,500};
int target=11;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int start=0;
        int end=1;
        //cond for the target to lie in the range
        while(target>arr[end]){
            int newStart=end+1;
            //double the box value
            //end=previous end+sizeofbox*2
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);

    }

    static int binarySearch(int[] arr, int target,int start, int end){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
