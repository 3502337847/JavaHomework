public class Test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DepositAccount saver = new DepositAccount("1234567890","Zhang san",5000);     
		DepositAccount.setInterest(0.023);   //设置年利率为2.3%
		System.out.println("储户账号:"+saver.getname());   //查询储户账号
		System.out.println("储户姓名:"+saver.getaccountnumber());   // 查询储户姓名  
		saver.save(2000);         //存款2000元     
		System.out.println("年利息是：" + saver.canculate_year());
		System.out.println("月利息是：" + saver.canculate_month());
		saver.withdrawal(200);    //取款200元
	}
}

class DepositAccount {  
	private String accountnumber;     //储户账号  
	private String username;          //储户姓名
	private float balance;       //存款余额  
	static double interest;      //年利率，类成员变量  
	public DepositAccount(String name,String number,float ba) {  //初始化开户，构造方法      
		accountnumber = number;   
		username = name;   
		balance = ba; 
		}  
	public static void setInterest(double d) {  //设置年利率  
		interest = d;  
		}
	public double canculate_year() {  //计算年利息    
		return balance * interest;    
		}  
	public double canculate_month() {  //计算月利息    
		return balance * interest/12;    
		}  
	public String getaccountnumber(){   //查询储户账号  
		return accountnumber;  
		}  
	public String getname(){      //查询储户姓名  
		return username; 
		}  
	public void getbalance() {      //查询余额   
		System.out.println("您的余额是："+balance);  
		}  
	public void save(float m) {      //存款  
		System.out.println("您的原有余额为："+balance);   
		System.out.println("您现在存入："+m);   
		balance += m;   
		System.out.println("您的现有余额为："+balance);  
		}  
	public boolean withdrawal(float m){    //取款  
		if(m<=balance){  
        balance-=m;  
        System.out.println("取款操作成功！您的现有余额为:"+balance);  
        return true;  
        }  
		else {  
			return false;  
			}
	}
}
