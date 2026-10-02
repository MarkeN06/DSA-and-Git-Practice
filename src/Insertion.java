public class Insertion {

    public void sortiranje(int[] niz) {
        for (int i=1;i<niz.length;i++) {
            int j=i;
            while (j>0 && niz[j-1]>niz[j]) {
                int temp=niz[j];
                niz[j]=niz[j-1];
                niz[j-1]=temp;
                j-=1;
            }
        }
        for (int i=0;i<niz.length;i++) {
            System.out.print(niz[i]+" ");
        }
    }
}
