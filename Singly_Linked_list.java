public class Singly_Linked_list {
    private Node head;
    public Singly_Linked_list(Node head) {
        this.head = head;
    }
    void Add(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    void AddSecond(int data){
        if(this.head.next == null){
            this.head.next = new Node(data);
        }
        else {
            Node n = new Node(data);
            Node c = this.head.next;
            this.head.next = n;
            n.next = c;
        }
    }
    void Addtoend(int data){
        Node n = new Node(data);
        Node c = head;
        while (c.next != null){
            c = c.next;
        }
        c.next = n;
    }
    void deleteLast(){
        Node c = this.head;
        Node n = c.next;
        while(c.next != null){
            if(n.next == null){
                c.next = null;
            }
            c = n;
            n = n.next;
        }

    }
    void print(){
        Node c = this.head;
        while(c.next != null){
            System.out.print(c.data + "->");
            c = c.next;
        }
        System.out.println(c.data);
        System.out.println("\n");
    }
}
