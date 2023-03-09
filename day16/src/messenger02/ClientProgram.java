package messenger02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		//String ip = "192.168.20.45"; 김정민
		//String ip = "192.168.20.123"; 방승환
		
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		
		try {
			int port = 3005;
			String ip = InetAddress.getLocalHost().getHostAddress();
			Scanner sc = new Scanner(System.in);
			
			// 1. 서버에 연결 요청
			socket = new Socket(ip, port);
			System.out.println("서버와 연결 성공");
			
			// 2. 입출력 스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			// 서버로 부터 온 환영 메세지 출력
			System.out.println("서버 : " + br.readLine());
			
			while (true) {
				
				System.out.print("클라이언트 : ");
				pw.println(sc.nextLine());
				pw.flush();
				
				System.out.println("서버 : " + br.readLine());
				
			}
			
		    }catch (UnknownHostException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
	}

}
