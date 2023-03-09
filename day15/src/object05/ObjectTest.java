package object05;

public class ObjectTest {

	public static void main(String[] args) {
		ObjectDao dao = new ObjectDao();
//		dao.fileSave();
		dao.fileRead();
// java.io.EOFException "끝이다라는"
//IOException에서 Exception 발생시킴
	}

}
