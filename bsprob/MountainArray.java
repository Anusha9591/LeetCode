package bsprob;
//Peak index in mountain array
//basically finding maximum element in that array using BS
//Mountain array--->[0,1,0]  , [1,4,6,8,9,5,4,2,1]
public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,9,5,4,2,1};

        System.out.println(peakIndexInMountainArray(arr));
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

}
