package lll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClientRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		BufferedReader br = null;
		
		int port = 5555;
		String trueLove = "♡Ο-łł 살고 ♡Ο-łł 죽는⊂ŀ_☆";
		Socket socket = null;

		try {
			String serverIp = InetAddress.getLocalHost().getHostAddress();
			socket = new Socket(serverIp, port);
			System.out.println(trueLove + "님의 채팅방에 접속하셨습니다.");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			String msg = null;
			
			// 조건문 추가
			while ((msg = br.readLine())!=null) {
				if(msg.equals("안녕...")) {
					break;
				}
				System.out.print(trueLove + "님에게 보낼 메세지 : "+msg);

				String send = sc.nextLine();

				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[a hh:MM:ss]");
				String time = sdf.format(d);

				pw.println(time + send);
				pw.flush();

				String message = br.readLine();
				System.out.println(trueLove + "님에게 받은 메세지 : " + message);
			}
			System.out.println("채팅이 종료되었습니다.");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				pw.close();
				br.close();
				socket.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}

}