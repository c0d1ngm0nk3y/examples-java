package examples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneralTest {

	@Test
	public void by2True() {
		assertTrue(General.isDividableBy(4, 2));
	}

	@Test
	public void by3False() {
		assertFalse(General.isDividableBy(8, 3));
	}

	@Test
	public void by256True() {
		assertTrue(General.isDividableBy(1024, 256));
	}

	@Test
	public void by256False() {
		assertFalse(General.isDividableBy(1025, 256));
	}

	@Test
	public void equalsInteger() {
		assertFalse(Integer.valueOf(1024) == Integer.valueOf(1024));
	}

	@Test
	public void blackTea() throws Exception {
		assertEquals(100, General.getTeaTemperature("BLACK"));
	}

	@Test
	public void blackTeaMixedCase() throws Exception {
		assertEquals(100, General.getTeaTemperature("Black"));
	}

	@Test
	public void herbalTeaNewString() throws Exception {
		assertEquals(100, General.getTeaTemperature(new String("HERBAL")));
	}

	@Test
	public void greenTea() throws Exception {
		assertEquals(80, General.getTeaTemperature("GREEN"));
	}

	@Test
	public void emptySum() throws Exception {
		assertEquals(BigInteger.ZERO, General.sum(new ArrayList<Integer>()));
	}

	@Test
	public void smallSum() throws Exception {
		var ints = new ArrayList<Integer>();
		ints.add(12);
		ints.add(13);
		ints.add(25);
		assertEquals(BigInteger.valueOf(50), General.sum(ints));
	}
}
