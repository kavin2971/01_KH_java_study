package messenger03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	public static void main(String[] args) {
		int port = 3005;
		Scanner sc = new Scanner(System.in);
		try {
			try(ServerSocket server = new ServerSocket(port)){
			System.out.println("\"🚗=3 클라이언트의 요청을 기다리고 있습니다... 🚗=3\"");
			Socket socket = server.accept();        
			System.out.println(socket.getInetAddress().getHostAddress()+ "가 연결을 요청함!!");

			try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));PrintWriter pw = new PrintWriter(socket.getOutputStream());){
			
			pw.println("\"🎉 환영합니다 🎉\""); 
			pw.flush(); 
			
				while(true) {
			
					System.out.println("여자 👩 client: "+ br.readLine());
					System.out.print("남자 🧔 server: " );
					pw.println(sc.nextLine());
					pw.flush();
				}
			}	
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}



