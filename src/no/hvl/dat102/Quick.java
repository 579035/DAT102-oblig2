package no.hvl.dat102;

public class Quick {
	
	public static void sort (Integer[] a) {
		quickSort(a, 0, a.length-1);
	}
	
	static void quickSort(Integer[] a, int lav, int hoy) {
		if (lav < hoy) {
			int n = deling(a, lav, hoy);
			quickSort(a, lav, n-1);
			quickSort(a, n+1, hoy);
		}
		
	}
	static int deling(Integer[] a, int lav, int hoy) {
        
        int pivot = a[hoy];
        int i = lav - 1;
        for (int j = lav; j <= hoy - 1; j++) {
            if (a[j] < pivot) {
                i++;
                bytt(a, i, j);
            }
        }
        bytt(a, i + 1, hoy);  
        return i + 1;
    }
	static void bytt (Integer[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
