package poject3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100,b = 20,c = 28,total = 0;
		total = a+b+c;//�������ֻ��������Ŀ
		System.out.println("�ܻ�����Ϊ��"+total);
		ComputeWeigh[] goods = new ComputeWeigh[total];
		Car car = new Car(goods);
		for(int i=0;i<a;i++){
			goods[i] = new Television();
		}
		for(int i=a;i<a+b;i++){
			goods[i] = new Computer();
		}
		for(int i=a+b;i<a+b+c;i++){
			goods[i] = new WashMachine();
		}
		System.out.println("���ֻ����������Ϊ��"+car.getTotal());
		

	}

}
