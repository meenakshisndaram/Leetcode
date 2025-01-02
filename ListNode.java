import java.lang.reflect.Array;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
  class MergeTwoSortedLists {

      public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          int [] c ={2,3,4,5,6,7};

          ListNode dummy = new ListNode(-1);
          ListNode current = dummy;
     while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

         if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

         return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeLists = new MergeTwoSortedLists();

        // Example linked lists creation
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

          ListNode mergedList = mergeLists.mergeTwoLists(l1, l2);

          System.out.print("Merged List: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
