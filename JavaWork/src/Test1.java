public class Test1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		DepositAccount saver = new DepositAccount("1234567890","Zhang san",5000);     
		DepositAccount.setInterest(0.023);   //����������Ϊ2.3%
		System.out.println("�����˺�:"+saver.getname());   //��ѯ�����˺�
		System.out.println("��������:"+saver.getaccountnumber());   // ��ѯ��������  
		saver.save(2000);         //���2000Ԫ     
		System.out.println("����Ϣ�ǣ�" + saver.canculate_year());
		System.out.println("����Ϣ�ǣ�" + saver.canculate_month());
		saver.withdrawal(200);    //ȡ��200Ԫ
	}
}

class DepositAccount {  
	private String accountnumber;     //�����˺�  
	private String username;          //��������
	private float balance;       //������  
	static double interest;      //�����ʣ����Ա����  
	public DepositAccount(String name,String number,float ba) {  //��ʼ�����������췽��      
		accountnumber = number;   
		username = name;   
		balance = ba; 
		}  
	public static void setInterest(double d) {  //����������  
		interest = d;  
		}
	public double canculate_year() {  //��������Ϣ    
		return balance * interest;    
		}  
	public double canculate_month() {  //��������Ϣ    
		return balance * interest/12;    
		}  
	public String getaccountnumber(){   //��ѯ�����˺�  
		return accountnumber;  
		}  
	public String getname(){      //��ѯ��������  
		return username; 
		}  
	public void getbalance() {      //��ѯ���   
		System.out.println("��������ǣ�"+balance);  
		}  
	public void save(float m) {      //���  
		System.out.println("����ԭ�����Ϊ��"+balance);   
		System.out.println("�����ڴ��룺"+m);   
		balance += m;   
		System.out.println("�����������Ϊ��"+balance);  
		}  
	public boolean withdrawal(float m){    //ȡ��  
		if(m<=balance){  
        balance-=m;  
        System.out.println("ȡ������ɹ��������������Ϊ:"+balance);  
        return true;  
        }  
		else {  
			return false;  
			}
	}
}
