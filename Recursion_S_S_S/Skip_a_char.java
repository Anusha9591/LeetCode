package Recursion_S_S_S;


//str=baccad   ans=bccd skipped 'a'
//1) Pass the ans string in argument (Can be passed to future calls)
//2)Create the variable in function body( for every func calls new one will be created)

public class Skip_a_char {
    public static void main(String[] args) {
        skip("","baccad");
        System.out.println(skip("baccad"));
        System.out.println(skipastring("daapplebc"));
        System.out.println(skipappNotapple("daappleappbc"));
    }

    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }



    }



    //Skip using the argument by returning it
    static String skip(String up){
        if(up.isEmpty()){

            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
           return  skip(up.substring(1));
        }else{
          return ch+ skip(up.substring(1));
        }



    }

    static String skipastring(String up){
        if(up.isEmpty()){

            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return  skipastring(up.substring(5));
        }else{
            return ch+ skipastring(up.substring(1));
        }



    }
    static String skipappNotapple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple")){
            return  skipappNotapple(up.substring(3));
        }else{
            return ch+ skipappNotapple(up.substring(1));
        }



    }

}
