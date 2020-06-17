import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "홍길동";
		String str2 = "박문수";
		String str3 = "임꺽정";
		
		ArrayList al1 = new ArrayList();
		al1.add(str1);
		al1.add(str2);
		al1.add(str3);
		
		for( Object o : al1 ) {
			System.out.println((String)o);
		}
		
		//Generic
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add(str1);
		al2.add(str2);
		al2.add(str3);
		
		for( String str : al2 ) {
			System.out.println(str);
		}
		
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("박문수", 40);
		Person p3 = new Person("임꺽정", 50);
		
		// Generic
		ArrayList<Person> p = new ArrayList<Person>();
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		for( Person ps : p ) {
			System.out.println(ps.getName());
			System.out.println(ps.getAge());
		}
	}

}
