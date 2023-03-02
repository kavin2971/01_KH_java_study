package langPackage01.stringBuffer_Builder;

public class StringBuffer02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("010");
		System.out.println("capacity : " + sb.capacity());
		//맨뒤에 부착
		sb.append("1111");
		System.out.println(sb);
		
		//원하는 index에 글자 삽입
		sb.insert(3, "-");
		System.out.println(sb);
		
		//원하는 index에 글자 삭제
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//맨뒤에 부착
		sb.append("9999");
		sb.insert(3,"-");//원하는 index에 "-" 추가
		sb.insert(8,"-");//원하는 index에 "-" 추가
		System.out.println(sb);
		
		sb.delete(0, 3);//원하는 index범위 삭제
		System.out.println(sb);
		
		sb.insert(0,"010");//원하는 index 글자삽입
		System.out.println(sb);
		
		sb.replace(4, 8, "5555");//원하는 index 범위의 글자 변경
		System.out.println(sb);
		
		sb.replace(9, sb.length(), "7777");//원하는 index에서 부터 맨뒤까지 변경
		System.out.println(sb);
		
		sb.reverse(); //글자 좌우 뒤집기
		System.out.println(sb); 
		
		sb.reverse(); //글자 좌우 뒤집기
		System.out.println(sb);
		
				

	}

}
