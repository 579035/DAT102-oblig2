package no.hvl.dat102;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random tilfeldig = new Random();
		int n = 256000;
		int antall = 10;
		Integer[][] a = new Integer[antall][n];
		
		for (int i = 0; i < antall; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = tilfeldig.nextInt();
			}
		}
		long startTid = System.nanoTime();
		for (int i = 0; i < antall; i++) {
			Quick.sort(a[i]);
		}		
		long snittLengde = (System.nanoTime()-startTid)/antall;
		long snittLengdeMs = snittLengde/1000000; //konvertering fra nanosekunder till millisekunder
		System.out.println("Snittlengde: "+snittLengdeMs+" ms");
	}

}
