/*
  QualityKiosk Question
  Q. What will be the output of the following code?
  Answer:
         Value 1,Key 1
         Value 2,Key 2

 */

package trickyPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TrickyCode022 {

	public static void main(String[] args) {

		Map<String, String> abc = new HashMap<>();
		abc.put("Key 1", "Value 1");
		abc.put("Key 2", "Value 2");
		TrickyCode022.iterateMap(abc);

	}

	public static void iterateMap(Map<String, String> abc) {

		for (Entry<String, String> entry : abc.entrySet()) {
			System.out.println(entry.getValue() + "," + entry.getKey());
		}

	}

}
