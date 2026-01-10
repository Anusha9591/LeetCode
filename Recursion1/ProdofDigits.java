package Recursion1;

public class ProdofDigits {

    public static void main(String[] args) {
        int ans= Prodofdigits(515);
        System.out.println(ans);
    }

    private static int Prodofdigits(int n) {

        if(n%10==n){
            return n;
        }

        return (n%10)*Prodofdigits(n/10);

    }

}
