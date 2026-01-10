package bsprob;
public class RotationCount {
    public static void main(String[] args) {
int[] arr={4,5,6,7,0,1,2};

        System.out.println(findPivotWithDuplicates(arr));

        System.out.println(countRotations(arr));
    }

 static int countRotations(int[] arr) {
        int pivot=findPivot(arr);
        return pivot + 1;
    }


    // this doesn't work for duplicate values
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //2
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid - 1;
            }else{
                start=mid + 1;
            }
        }
        return -1;
    }


    static int findPivotWithDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //2
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if elements at middle,start,end are equal just skip the duplicates ex:arr={2,2,2,2,9,2}
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //NOTE:what if these duplicates at start and end were the pivot??
                //also check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start]== arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}
