package LinkedList;

public class LL {

    private ListNode head;

     private ListNode tail;

    private int size;
    public LL() {
        this.size = 0;

    }



public void insertFirst(int val){
        ListNode node=new ListNode(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;

}

    public ListNode middleListNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }


    public void insertLast(int val){


        if(tail==null){
            insertFirst(val);
            return;
        }
        ListNode node=new ListNode(val);
        tail.next=node;
        tail=node;
        size+=1;

    }
public void insert(int val,int index){

        if(head==null){
            insertFirst(val);
        }
        if(index==size){
            insertLast(val);
        }
        ListNode temp=head;
        for(int i=1;i<index;i++){
           temp=temp.next;
        }
        ListNode node=new ListNode(val,temp.next);
        temp.next=node;
        size++;
}

public void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp=temp.next;
        }
    System.out.println("END");
}

//DELETE
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        ListNode secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        ListNode prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;

        return val;
    }
    public ListNode get(int index){
        ListNode node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    //Find by value
    public ListNode find(int value){
        ListNode node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

//QUESTIONS
    //1.Insert using recursion

    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private ListNode insertRec(int val,int index,ListNode node){
        if(index==0){
            ListNode temp=new ListNode(val,node);
            size++;
            return temp;
        }
       node.next=insertRec(val,index-1,node.next);
        return node;

    }



//    2.Remove duplicates from the sorted LL

    public void duplicates(){
        ListNode node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }


        }
        tail=node;
        tail.next=null;
    }


//    3.Merge two LL
    public static LL merge(LL first,LL second){
        ListNode f=first.head;
        ListNode s=second.head;

        LL ans=new LL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }

// Recursive Reverse LL
    private ListNode reverse(ListNode node){
        if(node==tail){
            head=tail;
            return head;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
 return head;
    }


    //In-place reversal of LL
    public void reversal(){
         if(size<2){
             return;
         }
         ListNode prev=null;
       ListNode present=head;
       ListNode next=present.next;
       while(present!=null){
           present.next=prev;
           prev=present;
           present=next;
           if(next!=null) {
               next = next.next;
           }
       }
       head=prev;
    }

    public ListNode reversal(ListNode head){
        if(size<2){
            return head;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null) {
                next = next.next;
            }
        }
        return prev;
    }

    //Reversal of LL inbetween

    public ListNode reverseBetween(ListNode head, int left,int right){

        if(left==right){
            return head;
        }

        //skip the first left-1 nodes

        ListNode current=head;
        ListNode prev=null;
        for(int i=0;current!=null && i<left-1;i++){
            prev=current;
            current=current.next;
        }

        ListNode last=prev;

        ListNode newEnd=current;

        //reverse bwt left and right
        ListNode next=current.next;
        for(int i=0;current!=null && i<(right-left+1);i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }

        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;

    }

    //Palindrome
    public boolean isPalindrome(ListNode head){
        ListNode mid=middleListNode(head);
        ListNode headsecond=reverse(mid);
        ListNode rereverseHead=headsecond;

        //compare both the halves
        while(head!=null && headsecond!=null){
            if(head.value!=headsecond.value){
                break;
            }
            head=head.next;
            headsecond=headsecond.next;
        }


        reverse(rereverseHead);
        if(head==null||headsecond==null){
            return true;
        }
        return false;
    }



    //Reorder List
    public void reorderList(ListNode head) {


        if(head==null||head.next==null){
            return;
        }
           ListNode headf=head;
           ListNode mid=middleListNode(head);
           ListNode heads=reversal(mid);

           while(headf!=null && heads!=null){
               ListNode temp=headf.next;
               headf.next=heads;
               headf=temp;

                temp=heads.next;
               heads.next=headf;
               heads=temp;

           }
//setting next of tail to null
        if(headf!=null){
            headf.next=null;
        }
    }

//    Reverse K alternate Group

    class Solution {
        public ListNode reverseAlternateKNodes(ListNode head, int k) {
            if (head == null || k <= 1) return head;

            ListNode temp = head;
            ListNode prevLast = null;

            while (temp != null) {
                // 1. Reverse k nodes
                ListNode kthNode = getKthNode(temp, k);
                if (kthNode == null) break; // fewer than k nodes left

                ListNode nextNode = kthNode.next;
                kthNode.next = null;

                ListNode newHead = reverse(temp);

                if (prevLast == null) {
                    head = newHead; // first group
                } else {
                    prevLast.next = newHead;
                }

                prevLast = temp; // temp is now last node of reversed group
                temp = nextNode;

                // 2. Skip k nodes
                for (int i = 0; i < k && temp != null; i++) {
                    prevLast = temp;
                    temp = temp.next;
                }
            }

            return head;
        }

        private ListNode getKthNode(ListNode node, int k) {
            k--;
            while (node != null && k > 0) {
                node = node.next;
                k--;
            }
            return node;
        }

        private ListNode reverse(ListNode head) {
            ListNode prev = null, curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    ListNode removeNthFromEnd(int n) {
            ListNode temp=head;
            int len=0;


            while(temp!=null){
                temp=temp.next;
                len++;
            }
            if(len<=1){
                head=null;
                return head;
            }
            ListNode prev=null;
            ListNode curr=head;
            for(int i=0;curr!=null && i<len-n;i++){
                prev=curr;
                curr=curr.next;

            }
            if(curr!=null){
                prev.next=curr.next;
            }
            return head;
        }



private class ListNode{
        private int value;
        private ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
}
