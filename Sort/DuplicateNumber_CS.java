package Sort;

//lecture:CS
//Find the Duplicate Number
//I/p:nums=[1,3,4,2,2]
//O/p:2
//I/p:nums=[1,1]
//o/p:1
public class DuplicateNumber_CS {
    public static void main(String[] args) {
        int nums[]={1,1};
        System.out.println(DuplicateNumber(nums));
    }

    static int DuplicateNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);

            }else{
                i++;
            }
        }
        //search for first missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return arr[index];
            }
        }

        return -1;
    }

    //KK code
    public int findDuplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}
