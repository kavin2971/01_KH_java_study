package langPackage01.Math03;

public class Math1 {

	public static void main(String[] args) {
		// 절대값
		System.out.println("-11의 가까운 정수값"+Math.abs(-11));
		System.out.println("-11.13의 가까운 소수값"+Math.abs(-11.13));
		System.out.println("------------------");
		
		// 소수점이하 무조건 올림
		System.out.println("13.1의 모조껀 올림 값"+Math.ceil(13.1));
		System.out.println("-13.1의 모조껀 올림 값"+Math.ceil(-13.1));
		System.out.println("------------------");
		
		// 소수점이하 무조건 내림
		System.out.println("13.8의 모조껀 내림 값"+Math.floor(13.8));
		System.out.println("-13.8의 모조껀 내림 값"+Math.floor(-13.8));
		System.out.println("------------------");
		
		// 가장 가까운 정수값 반환
		System.out.println("13.1의 가까운 정수값"+Math.rint(13.1));
		System.out.println("13.9의 가까운 정수값"+Math.rint(13.9));
		System.out.println("13.5의 가까운 정수값"+Math.rint(13.5));
		System.out.println("-13.1의 가까운 정수값"+Math.rint(-13.1));
		System.out.println("-13.9의 가까운 정수값"+Math.rint(-13.9));
		System.out.println("------------------");
		
		// 소수점 이하 반올림
		System.out.println("13.6의 반올림"+Math.round(13.6));
		System.out.println("13.1의 반올림"+Math.round(13.1));
		System.out.println("13.5의 반올림"+Math.round(13.5));
		System.out.println("-13.6의 반올림"+Math.round(-13.6));
		System.out.println("-13.1의 반올림"+Math.round(-13.1));
		System.out.println("------------------");
		
		// 둘중 작은수, 큰수
		System.out.println("7과 8중 큰 숫자 : " + Math.max(7, 8));
		System.out.println("7과 8중 작은 숫자 : " + Math.min(7, 8));
		System.out.println("7.345과 8.545중 큰 숫자 : " + Math.max(7.345, 8.545));
		System.out.println("7.345과 8.545중 작은 숫자 : " + Math.min(7.345, 8.545));

	}

}
