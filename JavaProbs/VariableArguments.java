package LeetCode.JavaProbs;
import java.util.Arrays;

//variable no of arguments can be passed in that array
public class VariableArguments {
    public static void main(String[] args) {
         fun(2,4,5,6,7,8,8);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    //mix of arguments

}
