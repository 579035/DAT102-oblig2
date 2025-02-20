package no.hvl.dat102;

public class Insertion {
	
	public static void sort(Integer[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int nøkkel = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > nøkkel) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = nøkkel;
		}
	}

}
