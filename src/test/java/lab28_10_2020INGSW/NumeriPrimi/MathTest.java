package lab28_10_2020INGSW.NumeriPrimi;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
	
	private static Math math;
	
	@BeforeClass
	public static void prepare() {
		math = new Math();
	}
	
	@Test
	public void generaNumeriPrimiWorks() {
		//qui vogliamo che ci da la lista vuota
		assertEquals(new LinkedList<>(),math.generaNumeriPrimi(1));
		assertEquals(Arrays.asList(2,3,5,7,11,13,17,19,23,29) ,math.generaNumeriPrimi(30));
		
	}
	
	@Test
	public void numeroPrimoWorks() {
		assertFalse(math.numeroPrimo(9));
		assertFalse(math.numeroPrimo(1));
		assertTrue(math.numeroPrimo(2));
		List<Integer> primi = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
		for(int primo: primi) {
			assertTrue(math.numeroPrimo(primo));
		}
	}
	
}
