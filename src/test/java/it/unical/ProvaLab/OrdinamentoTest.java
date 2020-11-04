package it.unical.ProvaLab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class OrdinamentoTest {
	
	private static Ordinamento o;
	private static ArrayList<Integer> l1;
	
	
	@BeforeClass
	public static void prepare() {
		o = new Ordinamento();
		l1 = new ArrayList<>();
		l1.add(5);
		l1.add(3);
		l1.add(1);
		l1.add(8);
		l1.add(4);
		System.out.println("before");
	}
	
	@Test
	public void testCrescente(){
		assertEquals(Arrays.asList(1,3,4,5,8), o.MyListUtil(l1, 5));
	}
	
	@Test
	public void testDecrescente(){
		assertEquals(Arrays.asList(8,5,4,3,1), o.MyListUtil(l1, 22));
	}
}
