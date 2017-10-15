package bankAccount;
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount1 saver = new DepositAccount1("1234567890","zhangsan",5000);
		saver.setRate(0.023);//设置年利率
		saver.Deposit(2000);//存入2000元
		saver.queryLeft();//查询余额
		System.out.println("年利息是"+saver.calYearRate());

	}

}