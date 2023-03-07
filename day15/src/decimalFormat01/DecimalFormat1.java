package decimalFormat01;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormat1 {
	public static void main(String[] args) {
		double number = 1234567.89;

		DecimalFormat df = new DecimalFormat("0.000"); // 0이 들어갈경우 한자리는 꼭 나와야한다
		System.out.println(df.format(number));

		System.out.println(new DecimalFormat("0.0").format(4758.948));
		System.out.println("--------------------");
		System.out.println(new DecimalFormat("0").format(number)); // 반올림
		System.out.println(new DecimalFormat("#").format(number)); // 엑셀의#, 
		System.out.println(new DecimalFormat("0.0").format(number)); 
		System.out.println(new DecimalFormat("0.00").format(number));
		System.out.println("--------------------");
		
		number = 36.5;
		System.out.println(new DecimalFormat("00.0℃").format(number));
		number = 243215433;
		System.out.println(new DecimalFormat("\u00A4#,###.#원").format(number));
		System.out.println("--------------------");
		
		number = 1234567.0;
		System.out.println(new DecimalFormat("#.#").format(number)); // 있으면 출력 없으면 출력하지 않음
		System.out.println(new DecimalFormat("0.0").format(number)); // 0은 무조건 그자리는 출력
		System.out.println("--------------------");
		
		number = 1234567.89;
		System.out.println(new DecimalFormat("000000000.0").format(number));
		System.out.println(new DecimalFormat("#########.#").format(number));
		System.out.println("--------------------");
		
		number = 1234567.89;
		System.out.println(new DecimalFormat("#.#-").format(number));
		System.out.println(new DecimalFormat("-#.#").format(number));
		System.out.println(new DecimalFormat("+#.#;-#.#").format(number)); 
		System.out.println("--------------------");
		
		System.out.println(new DecimalFormat("#.#%").format(number));
		System.out.println(new DecimalFormat("\u00A4#,####.#").format(number));
		System.out.println(new DecimalFormat("\\#,###.#").format(number));
		System.out.println("====================");

		//parse() 는 DecimalFormat의 조상인  NumberFormat에 정의되어 있는 메소드
		//Number는 래퍼클래스의 조상 (기본자료형 (int, double, char)을 => Integer, Double 객체화하기 위해 만든 클래스)
		//intValue(), doubleValue()
		
		String stNum = "1,234,567.89";
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		try { // 컴마로 인해 double.parsedouble 이 불가능 문자열을 숫자열로 변경하기 위해선 try,catch문 활용
		Number num = df2.parse(stNum);
		System.out.println(num);
		
		double douNum = num.doubleValue();
		System.out.println(douNum*2);
		
		System.out.println((new DecimalFormat("#,###.##").parse("1,234,567.89").doubleValue())*3);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
