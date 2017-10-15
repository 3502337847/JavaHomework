package student;

public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Jane",18,"高中");
		s1.show();
		System.out.println("#####################");
		Undergraduate u1 = new Undergraduate("Tom",22,"本科生","计算机");
		u1.show();
		System.out.println("#####################");
		Graduate g1 = new Graduate("Mark",26,"研究生","大数据与云计算");
		g1.show();
	}

}
