package student;

public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Jane",18,"����");
		s1.show();
		System.out.println("#####################");
		Undergraduate u1 = new Undergraduate("Tom",22,"������","�����");
		u1.show();
		System.out.println("#####################");
		Graduate g1 = new Graduate("Mark",26,"�о���","���������Ƽ���");
		g1.show();
	}

}
