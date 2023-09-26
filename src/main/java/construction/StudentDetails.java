package construction;

public class StudentDetails {
	public String name;
	public int age;
	public boolean result;
	public char gender;


	StudentDetails(String name,int age,boolean result,char gender ){
		
		System.out.println("name :" +name);
		System.out.println("age : " + age);
		System.out.println("result :" + result);
		System.out.println("gender :" + gender);
		
}
	public static void main(String[]args) {
		StudentDetails name = new StudentDetails("Yogesh",20,true,'M');
		
	}
}
