package student;

public class Student {
	String name;
	int age;
	String education;
	Student(String name,int age,String education){
		this.name = name;
		this.age = age;
		this.education = education;
	}
	void show(){
		System.out.println("姓名是"+name+",年龄是"+age+",学历是"+education);
	}

}

