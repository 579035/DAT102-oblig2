package no.hvl.dat102;

public class ParentesSjekker {
	
	private LenketStabel<Character> ParentesStabel;
	
	public ParentesSjekker() {
		super();
		ParentesStabel = new LenketStabel<Character>();
	}
	
	
	public boolean sjekkParenteser(String s) {
		char[] charTab = s.toCharArray();
		for (int i = 0; i < charTab.length; i++) {
			if (erStartParentes(charTab[i])) {
				ParentesStabel.push(charTab[i]);
			} else if (erSluttParentes(charTab[i])) {
				if (erParentesPar(ParentesStabel.peek(), charTab[i])) {
					ParentesStabel.pop();
				} else {
					return false;
				}
			}
		
		}
		
		return ParentesStabel.isEmpty();
	}
	public boolean erStartParentes (char c) {
		return c == '{' || c == '(' || c == '[' || c == '<';
	}
	public boolean erSluttParentes (char c) {
		return c == '}' || c == ')' || c == ']' || c == '>';
	}
	boolean erParentesPar(char start, char slutt) {
		if (start == '{') {
			return slutt == '}';
		}
		if (start == '(') {
			return slutt == ')';
		}
		if (start == '[') {
			return slutt == ']';
		}
		if (start == '<') {
			return slutt == '>';
		} return false;
	}
}