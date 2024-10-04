public class Doubly_Linked_List {
    DNode head;

    public Doubly_Linked_List(DNode head) {
        this.head = head;
    }

    void Add(int data) {
        DNode n = new DNode(data);
        DNode c = head;
        while(c.next != null){
            c = c.next;
        }
        c.next = n;
        n.Previous = c;
    }
    void delete(){
        DNode c = this.head;
        DNode n = c.next;
        while(c.next != null){
            if(n.next == null){
                c.next = null;
                n.Previous =null;
            }
            c = n;
            n = n.next;
        }
    }
    void print(){
        DNode c = this.head;
        while(c.next != null){
            System.out.print(c.data + "<->");
            c = c.next;
        }
        System.out.println(c.data);
        System.out.println("\n");
    }

}
