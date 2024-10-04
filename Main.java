public class Main {
    public static void main(String[] args)
    {
        Node n = new Node(5);
        Singly_Linked_list list = new Singly_Linked_list(n);
        list.print();
        list.Add(3);
        list.print();
        list.AddSecond(7);
        list.print();
        list.Addtoend(4);
        list.print();
        list.deleteLast();
        list.print();
        list.deleteLast();
        list.print();

        DNode dn = new DNode(4);
        Doubly_Linked_List DList = new Doubly_Linked_List(dn);
        DList.print();
        DList.Add(7);
        DList.Add(9);
        DList.print();
        DList.delete();
        DList.print();

        Node m = new Node(6);
        Circular_Linked_List CList = new Circular_Linked_List(m);
        CList.print();
        CList.Add(1);
        CList.Add(7);
        CList.print();
        CList.Delete();
        CList.print();
    }
}