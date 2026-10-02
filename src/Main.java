//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
    Bubble bubble= new Bubble();
    System.out.println("Bubble sort:");
    bubble.sortiranje(niz);

}
