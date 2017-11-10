package project2;

public class Graduate implements StudentManageInterface, TeacherManageInterface {
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	Graduate(){}
	public Graduate(String name,String sex,int age,double fee,double pay){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.fee = fee;
		this.pay = pay;
	}
	public void setPay(double pay) {
		// TODO Auto-generated method stub
		this.pay = pay;

	}
	public void getPay() {
	//	return pay;
		System.out.println("pay="+pay);

	}
	public void setFee(double fee) {
    	this.fee = fee;

	}
	public void getFee() {
		System.out.println("fee="+fee);

	}

public static void main(String[] args){
	Graduate zhangsan = new Graduate();
	zhangsan.setPay(6000);
	zhangsan.setFee(5000);
	if(zhangsan.pay-zhangsan.fee<2000){
		System.out.println("provide a loan!");
	}
}
}
