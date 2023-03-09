package lll;

/*		단, 실행클래스는 정상적으로 작성되어 실행에는 문제가 없음
		실행 흐름
		1. 서버와 클라이언트는 같은 PC에서 동작하기 위해 본인 pc 아이피를 사용한다. (서버 아이피는 192.168.50.5라고 가정한다)
		2. 서버가 먼저 실행되어 클라이언트의 접속을 기다린다.
		3. 클라이언트가 서버에 접속하여 연결이 완료되면 서버에 클라이언트 접속확인 메시지가 출력된다.
		4. 클라이언트는 접속을 성공하면 서버에 현재 시스템 시간을 이용하여 시간을 구한뒤 메세지에 함께 보낸다.단, 보내는 시간의 형식은 [오전/오후 시간:분:초] 형식이다. 
		   ex)17:39:57초 이면 오후 05:39:57로 나타나도록 한다
		5. 서버는 클라이언트에게 받은 메세지를 화면에 출력한뒤 클라이언트에게 보낼 메세지를 작성한다.
		6. 클라이언트가 "안녕..."을 입력하면 채팅을 종료한다.(단, 서버에서는 먼저 종료하지 않아도 된다)
		- 채팅서버 소스코드
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServerRun {

	public static void main(String[] args) {
		
		int port = 5555;
		Scanner sc = new Scanner(System.in);

		
		PrintWriter pw = null;
		BufferedReader br = null;
		ServerSocket server = null;
		Socket socket = null;

		try {
			server = new ServerSocket(port);

			System.out.println("\"연락오기 기다리는중...\"");
// ""삭제 
			socket = server.accept();
          
			String myLove = "ハŀㄹБ은언ス-łłㄴŀ목ㅁŀ르⊂ŀ….";

			System.out.println(myLove+"님이 채팅방에 접속하셨습니다.");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			
			while(true) {
				
				String message = br.readLine();
				
                          // (message!=null) 수정
				if(message!=null) {

					System.out.println(myLove+"님이 보낸 메세지 : "+message);

					System.out.print(myLove+"님에게 보낼 메세지 : ");

					String send = sc.nextLine();

					Date d = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("[a:hh:MM:ss]");
					String time = sdf.format(d);
					
					pw.println(time+send);
					pw.flush();

				}
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {          

			
try {
	pw.close();
	br.close();
	server.close(); 
	
} catch (IOException e) {
	e.printStackTrace();
}
//			socket.close(); 삭제
			// try catch 문 추가	       

		}

	}

}