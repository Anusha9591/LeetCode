package bsprob;
//i/p-->[1,2,3,4,5,3,1], target=3
//o/p-->2
//explanation:3 exists in the array, at index=2 and index=5, return the min index, which is 2
public class SearchInMountainArray {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,3,1};
    int target=3;

    int ans=search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in decreasing part of the array
                //this may be the ans, but look at left
                //this is why end!=mid-1
                end = mid;
            } else {
                //you are in a ascending part of array
                start = mid + 1; // because wkt mid+1 element>mid element


            }

        }
        //in the end, start==end and pointing to the largest no because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        //hence when they are pointing to just 1 element, that is the max one because that is what the checks say
        //more elaboration at every point of time for start and end, they have the best possible answer till that time
        //and if we are saying that only 1 item is remaining,hence because of  above line is the best possible ans

        return start; // return start or end as both pointing to same element
    }

    static int orderAgnosticBS(int[] arr, int target,int start,int end){

        //find asc or desc
        boolean isAsc=arr[start]<arr[end];
        System.out.println(isAsc);
        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
