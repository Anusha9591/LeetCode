package Recursion_Permutation;

import java.util.ArrayList;

// No of recursive calls = size of processed value+1
public class Permutations {
    public static void main(String[] args) {
         permutations("","abc");
        System.out.println(permutationsList("","abc"));
        System.out.println(Countpermutations("","abc"));
    }

 static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
 }

    static int Countpermutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;
        }
int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+Countpermutations(f+ch+s,up.substring(1));
        }
        return count;
    }
    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();

            ans.add(p);
            return ans;
        }
ArrayList<String> list=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            list.addAll(permutationsList(f+ch+s,up.substring(1)));
        }
        return list;
    }
}
