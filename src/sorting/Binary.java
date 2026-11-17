package sorting;

public class Binary {

    public void search(int[] niz,int target){
        int velicina= niz.length;
        int low=0;              // Dodajemo promenljive high i low da pratimo interval gde se moguce nalazi target
        int high=velicina-1;

        while (low <= high){
            int mid=low + (high-low)/2;

            if(niz[mid] == target){
                System.out.println("Nadjen broj na indexu "+ mid);
                return;
            } else if (niz[mid] < target) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        System.out.println("Target nije pronadjen");
        return;


    }
}
