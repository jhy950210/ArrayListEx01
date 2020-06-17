import java.util.ArrayList;

public class ArrayListEx01 {
	// 깃 변경사항
	public static void main(String[] args) {
		// 기본 버퍼
		ArrayList al1 = new ArrayList();
		// 100 버퍼
		ArrayList al2 = new ArrayList(100);
		
		al1.add("홍길동"	);
		
		String str = "홍길동";
		al1.add((Object)str);
		Object obj = str;
		al1.add(obj);
		al1.add("박문수");
		
		System.out.println(al1.size());
		
//		Object obj2 = al1.get(0);
//		String rstr = (String)obj2;
//		String rstr = (String)al1.get(0);
//		System.out.println(rstr);
//		System.out.println((String)al1.get(1));
		
//		for( int i=0; i<al1.size(); i++ ) {
//			System.out.println(al1.get(i));
//		}
		
//		for( Object o : al1 ) {
//			System.out.println((String)o);
//		}
		
		// 특정 위치에 삽입
		al1.add(1, "월매");
//		
//		for( Object o : al1 ) {
//			System.out.println((String)o);
//		}
//		
		// 수정
		al1.set(0, "방자");
		
		for( Object o : al1 ) {
			System.out.println((String)o);
		}
		
		// 삭제
		al1.remove(0);
		
		for( Object o : al1 ) {
			System.out.println((String)o);
		}
		
		al1.clear();
		System.out.println(al1.size());
	}

}
