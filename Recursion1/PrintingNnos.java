package Recursion1;


import java.sql.SQLOutput;

//Printing N nos in order and and in reverse order using recursion
public class PrintingNnos {

    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }


    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //concept(n--) gives error and nly prints 5
        concept(--n);
        //n-- vs --n
    }
}
