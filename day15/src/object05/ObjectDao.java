package object05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectDao {
   // 프로그램 --> 파일로 출력
	
	public void fileSave() {
		Phone ph = new Phone("i-Phone'14프로'", 1800000);
		
		// FileOutputStream : 1byte 기반 스트림
		// ObjectOutputSteam : 객체 단위로 출력할 수 있도록 도움을 주는 보조 스트림
		//                      (ObjectWriter 없음)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			oos.writeObject(ph);
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException e) {
		    e.printStackTrace();
		}
				
	}
}
