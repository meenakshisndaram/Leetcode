class Lstnode {
    int val; // 3
    Lstnode next;
    Lstnode() {}
    Lstnode(int val) { this.val = val; }
    Lstnode(int val, Lstnode next) { this.val = val; this.next = next; }
}

class Solut {
    // Add Two Numbers
    public Lstnode addTwoNumbers(Lstnode l1, Lstnode l2) {
        Lstnode dummyHead = new Lstnode(0);
        Lstnode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Lstnode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}

class MainEx {
    public static void main(String[] args) {
        // List 1: 2 -> 4 -> 3 (342)
        Lstnode l1 = new Lstnode(2, new Lstnode(4, new Lstnode(3)));

        // List 2: 5 -> 6 -> 4 (465)
        Lstnode l2 = new Lstnode(5, new Lstnode(6, new Lstnode(4)));

        Solut solution = new Solut();
        Lstnode result = solution.addTwoNumbers(l1, l2);

        // Print result: 7 -> 0 -> 8 (807)
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
}






