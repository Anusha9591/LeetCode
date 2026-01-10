package String;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        System.out.println("Anusha" + new ArrayList<>());
//        System.out.println(new Integer(56)+new ArrayList<>());
        //'+' operator is used with primitives and complex objects as well but the only condition is atleast one object should be of type string
        System.out.println(new Integer(56)+""+new ArrayList<>());
    }
}
