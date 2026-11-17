package sorting;

public class Insertion {

    public void sortiranje(int[] niz) {
        for (int i=1;i<niz.length;i++) {        // VAZNO: Indeksiranje krece od 1
            int j=i;                            //Inicijalizujemo j da bude jednako i

            while (j>0 && niz[j-1]>niz[j]) {    //Dok je prethodni broj veci od trenutnog, zameni ih
                int temp=niz[j];
                niz[j]=niz[j-1];
                niz[j-1]=temp;
                j-=1;                           // Kako bi presao na sledeci korak j ide na sledeci index
            }
        }
        for (int i=0;i<niz.length;i++) {
            System.out.print(niz[i]+" ");
        }
    }
}       //TIME COMPLEXITY(n^2)
