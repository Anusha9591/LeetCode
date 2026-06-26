package LinkedList;

public class CycleDetection {



    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public int findLength(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                 ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }

    //LC: LL Cycle 2
public ListNode detectCycleStart(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                length=findLength(slow);
                break;
            }
        }
        //Find the start node
    if(length==0){
        return null;
    }
    ListNode f=head;
    ListNode s=head;
    while(length>0){
        s=s.next;
        length--;
    }
    while(s!=f){
        s=s.next;
        f=f.next;
    }
    return f;
}
//LC Is Happy number?
    public boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);
        if (slow==1){
return true;
        }
        return false;
    }
    private int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num=num/10;
        }
        return ans;
    }

    class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


//  class Main{
//      public static void main(String[] args) {
//
//      }
//  }
}
