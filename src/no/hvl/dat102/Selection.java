package no.hvl.dat102;

public class Selection {
	
	public static void sort(Integer[] a) {
		int n = a.length;
        for (int i = 0; i < n - 1; i++) {
          
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
	}
}
