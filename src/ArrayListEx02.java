import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("박문수", 40);
		Person p3 = new Person("임꺽정", 50);
		
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(p2);
	
		al.add(p3);
		
//		Person p = (Person)al.get(2);
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
		
		// 향상된 for
		for( Object o : al ) {
			Person p = (Person)o;
			System.out.println(p.getName());
			System.out.println(p.getAge());
		}
	}
}
