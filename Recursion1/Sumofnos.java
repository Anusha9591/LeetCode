package Recursion1;

public class Sumofnos {
    public static void main(String[] args) {
        int ans= Sum(5);
        System.out.println(ans);
    }

    private static int Sum(int n) {

        if(n<=1){
            return 1;
        }

        return n+ Sum(n-1);

    }
}
