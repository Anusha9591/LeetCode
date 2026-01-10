package Recursion1;

public class DigitSum {
    public static void main(String[] args) {
        int ans=Sumofdigits(524);
        System.out.println(ans);
    }

    private static int Sumofdigits(int n) {

        if(n==0){
            return 0;
        }

        return (n%10)+Sumofdigits(n/10);

    }

}
