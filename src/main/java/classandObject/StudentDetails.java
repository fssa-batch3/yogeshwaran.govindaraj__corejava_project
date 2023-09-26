package classandObject;

public class StudentDetails{
    public String name ;
    public int age;
    public char Gender;
    public boolean result;
    
    public void studentDetails(){
        
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + Gender);
        System.out.println("Result : " + result);
        
        
    }
     public static void main(String []args){
        
    	 StudentDetails name = new StudentDetails();
        name.name = "Yogesh";
        name.age = 20;
        name.Gender = 'M';
        name.result = true;
        name.studentDetails();
        
     }
}
