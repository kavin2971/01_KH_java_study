package ex;

public class Ex0001 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 50;
		
		
		
		int box[] = new int[a];
		
		System.out.print("Random으로 "+a+"개의 숫자를 추출하고 섞어서 "+b+"개의 숫자만 추출해보세요");
		System.out.println("\n----------------------------------------");
		
		
		for (int i=0; i<box.length; i++) {
			box[i] = i+1;  // 1~45
		}
		
		int random = 0;
		
		for (int i=0; i<b; i++) {
			int number = (int)(Math.random()*a);
			
			random = box[i];
			box[i]=box[number];
			box[number] = random;
			
		}
		
		for (int i=0; i<b; i++)
			System.out.print(box[i] + ", ");
		System.out.print("\n----------------------------------------");
		
		
		int box1[] = new int[a];
		
		
		System.out.println(" ");
		
		for (int i=0; i<box.length; i++) {
			box1[i] = i+1;
		}
		
		int random1 = 0;
		
		for (int i=0; i<b; i++) {
			int number1 = (int)(Math.random()*a);
			
			random1 = box1[i];
			box1[i]=box1[number1];
			box1[number1] = random1;
			
		}
		
		for (int i=0; i<b; i++)
			System.out.print(box1[i] + ", ");
		System.out.print("\n----------------------------------------");
		
		
		
		int box2[] = new int[a];
		
		
		System.out.println(" ");
		
		for (int i=0; i<box.length; i++) {
			box2[i] = i+1;
		}
		
		int random2 = 0;
		
		for (int i=0; i<b; i++) {
			int number2 = (int)(Math.random()*a);
			
			random2 = box2[i];
			box2[i]=box2[number2];
			box2[number2] = random2;
			
		}
		
		for (int i=0; i<b; i++)
			System.out.print(box2[i] + ", ");
		System.out.print("\n----------------------------------------");
		                    

	}

}
