package BS2D;

public class SortedMatrix {
    public static void main(String[] args) {

    }

    //search in the row provided bwt the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid=cStart+ (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid+1;
            }
        }
        return new int[]{-1,-1};

    }
    static int[] search(int[][] matrix, int target){
        int rows=matrix.length;
        int cols=matrix[0].length; //be cautious, matrix may be empty

        if(rows==1){
        return binarySearch(matrix,0,0,cols-1,target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
         //run the loop till 2 rows are remaining
        while(rStart < (rEnd-1)){  //while this is true it will have more than 2 rows
            int mid=rStart+ (rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
//now we have two rows
       //check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1, cMid};
        }
        //search in 1st half

        //search in 2nd half

        //search in 3rd half

        //search in 4th half

        return new int[0];
    }

}
