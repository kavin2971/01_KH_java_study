package messenger04;

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
		
		try {
			
			int port = 3005;
			String ip = InetAddress.getLocalHost().getHostAddress();
			Scanner sc = new Scanner(System.in);
			
			try(Socket socket = new Socket(ip, port)){
			System.out.println("서버와 연결 성공");
			
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
			/*		System.out.println("서버 🧔 : " + br.readLine());
			
					while (true) {
				
					System.out.print("클라이언트 👩 : ");
					String sendMsg = sc.nextLine();
					pw.println(sendMsg);
					pw.flush();
					
					if(sendMsg.equals("exit"))
						break;
					System.out.println("서버 🧔 : " + br.readLine());
					}
					*/
					
					String msg = null;
					while((msg = br.readLine())!=null) {
						if(msg.equals("exit")) {
							System.out.println("채팅을 종료했어유");
							break;
						}
						System.out.println("서버 👨 : " + msg);
						
						System.out.print("클라이언트 👩 : ");
						String sendMsg = sc.nextLine();
						pw.println(sendMsg);
						pw.flush();
						
						if(sendMsg.equals("exit"))
							break;
					}
					System.out.println("서버와 연결을 해제함");
				}
			}
	    }catch (UnknownHostException e) {
				e.printStackTrace();
		}catch (IOException e) {
				e.printStackTrace();
		}
			
	}

}
