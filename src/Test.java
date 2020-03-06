import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
    		ArrayList<String> al = new ArrayList<String>();
    		al.add("Nisha");
    		al.add("Manisha");
    		
    		System.out.println(al);
    		
    		al.add(1, "Manisha Garg");
    		System.out.println(al);
    		
    		double rand = Math.random();
    		System.out.println(rand);
    		System.out.println(rand*al.size());
    		int index = (int) (rand * al.size());
    		System.out.println(index);
    		System.out.println(al.get(index));
	}
}


