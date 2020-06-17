import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx04 {
	List<Object> list = new ArrayList<>();
	List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
	
	public void createTest() {
		list.add("Hello");
		list.add("Hello");
		list.add(null);
		list.addAll(integers);
		list.add(integers);
		list.add(0, new Object());
		System.out.println("추가 후 내용 출력: " + list);
	}
	
	public void retrieveTest() {
		// 반복을 이요한 요소 조회
		for( int i=0; i<list.size(); i++ ) {
			System.out.println(i + " : " + list.get(i));
		}
		// 포함 여부의 활용
		if(list.contains("Hello")) {
			System.out.println("Hello의 위치는: " + list.indexOf("Hello"));
		}
		// 서브 리스트 활용
		List<Object> sub = list.subList(3, 5);
		System.out.println("sub의 내용: " + sub);
		System.out.println("sub의 내용을 다 가지고 있는가? " + list.containsAll(sub));
		
	}
	
	public void updateTest() {
		list.set(1, "updated");
		System.out.println("업데이트 후: " + list);
	}
	
	public void deleteTest() {
//		list.remove(0);
//		list.remove("Hello");
		// 타입이 Integer인 경우 삭제
		for(int i = 0; i<list.size(); i++) {
			
			if(list.get(i) instanceof Integer ) {
				list.remove(i);
				
			}
		}
		System.out.println("삭제 후: " + list);
		list.clear();
		System.out.println("초기화 후: " + list);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListEx04 alt = new ArrayListEx04();
		alt.createTest();
		alt.retrieveTest();
		alt.updateTest();
		alt.deleteTest();
	}

}
