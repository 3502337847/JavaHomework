package project1;

public class Company {
	Employee[] employee;
	double salay = 0;
	Company(Employee[] employee){//���캯��
		this.employee = employee;
	}
	public double salayPay(){//�����ܵù���
		salay = 0;
		for(int i=0;i<employee.length;i++){
			salay = salay+employee[i].earnings();
		}
		
		return salay;
	}
	
}
