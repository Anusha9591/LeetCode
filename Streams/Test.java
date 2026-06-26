package Streams;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
         List<String> list=Arrays.asList("apple","banana","cherry");
        Stream<String> stream = list.stream();

        String arr[]={"apple","banana","cherry"};
        Stream<String> stream1 = Arrays.stream(arr);

        Stream<Integer> integerStream=Stream.of(1,2,3);
        
        Stream<Integer> limit=Stream.iterate(0,n->n+1).limit(10);

        Stream<Integer> limit1 = Stream.generate(() -> (int) Math.random() * 100).limit(5);





        List<Integer> list1=Arrays.asList(1,4,3,2,6,8,9,4445,65,66,77,84,34,23,19,2,44,88);
        List<Integer> filteredList = list1.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted((a,b)->b-a).limit(4).skip(1).collect(Collectors.toList());
        System.out.println(filteredList);

//        List<Integer> mappedList = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
//        System.out.println(mappedList);




//min,max,count are terminal operations
//        List<Integer> collect = Stream.iterate(0, x -> x + 1).limit(101).skip(1).filter(x->x%2==0).map(x->x/10).sorted().distinct().peek(x-> System.out.println(x)).collect(Collectors.toList());
        Integer i= Stream.iterate(0, x -> x + 1).limit(101).map(x->x/10).distinct().peek(System.out::println).max((a,b)->b-a).get();
        Long cnt= Stream.iterate(0, x -> x + 1).limit(101).map(x->x/10).distinct().count();
        System.out.println(cnt);

        System.out.println(i);
    }


    //Parellel stream
//    List<Integer> list3=Arrays.asList(1,4,3,2,6,8,9,4445,65,66,77,84,34,23,19,2,44,88);
//     list3.parallelStream();





}
