package test02;
// 자바 빈 + 생성자 + toString(오버라이딩)
public class Student {


		private String stuNo;
		private String name;
		private int score;
		private String address;
		private String tel;
		private boolean license;
		
		public Student(){}
		
		public Student(String stuNo, String name, int score, String address, String tel, boolean license) {
			super();
			this.stuNo = stuNo;
			this.name = name;
			this.score = score;
			this.address = address;
			this.tel = tel;
			this.license = license;
		}
		
		@Override
		public String toString() {
			return "Student [학번: " + stuNo + ", 이름: " + name + ", 점수: " + score + ", 주소: " + address + ", 전번: "
					+ tel + ", 재학: " + "["+license + "]";
		}

		public String getStuNo() {
			return stuNo;
		}
		public void setStuNo(String stuNo) {
			this.stuNo = stuNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public boolean isLicense() {
			return license;
		}
		public void setLicense(boolean license) {
			this.license = license;
		}
		

	

}
