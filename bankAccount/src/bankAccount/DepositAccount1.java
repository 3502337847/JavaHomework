package bankAccount;

import java.util.Scanner;
public class DepositAccount1 {
	private String accountnum;//账户
	private String name;//储户姓名
	private double left;//存款余额
	static double rate;//年利率
	public DepositAccount1(String accountnum,String name,double left){ //构造方法，开户
		this.accountnum = accountnum;
		this.name = name;
		this.left = left;
	}
	public void Deposit(double money){ //存款
		System.out.println("您的现有余额为"+left);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您要存入的金额为"+money);
		left = left + money;
		System.out.println("存款成功，您的现有余额为"+left);
	}
	public void queryLeft(){//查询余额
		System.out.println("您的余额是"+left);
	}
	public double calYearRate(){//计算年利息
		return left*rate;
	}
	public double calMonthRate(){//计算月利息
		return left*rate*1/12;
	}
	public  void setRate(double rate){//设置年利率
		this.rate = rate;
	}
}
	



