package JavaProbs;
//i/p :n=23597 o/p: 79532
//logic: 7*10+9=79,
//79*10+5=795
//795*10+3=7953
//7953*10+2=79532
public class ReverseNo {
    public static void main(String[] args) {
    int n=23597;
int ans=0;
    while(n>0){
        int rem=n%10;
        n/=10;
ans=ans*10+rem;
    }
        System.out.println(ans);
    }





}
