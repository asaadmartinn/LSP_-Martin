package org.howard.edu.lsp.finalExam;

import org.howard.edu.lsp.finalExam.*;
import static org.junit.Assert.assertEquals;
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
			
			assertEquals(MapUtilities.CommonKeyValuePairs(map1, map2), 2);
			MapUtilities.CommonKeyValuePairs(map1, map2);


	}
}
