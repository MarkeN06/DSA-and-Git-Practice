package sorting;

public class Bubble{

    public void sortiranje(int[] niz){
        boolean swaped=true; //Uslov za ulazenje u petlju
        int end=niz.length-1; // inicijalizacija velicine niza
        while(swaped){
            swaped=false; // Ukoliko se ne desi uslov da su se zamenili elementi izlazi iz petlje
            for(int i=0;i<end;i++){
                if(niz[i]>niz[i+1]){    // Ako je element ispred veci od trenutnog
                    swaped=true;        // Dajemo do znanja da se zamena izvrsila
                    int temp=niz[i];
                    niz[i]=niz[i+1];    // Zamenjivanje promenljivih
                    niz[i+1]=temp;
                }
            }
            end-=1; //Smanjujemo gornju granicu niza
        }
        for(int i=0;i<niz.length;i++){
            System.out.print(niz[i]+" ");
        }
    }
}       // TIME COMPLEXITY O(n^2)
