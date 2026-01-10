package Recursion1;


//Given an integer num, return the no of steps to reduce it to zero
//in 1 step if the given no is even you have to divide it by 2, otherwise you have to subtract 1 from it
public class numberOfSteps_LC {

    public static void main(String[] args) {
        int steps=numberOfSteps(14);
        System.out.println(steps);
    }
    static int numberOfSteps(int n){
        return helper(n,0);
    }

    private static int helper(int n, int steps) {

        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
