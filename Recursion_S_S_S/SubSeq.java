package Recursion_S_S_S;


//Subsequence is used for strings
//subsets for arrays
//subsequence is basically removing or including a char or element from that string
//[abc]=[a,b,c,ab,ac,bc,abc]
//remember to maintain the order

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subseq("","abc");
        System.out.println(subseqReturn("","abc"));
        subseqAscii("","abc");

    }

    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }

///method 2 returning arraylist
    static ArrayList<String> subseqReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch=up.charAt(0);
        ArrayList<String> left=subseqReturn(p+ch,up.substring(1));

        ArrayList<String> right=subseqReturn(p,up.substring(1));

        left.addAll(right);
        return left;

    }

    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
        subseqAscii(p,up.substring(1));

    }


    ///method 2 returning arraylist
    static ArrayList<String> subseqReturnAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch=up.charAt(0);
        ArrayList<String> left=subseqReturnAscii(p+ch,up.substring(1));

        ArrayList<String> right=subseqReturnAscii(p,up.substring(1));
        ArrayList<String> mid=subseqReturnAscii(p+(ch+0),up.substring(1));

        left.addAll(right);
        left.addAll(mid);
        return left;

    }
}

