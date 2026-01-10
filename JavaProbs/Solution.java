package JavaProbs;
import java.util.Arrays;

import static java.util.Arrays.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
//        int[] nums={1,2,3,1,1,3};
//        int ans=numIdenticalPairs(nums);
//        System.out.println(ans);
//        int[] nums = {8, 1, 2, 2, 3};
//        int ans[] = smallerNumbersThanCurrent(nums);
//
//        System.out.println(Arrays.toString(ans));
//        int[] nums = {-5,1,5,0,-7};
//        int altitude=largestAltitude(nums);
//        System.out.println(altitude);

//        int[] nums = {1,2,0,0};
//        int k=34;
//        List<Integer> list = addToArrayForm(nums,k);
//        System.out.println(list);
//        int digits[] ={9,9,9,9};
//        int ans[]=plusOne(digits);
//        System.out.println(Arrays.toString(ans));

//        int []nums = {-1,-100,3,99};int k = 2;
//        rotate(nums,k);
        int []nums = {10,5,2,1,3};
        boolean ans=checkIfExist(nums);
    }
//    public static int numIdenticalPairs(int[] nums) {
//        int count=0;
//
//        for(int i=0;i<nums.length ;i++){
//            for(int j=1;j<nums.length ;j++){
//                if(nums[i]==nums[j] && i<j){
//                    count++;
//                }
//
//            }
//        }
//        return count;
//    }


//        public static int[] smallerNumbersThanCurrent(int[] nums) {
//
//            int[] arr=new int[nums.length];
//            for(int i=0;i<nums.length;i++){
//                int count=0;
//                for(int j=0;j<nums.length;j++){
//
//                    if(nums[j]<nums[i] && j!=i){
//                        count++ ;
//
//                    }
//                    arr[i]=count;
//                }
//
//
//            }
//
//
//            return arr;
//
//        }
//    }


//    public static int largestAltitude(int[] gain) {
//        int[] altitude = new int[gain.length + 1];
//        altitude[0] = 0;
//        for (int i = 1; i < gain.length; i++) {
//            altitude[i] = gain[i] + altitude[i - 1];
//        }
//        int max = altitude[0];
//        for (int i = 1; i < altitude.length; i++) {
//            if (max < altitude[i]) {
//                max = altitude[i];
//            }
//        }
//        return max;
//    }


//        public static int[][] transpose(int[][] matrix) {
//
//            for(int i=0;i<matrix.length;i++){
//                for(int j=0;j<matrix[i].length;j++){
//                    while(i!=j){
//                        matrix[i][j]=matrix[j][i];
//                    }
//                }
//            }
//            return matrix;
//        }




        public static List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> result = new ArrayList<>();
            int i = num.length - 1;

            while (i >= 0 || k > 0) {
                if (i >= 0) {
                    k += num[i]; // Add current digit from num to k
                    i--;
                }
                result.add(k % 10); // Extract last digit
                k /= 10; // Remove last digit
            }

            Collections.reverse(result); // Reverse the list to get correct order
            return result;
        }


//        public int[] sumZero(int n) {
//  int val=0;
//        int arr[]=new int[n];
//            for(int i=0;i<arr.length;i++){
//                if(arr.length%2==0){
//                    arr[arr.length/2]=val;
//
//                }
//            }
//        }


        public static int[] plusOne(int[] digits) {
            int n = digits.length;

            // Traverse from the last digit
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) { // If digit is less than 9, just add 1 and return
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0; // If digit is 9, set it to 0 and continue
            }

            // If all digits were 9, we need an extra space (e.g., 999 → 1000)
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1; // Set the first digit to 1, rest are already 0
            return newDigits;
        }




        public static void rotate(int[] nums, int k) {
            int temp[]=new int[nums.length];
            int j=0;
            int n=nums.length;
            for(int i=0;i<nums.length;i++){
                if(i<k){
                    temp[k-1-i]=nums[n-i-1];
                }
                else{
                    temp[i]=nums[j];
                    j++;
                }


            }
            System.out.println(Arrays.toString(temp));

        }



        public static boolean checkIfExist(int[] arr) {
            int i=0;
            int j=0;
            while(i<arr.length){
                for(j=0;j<arr.length;j++){
                    if(arr[i]==2*arr[j]){
                        return true;
                    }

                }
                i++;
            }
            return false;
        }
    }







