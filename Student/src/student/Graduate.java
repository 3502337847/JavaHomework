package student;

public class Graduate extends Student {
	String direction;
	public Graduate(String name, int age, String education,	String direction) {
		super(name, age, education);
		this.direction = direction;
		// TODO Auto-generated constructor stub
	}
	void show(){
		System.out.println("姓名是"+name+",年龄是"+age+",学历是"+education+",研究方向是"+direction);
	}

}
