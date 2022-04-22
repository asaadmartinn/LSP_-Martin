package org.howard.edu.lsp.finalExam;

import org.howard.edu.lsp.finalExam.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapUtilitiesTest {
	@Test
	@DisplayName("MapUtilities.equals key/value")
	public void testKeyValue() throws NullMapException {HashMap<String, String> map1= new HashMap<>();
			map1.put("Alice", "Healthy");
			map1.put("Mary", "Ecstatic");
			map1.put("Bob", "Healthy");
			map1.put("Chuck", "Fine");
			map1.put("Felix", "Sick");
			
			
			HashMap<String, String> map2= new HashMap<>();
			map2.put("Mary", "Ecstatic");
			map2.put("Felix", "Healthy");
			map2.put("Ricardo", "Subperb");
			map2.put("Tam", "Fine");
			map2.put("Bob", "Happy");
			
			System.out.println(map1);
			System.out.println(map2);
			
			assertEquals(MapUtilities.CommonKeyValuePairs(map1, map2), 1);

	}
	
		@Test
		@DisplayName("MapUtilities.isempty")
		
		public void testKeyValue1() throws NullMapException {HashMap<String, String> emptymap1= new HashMap<>();
		assertTrue(emptymap1.isEmpty());
				
				HashMap<String, String> emptymap2= new HashMap<>();
				assertTrue(emptymap2.isEmpty());
				
		}
				
	
		
		
		
		@Test
		@DisplayName("MapUtilities.notequals key/value")
		public void testKeyValue3() throws NullMapException {HashMap<String, String> map3= new HashMap<>();
				map3.put("Alice", "Healthy");
				map3.put("Mary", "Unhealthy");
				map3.put("Bob", "Healthy");
				map3.put("Chuck", "Fine");
				map3.put("Felix", "Sick");
				
				
				HashMap<String, String> map4= new HashMap<>();
				map4.put("Mary", "Ecstatic");
				map4.put("Felix", "Healthy");
				map4.put("Ricardo", "Subperb");
				map4.put("Tam", "Fine");
				map4.put("Bob", "Happy");
				
				assertEquals(MapUtilities.CommonKeyValuePairs(map3, map4), 0);

		}
				
				
	
}
