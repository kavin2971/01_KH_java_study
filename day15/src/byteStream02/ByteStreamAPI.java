package byteStream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamAPI {
	
	public void fileSave() {

	FileOutputStream fout = null;
	
	try {
		
		fout = new FileOutputStream("a_byte.txt");
		
		fout.write(97);
		fout.write('b');
		
		byte[] arr = {99,100,101};
		fout.write(arr);
		
		fout.write(arr, 1, 2);
		
	//	fout.write('랑'); 2byte 는 깨져서 들어감
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}finally {
				try {
					fout.close();
				}catch (IOException e ) {
					e.printStackTrace();
				}
			}
		}
	//Program <-- file 입력 ( data 가져오기)
	
	public void fileRead() {
		//FileInputStream : 파일로 부터 1byte 단위로 입력받는 스트림

		FileInputStream fin = null;
		
		try {
			
		fin = new FileInputStream("a_byte.txt");
/*
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println(fin.read());
		System.out.println(fin.read());
		
		System.out.println(fin.read());
	*/	
		
	/*	
		//fin.read() 2번씩 호출되기 때문에 하나 건너씩 출력이됨
		while(fin.read() != -1) {
			System.out.println(fin.read());
		}
		*/
		// 해결방법 1. 무한반복을 돌면서 매번 검사
		
		/*
		   while(true) { int value = fin.read(); if (value == -1) break;
		   System.out.println(value); }
		 */
		
		int value = 0;
		while((value = fin.read()) != -1) {
			System.out.println((char)value);
			
			
		}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
		    e.printStackTrace();
		}
	}
}


















