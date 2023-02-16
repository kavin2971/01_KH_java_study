package breakConti02;

public class Naming04 {

	public static void main(String[] args) {
		// 반복문에 이름을 붙여주고
		// break or continue는 빠져나오고자하는 반복문의 이름을 기재한다.
		Stop1 : for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i==2)
					break Stop1;
					// continue Stop1;
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println("밖의 for문 종료");
	}
}
