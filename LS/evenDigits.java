package LS;
//Given an array of integers, return how many of them contain even no of digits.
public class evenDigits {
    public static void main(String[] args) {
         int[] nums={12,345,2,6,777,7766,88,666,33333};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }return count;

    }

    static boolean even(int num){
        int noofdigits=digits(num);
//        if(noofdigits%2==0){
//            return true;
//        }
//        return false;
        //or
        return noofdigits%2==0;
    }
    //count no of digits
    static int digits(int num){

        //if no is -ve make it +ve
        if(num<0){
            num=num*-1;
        }

        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
