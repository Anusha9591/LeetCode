package LinkedList;


public class MergeSort {

    private ListNode head;

    private ListNode tail;


    public static void main(String[] args) {

    }


        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode midPrev = getMidPrev(head);
            ListNode mid = midPrev.next;
            midPrev.next = null; // split the list

            ListNode left = sortList(head);
            ListNode right = sortList(mid);

            return mergeTwoLists(left, right);
        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            ListNode curr = dummy;

            while (list1 != null && list2 != null) {
                if (list1.value < list2.value) {
                    curr.next = list1;
                    list1 = list1.next;
                } else {
                    curr.next = list2;
                    list2 = list2.next;
                }
                curr = curr.next;
            }

            curr.next = (list1 != null) ? list1 : list2;

            return dummy.next;
        }

        private ListNode getMidPrev(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            return prev;
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
