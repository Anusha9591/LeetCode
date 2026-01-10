package JavaProbs;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

//Java program to count the no of times a particular digit is present in a number for ex 3 in 1234563783
public class CountOccurence {
    public static void main(String[] args) {
        int n = 234537585;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if(rem==5) {
                count++;
            }

        n = n / 10;
    }
   System.out.println(count);
}
}
