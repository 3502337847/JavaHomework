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
		System.out.println("������"+name+",������"+age+",ѧ����"+education);
	}

}

