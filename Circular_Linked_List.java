public class Circular_Linked_List {
    Node Head;
    public Circular_Linked_List(Node n){
        this.Head = n;
        if(this.Head != null){
            this.Head.next = n;
        }
    }

    void Add(int data){
        Node n = new Node(data);
        if(Head == null){
            n.next = n;
        }
        else {
            n.next = Head.next;
            Head.next = n;
        }
        Head = n;
    }
    void Delete(){
        if(Head == null || Head.next == null){
            Head = null;
        }
        Node c = Head.next;
        while(c.next != Head){
            c = c.next;
        }
        c.next = Head.next;
        Head = c;
    }
    void print(){
        Node c = this.Head.next;
        while(c != Head){
            System.out.print(c.data + "-");
            c = c.next;
        }
        System.out.println(c.data);
        System.out.println("\n");
    }
}
