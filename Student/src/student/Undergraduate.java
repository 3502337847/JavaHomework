package student;

public class Undergraduate extends Student {
	String specialty;
	public Undergraduate(String name, int age, String education,String specialty) {
		super(name, age, education);
		this.specialty = specialty;
		// TODO Auto-generated constructor stub
	}
	void show(){
		System.out.println("������"+name+",������"+age+",ѧ����"+education+",רҵ��"+specialty);
	}

}
