package project1;

public class HardWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 56,c = 341,total = 0;
		total = a+b+c;//�������ֹ��ʸ��Ե�����
		System.out.println("��˾�ܹ�Ա����"+total);
		Employee[] employee = new Employee[total];
		Company company = new Company(employee);
		for(int i=0;i<a;i++){
			employee[i] = new YearWorkers();
		}
		for(int i=a;i<a+b;i++){
			employee[i] = new MonthWorkers();
		}
		for(int i=a+b;i<a+b+c;i++){
			employee[i] = new WeekWorkers();
		}
		
		
		System.out.println("��˾��нˮ�ܶ�Ϊ��"+company.salayPay());
		

	}

}
