import java.util.Scanner;
/**
 * @author ���η�
 * Improve
 * ����һ��n,��n��5000������n��2n��3n�ȵ�˳������������ճ���2��˳�����
 *2017��9��23������10:32:12
 */
public class Improve {
	 int count = 0;//����count�ж�>5000ʱ��ʲôʱ�����ֹͣ����2����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in 

);
		System.out.println("������һ������");
		int n = input.nextInt();
		System.out.println();
		new Improve().DisplayMultiply(n);
	}
	 void DisplayMultiply(int n){
		System.out.println(n);
		if(n<5000){
			count++;
			DisplayMultiply(2*n);
		
		}
		else{
			System.out.println(n);
			DisplayDivide(n/2);
		}
	}
	 void DisplayDivide(int n){
		if(count>0){
			count--;
			System.out.println(n);
			DisplayDivide(n/2);
		
		
		}
		
		
	}

}
