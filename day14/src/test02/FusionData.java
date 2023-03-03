package test02;

public class FusionData {
	
	void stuAdd() {
		
	
     

	Student[] fusionStudent = new Student[5];
	fusionStudent[0] = new Student("20230001","홍길동",98,"서울특별시","010-1111-2222",true);
	fusionStudent[1] = new Student("20230002","김길동",99,"강원도","010-2222-3333",true);
	fusionStudent[2] = new Student("20230003","최길동",97,"충청북도","010-3333-4444",false);
	fusionStudent[3] = new Student("20230004","박길동",95,"전라남도","010-4444-5555",true);
	fusionStudent[4] = new Student("20230005","이길동",92,"경상남도","010-6666-7777",false);
	
	for (int i=0; i<fusionStudent.length; i++) {
		Student stu = fusionStudent[i];
//		System.out.println(stu);
		
		System.out.println(stu.getAddress()+"\t"+stu.getName()+"\t"+stu.getScore()+"\t"+stu.getStuNo()+"\t"+stu.getTel());
	}
	
//	System.out.println(fusionStudent[0].getStuNo());
//	System.out.println(fusionStudent[0].getName());
//	System.out.println(fusionStudent[0].getAddress());
//	System.out.println(fusionStudent[0].getScore());
//	System.out.println(fusionStudent[0].getTel());
//	System.out.println(fusionStudent[0].toString());
	
	}
}
