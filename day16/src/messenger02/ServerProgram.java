package messenger02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * * TCP (Transmission Control Protocol)
 *  - 서버, 클라이언트 간의 1:1 소켓통신
 *  - 서버와 클라이언트 간의 연결이 되어있어야 통신가능
 *  - 신뢰성 있는 데이터 전달
 *  
 * * Socket 
 *  - 프로세스간의 통신을 담당
 *  - Input/OutputStream을 가지고 있음 (이스트림에서 입출력이 이루어짐)
 *  
 * * ServerSocket
 *  - 포트와 연결(Bind) 되어 외부의 연결 요청을 기다리다 연결요청이 오면 수락해주는 용도
 *    수락 => 통신할 수 있는 Socket생성
 */

public class ServerProgram {

	public static void main(String[] args) {
		// 1. 포트지정
		int port = 3005;
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;	 // 입력용 스트림
		PrintWriter pw = null; 		 // 출력용 스트림
		
		ServerSocket server = null;  
		
	
		
		try {
		// 2. ServerSocket  객체 생성시 포트 결합
			server = new ServerSocket(3005);
			
		// 3. 클라이언트로 부터 연결 요청이 오면 수락하고, 통신할 수 있는 소켓 객체생성
			System.out.println("\"클라이언트의 요청을 기다리고 있습니다...\"");
			
			Socket socket = server.accept();         // 수락
			System.out.println(socket.getInetAddress().getHostAddress()+ "가 연결을 요청함!!");

		// 4. 기반 스트림	
		//	InputStream is = socket.getInputStream();
		//	OutputStream os = socket.getOutputStream();
			
		// 5. 보조 스트림	
		//	br = new BufferedReader(new InputStreamReader(is));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			pw.println("\"🎉 환영합니다 🎉\""); // 윈도우표시+ . 누르면 특수문자 이모티콘 사용가능

			pw.flush();  // 현재 버퍼에 있는 스트림을 강제로 보내고 버퍼를 비움
			
			while(true) {
				// 클라이언트 측으로 부터 받은 메세지
				System.out.println("클라이언트 : " + br.readLine());
				
				// 서버에서 클라이언트 측으로 보내는 메세지
				System.out.print("서버 : " );
				pw.println(sc.nextLine());
				pw.flush();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				br.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}



