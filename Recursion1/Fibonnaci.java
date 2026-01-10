package Recursion1;

public class Fibonnaci {

    public static void main(String[] args) {
        System.out.println(Fibo(4));
    }

    private static int Fibo(int n) {
        //Base condition
        if(n<2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}
