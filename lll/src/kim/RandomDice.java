package kim;

public class RandomDice {
	
	int randomNumber1, randomNumber2 = 0;
	int i, j=0;
	int totalScore1,totalScore2 = 0;
	int sum1, sum2 = 0;
	
	void gameStart(){
		int userBox1[] = new int [20];
		int userBox2[] = new int [20];
		
		for(int i=0; i<userBox1.length;i++) {
			randomNumber1 = (int)(Math.random()*6+1);
			randomNumber2 = (int)(Math.random()*6+1);
		
			userBox1[i] = randomNumber1;
			userBox2[i] = randomNumber2;
			
			if (sum1 >= 20 || sum2 >=20) {
				System.out.println("게임이 종료되었습니다");
				break;
			}
			sum1 += userBox1[i];
			sum2 += userBox2[i];
			
			System.out.println("홍길동의 주사위 값은 " + randomNumber1 + " 입니다"+ " 누적 : "+sum1+"점");
			System.out.println("강감찬의 주사위 값은 " + randomNumber2 + " 입니다"+ " 누적 : "+sum2+"점");
		}
		if(sum1>sum2) {
			System.out.println("홍길동 승!");
		}else {
			System.out.println("강감찬 승!");
		}
			

			
	}
		
		
	
}

	