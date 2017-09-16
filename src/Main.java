public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		StudentGroup sg1=new StudentGroup(1);
		Student[] s=new Student[1];
	      s[0]=new Student(22,"yash","1997-01-26",90.2);
	      sg1.setStudents(s);
	      System.out.println(sg1.getStudent(0).fullName);
		
	}

}
