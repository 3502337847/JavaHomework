import java.util.Scanner;
/**
 * @author 王梦凡
 * Improve
 * 输入一个n,若n＜5000，按照n、2n、3n等的顺序输出，否则按照除以2的顺序输出
 *2017年9月23日上午10:32:12
 */
public class Improve {
	 int count = 0;//根据count判断>5000时，什么时候可以停止除以2操作
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in 

);
		System.out.println("请输入一个整数");
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
