package project1;

public class HardWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 56,c = 341,total = 0;
		total = a+b+c;//分配三种工资各自的人数
		System.out.println("公司总雇员数："+total);
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
		
		
		System.out.println("公司总薪水总额为："+company.salayPay());
		

	}

}
