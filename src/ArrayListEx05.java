import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("name", "홍길동");
		hm1.put("age", "20");
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("name", "박문수");
		hm2.put("age", "30");
		HashMap<String, String> hm3 = new HashMap<String, String>();
		hm3.put("name", "임꺽정");
		hm3.put("age", "40");
		
		ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String,String>>();
		al.add(hm1);
		al.add(hm2);
		al.add(hm3);
		
		for( HashMap<String, String> str : al ) {
			System.out.println( str.get("name") );
			System.out.println( str.get("age") );
		}
	}

}
