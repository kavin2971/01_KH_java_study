package for01;

public class ForMulti07 {

	public static void main(String[] args) {
//		
//		int i=1;
//		int j=1;
//		int x=1, y=1;
//		                            ↓ 표시된 조건식에는 1개의 값만 넣을수있다.  i<=5, j<=10; 실행불가
		for (int i=1, j=10, x=100; i<=10; i++, j--, x+=2) {
			System.out.println("i="+ i + ", j="+ j + ", x="+x);
			
			//for문 안에 변수가 여러개 이어도 된다.
			//단, 조건식은 반드시 1개 여야한다.
		}
			System.out.println("=====================");
	
			int num1 = 10;
			for (;;)	{
				System.out.println(num1);
				num1++;
				if (num1 == 20)
					break; // 반복문을 빠져나올때 사용
			}
		}

	}


