package no.hvl.dat102;

import java.util.Random;

public class TabellGenerator {
	
	long seed = 1740066900;
	Random tilfeldig = new Random(seed);
	int n = 32000;
	int antall = 10;
	Integer[][] a = new Integer[antall][n];
	
	public TabellGenerator() {
		for (int i = 0; i < antall; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = tilfeldig.nextInt();
			}
		}
	}
}