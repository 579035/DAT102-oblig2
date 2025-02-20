package no.hvl.dat102;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import no.hvl.dat102.ParentesSjekker;

public class ParentesSjekkerTest {
	
	private ParentesSjekker sjekker;

	@BeforeEach
	void setUp() {
    sjekker = new ParentesSjekker();
	}

	@Test
	void testGyldigeParenteser() {
		assertTrue(sjekker.sjekkParenteser("{[()]}"));
	}

	@Test
	void testManglerSluttParentes() {
		assertFalse(sjekker.sjekkParenteser("{[()}"));
	}

	@Test
	void testManglerStartparantes() {
		assertFalse(sjekker.sjekkParenteser("[()]}"));
	}

	@Test
	void testFeilRekkefølge() {
		assertFalse(sjekker.sjekkParenteser("{[(])}"));
	}

	@Test
	void testHelloWorld(){
		String javaprogram = """
			class HelloWorld {
				public static void main(String[] args) {
					System.out.println("Hello World!");
				}
			}
			""";
		assertTrue(sjekker.sjekkParenteser(javaprogram));
		
	}
}
