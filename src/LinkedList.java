class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data); // Pravljenje Node

        if  (head == null) {
            head = newNode;
            return;
        }
        Node temp=head;
        while (temp.next != null) {
            temp=temp.next;
        }
        temp.next = newNode;

    }

    public LinkedList(int[] niz){
        for (int j : niz) {
            insert(j);
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }

    public void reverse() {
        Node current = head;
        Node prev = null;       //Inicijalizaija pocetnog stanja
        Node next = null;
        while(current != null) {  // Uslov: Sve dok se ne prodje cela lista O(n)
            next=current.next;    // Cuvamo next kao jednu Nodu ispred
            current.next=prev;    // Obrcemo Pointere
            prev=current;         // Proslu pomeri napred
            current = next;       // Nastavljamo dalje u listi
        }
        head=prev; // Postavljamo head da bude na pocetku reversovane liste
    }

}
