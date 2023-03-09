package network01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Network01 {

	public static void main(String[] args) {
//		서버에 요청을 위해서 서버의 ip와 포트번호가 있어야됨
//		InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost); // 내 PC명 + 내 IP주소
			System.out.println("내 PC명 : "+localhost.getHostName());
			System.out.println("내 IP주소 : "+localhost.getHostAddress());
			
			//도메인을 통해서 그 서버에 관련된 정보얻기
			
			InetAddress googleHost = InetAddress.getByName("google.com");
			System.out.println("구글 서버명 : "+googleHost.getHostName());
			System.out.println("구글IP주소 : "+googleHost.getHostAddress());
			
			InetAddress [] naverHost = InetAddress.getAllByName("naver.com");
			System.out.println("네이버호스트의 갯수 : "+ naverHost.length);
			
			for (InetAddress n : naverHost) {
				System.out.println("naver 서버명 : " + n.getHostName());
				System.out.println("naver IP주소 : " + n.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
//		System.out.println("------------------------------------------------");
//		url1();
//		System.out.println("------------------------------------------------");
//		url2();
		System.out.println("------------------------------------------------");
		imageDown();
	}

	static void url1() {
		try {
			URL url = new URL("https://docs.oracle.com:5000/en/java/javase/18/docs/api/java.base/java/net/InetAddress.html?name=kim&age=35#getByName(java.lang.String)");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 이름 : " + url.getHost());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("경로 : " + url.getPath());
			System.out.println("Query : " + url.getQuery());
			System.out.println("페이지 링크 : " + url.getRef());
		System.out.println("--------------------------");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	static void url2() {
		try {
			URL url = new URL("https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/net/InetAddress.html#getByName(java.lang.String)");
			 
			URLConnection conn = url.openConnection();
			
			// 1. 기반스트림 : 응답을 읽을 입력스트림, byte 기반
			
			//InputStream is = conn.getInputStream();
			//InputStreamReader isr = new InputStreamReader(is);	
			//BufferedReader br = new BufferedReader(isr);
		
			// 2. 보조스트림 : BufferedReader사용
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new FileWriter("inetAddress.html"));
			
			String data = null;
			
			while((data = br.readLine())!= null) {
				System.out.println(data);
				bw.write(data);
				bw.newLine(); // 개행처리
			}
			
			
			
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void imageDown() {
		try {
			URL url = new URL("https://www.google.com/logos/doodles/2023/international-womens-day-2023-6753651837109578-l.png");
			URLConnection conn = url.openConnection();
			
			BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("image.png"));
		
			byte[] data = new byte[8*1024];
		
			int len = 0;
			
			while ((len = bis.read(data)) != -1) {
				System.out.println(Arrays.toString(data));
				bos.write(data,0,len);
			}
			
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
