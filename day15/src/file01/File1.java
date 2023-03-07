package file01;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		//경로를 지정하지 않고 파일만들기
		
		try {
			
			File folder1 = new File ("d:/C1");
					folder1.mkdir();
			File file1 = new File("d:/C1/test.txt");
					file1.createNewFile();
			File file2 = new File("d:/C1/test1.txt");
					file2.createNewFile();
			File file3 = new File("d:/C1/test2.txt");
					file3.createNewFile();
					
					file3.delete();
					
					
		File f1 = new File("text.txt");
			f1.createNewFile();
			
		// 존재하고 있는 폴더에 파일 생성 : 경로지정	
//		File f2 = new File("D:\\text.txt");
		File f2 = new File("D:/text.txt");
			f2.createNewFile(); // 반드시 메소드호출
			
		//폴더 만들기
			File tempfolder = new File("D:/temp");
			tempfolder.mkdir(); //폴더생성
			
			File f3 = new File("D:/temp/text.txt");
			f3.createNewFile(); // 반드시 메소드호출
		
			System.out.println(f1.exists());  //file 존재여부
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile()); //file 인지 아닌지
			System.out.println(tempfolder.isFile());
			System.out.println("-----------------");
			
			File  folder = new File("parent"); // 경로지정 하지 않으면 해당프로젝트 폴더에 생성됨
			folder.mkdir();
			
			File file = new File("parent/person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
