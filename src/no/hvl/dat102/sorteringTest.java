package no.hvl.dat102;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class sorteringTest {
	Integer[] start = new Integer[]{3, 4, 7, 8, 5, 9, 0, 1, 2, 6};
	Integer[] test = start;
	Integer[] svar = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

	@BeforeEach
	void setUp() {
		test = start;
	}
	
	@Test
	void testInsertionSort() {
		Insertion.sort(test);
		for (int i = 0; i < test.length;i++) {
			assertEquals(test[i], svar[i]);
		}
	}
}
