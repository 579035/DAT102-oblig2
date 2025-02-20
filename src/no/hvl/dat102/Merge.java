package no.hvl.dat102;

public class Merge {
	public static void sort(Integer[] a) {
		mergeSort(a, 0, a.length-1);
	}
	
	static void merge(Integer[] a, int venstre, int midt, int hoyre) {
		int n1 = midt - venstre + 1;
	    int n2 = hoyre - midt;
	    int venstreTab[] = new int[n1];
	    int hoyreTab[] = new int[n2];
	    for (int i = 0; i < n1; ++i) {
	    	venstreTab[i] = a[venstre + i];
	    }
	    for (int j = 0; j < n2; ++j) {
	    	hoyreTab[j] = a[midt + 1 + j];
	    }
	    int i = 0, j = 0;
	    int k = venstre;
	    while (i < n1 && j < n2) {
	    	if (venstreTab[i] <= hoyreTab[j]) {
	    		a[k] = venstreTab[i];
	            i++;
	        } else {
	        	a[k] = hoyreTab[j];
	            j++;
	        }
	            k++;
	        }
	    while (i < n1) {
	    	a[k] = venstreTab[i];
	        i++;
	        k++;
	    }
	    while (j < n2) {
	    	a[k] = hoyreTab[j];
	        j++;
	        k++;
	    }
	}
	static void mergeSort(Integer[] a, int venstre, int hoyre) {
		if (venstre < hoyre) {
			int midt = venstre + (hoyre - venstre) / 2;
	        mergeSort(a, venstre, midt);
	        mergeSort(a, midt + 1, hoyre);
	        merge(a, venstre, midt, hoyre);
	    }
	}
}