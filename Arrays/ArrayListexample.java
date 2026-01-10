package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListexample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(5);
        Scanner sc=new Scanner(System.in);
        list.add(55);
        list.add(66);
        list.add(90);
        list.add(99);
        System.out.println(list.contains(90));
        System.out.println(list);
        list.set(0,99);
        list.remove(2);
        System.out.println(list);
        //input
        for(int i=0; i< 5; i++){
            list.add(sc.nextInt());
        }
        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
