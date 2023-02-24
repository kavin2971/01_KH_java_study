package staticVari02;

public class Product {
	
	static int count;
	int proNo = 20230000;
	
//	{
//		++count;     동일하다
//		proNo = count;
//	}
	Product(){
		++count;
		proNo += count;
	}

}
