package student;

public class Graduate extends Student {
	String direction;
	public Graduate(String name, int age, String education,	String direction) {
		super(name, age, education);
		this.direction = direction;
		// TODO Auto-generated constructor stub
	}
	void show(){
		System.out.println("������"+name+",������"+age+",ѧ����"+education+",�о�������"+direction);
	}

}
