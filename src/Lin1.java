public class Lin1 {
    Node head;
    Node tail;

    public void add(int zahl) {

        Node node = new Node(zahl);
        if (head == null) {
            head = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;

    }

    class Node {

        Node next;
        Node previous;
        int zahl;

        public Node(int zahl) {
            this.zahl = zahl;
            this.next = null;
            this.previous = null;

        }

        public void setNext(Node next) {

            this.next = next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        @Override
        public String toString() {
            return "Node [next=" + next + ", previous=" + previous + ", zahl=" + zahl + "]";
        }

    }

    @Override
    public String toString() {
        return "Lin1 [head=" + head + ", tail=" + tail + "]";
    }

    
}

class main {
    public static void main(String[] args) {
        Lin1 ls = new Lin1();
        ls.add(1);
        ls.add(2);

        // System.out.println(ls.head.next);

        System.out.println(ls.toString()                 );

    }
}
