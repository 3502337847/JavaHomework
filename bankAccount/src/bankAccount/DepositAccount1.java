package bankAccount;

import java.util.Scanner;
public class DepositAccount1 {
	private String accountnum;//�˻�
	private String name;//��������
	private double left;//������
	static double rate;//������
	public DepositAccount1(String accountnum,String name,double left){ //���췽��������
		this.accountnum = accountnum;
		this.name = name;
		this.left = left;
	}
	public void Deposit(double money){ //���
		System.out.println("�����������Ϊ"+left);
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ����Ľ��Ϊ"+money);
		left = left + money;
		System.out.println("���ɹ��������������Ϊ"+left);
	}
	public void queryLeft(){//��ѯ���
		System.out.println("���������"+left);
	}
	public double calYearRate(){//��������Ϣ
		return left*rate;
	}
	public double calMonthRate(){//��������Ϣ
		return left*rate*1/12;
	}
	public  void setRate(double rate){//����������
		this.rate = rate;
	}
}
	



