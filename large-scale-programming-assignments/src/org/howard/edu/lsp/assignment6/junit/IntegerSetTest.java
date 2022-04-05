package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;


import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	@Test
	@DisplayName("IntegerSet.isEmpty test cases")
	public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet();
		assertTrue(set1.isEmpty());
		
		set1.add(1);
		assertFalse(set1.isEmpty());
	}
	
	@Test
	@DisplayName("IntegerSet.union test cases")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		set1.addItem(1);
		set1.addItem(2);
		
		Integer Set set2 = new Integer Set();
		set2.add(3);
		
		set1.union(set2);
		
		System.out.println(set1.toString());
		assertEquals("[1, 2, 3]", set1.toString());
		assertNotEquals("[3, 2, 1]", set1.toString());
		
		
		
		
	}

}
