package poject3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100,b = 20,c = 28,total = 0;
		total = a+b+c;//分配三种货物各自数目
		System.out.println("总货物数为："+total);
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
		System.out.println("三种货物的总重量为："+car.getTotal());
		

	}

}
