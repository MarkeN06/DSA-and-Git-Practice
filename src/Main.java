import sorting.Bubble;
import sorting.Insertion;

void main() {

    Scanner sc = new Scanner(System.in);
    int velicina;
    System.out.println("Unesi velicinu niza");
    velicina = sc.nextInt();
    int[] niz= new int[velicina];
    System.out.println("Unesi brojeve niza");
    for (int i = 0; i < velicina; i++) {
        niz[i] = sc.nextInt();
    }
    int[] original=niz.clone();
    Bubble bubble= new Bubble();
    System.out.println("sorting.Bubble sort:");
    bubble.sortiranje(niz);
    niz=original;

    System.out.println("\n");

    Insertion insertion= new Insertion();
    System.out.println("sorting.Insertion sort:");
    insertion.sortiranje(niz);

    System.out.println("\n_______________________________________\n");

    LinkedList linkedList = new LinkedList(niz);
    linkedList.display();
    System.out.println("\n");
    linkedList.reverse();
    linkedList.display();
    System.out.println("\n");
    linkedList.reverse();

}
