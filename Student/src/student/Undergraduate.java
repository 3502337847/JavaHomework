package student;

public class Undergraduate extends Student {
	String specialty;
	public Undergraduate(String name, int age, String education,String specialty) {
		super(name, age, education);
		this.specialty = specialty;
		// TODO Auto-generated constructor stub
	}
	void show(){
		System.out.println("姓名是"+name+",年龄是"+age+",学历是"+education+",专业是"+specialty);
	}

}
