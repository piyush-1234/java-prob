import java.util.Arrays;

public class demo {

    private Node head;
    private Node tail;
    private int size;
    public demo()
    {
        this.size = 0;
    }

    public void insert(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
        {
               tail = head;
        }
        size +=1;
    }

    public void display()
    {
       node temp = head;
       while(temp != null)
       {
           System.out.println(temp.value + "->");
           temp = temp.next;
       }
    }

    private class Node
    {
        private int val;
        private Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, demo.Node next) {
            this.val = val;
            this.next = next;
        }

        
    }  
}
