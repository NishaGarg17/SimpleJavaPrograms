import java.util.HashMap;

public class FirstRepetitiveCharInString {

	public static void main(String[] args) {
		String str = InputOutput.input();
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		if(str.contains(" ")) {
			str = str.replaceAll(" ", "");
		}
		
		for(int i = 0; i < str.length(); i++) {
			String ch = str.charAt(i) + "";
			
			// check if key is present in the map, if not present increment by 1
			Integer a = map.containsKey(ch) ? map.put(ch, map.get(ch) + 1) : map.put(ch, 1);
			
			System.out.println("Map is: " + map);
			if(map.get(ch) > 1) {
				System.out.println("The first repetitive character is: " + ch);
				break;
			}
		}
		

	}

}
