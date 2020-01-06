public class Deque {
    Node  f;
    Node  l;
    int  count;
    class Node {
        String  item;
        Node  next;
        Node prev;
    }
    
    public void addFirst(String item) {
        Node newNode  = new Node();
        newNode.item  =  item;
        count++;
        if (count ==  1) {
            f = newNode;
            l=  newNode;
        }
        else {
            Node  tempFirst = f;
            f=  newNode;
            newNode.next =  tempFirst;
            tempFirst.prev =  newNode;
        }
    }
    public void addLast(String item) {
        Node newNode = new  Node();
        newNode.item = item;
        count++;
        if(count == 1) {
            f = newNode;
            l = newNode;
        }
        else {
            Node tempLast = l;
            l = newNode;
            newNode.prev = tempLast;
            tempLast.next = newNode;
        }
    }
    public String removeFirst() {
        String item = f.item;
        count--;
        f = f.next;
        if(count == 0) {
            l = null;
        }
        else {
            f.prev = null;
        }
        return item;
    }
    public String removeLast() {
        String item = l.item;
        count--;
        l = l.prev;
        if(count == 0 ){
            f = null;
        }
        else {
            l.next = null;
        }
        return item;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addFirst("44");
        deque.addFirst("11");
        deque.addFirst("55");
        deque.addLast("4");
        deque.addLast("1");
        deque.addLast("5");
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}