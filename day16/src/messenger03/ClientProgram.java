package messenger03;

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
			System.out.println("남자 🧔 server : " + br.readLine());
			
			while (true) {
				
				System.out.print("여자 👩 client: ");
				pw.println(sc.nextLine());
				pw.flush();
				System.out.println("남자 🧔 server: " + br.readLine());
			}
			}
			}
		    }catch (UnknownHostException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
