import java.util.Scanner;

/**
 * @author ���η�
 * MatrixShun
 * ���־��󡣵�����������С�������Ͻǿ�ʼ��˳ʱ�밴�վ����С����Ȧ��ת����Ȧ�������
 * 2017��9��23������10:29:17
 */
public class Matrix {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("���������С");
		 int size = input.nextInt();
		int count = 0;
		int array[][] = new int[size][size];
		int m=0,n=0;
		int down,right,up = 0,left = 0;
		down = size-1;
		right = size-1;
		int max = size*size;
		//����Ȧ��������Ȧ
		while(true){
			count++;
			if(m==up){
				array[m][n] = count;
				n++;
				if(n>right){
					n = right; 
					m++;
				}
			}
			else if(n==right){
				array[m][n] = count;
				m++;
				if(m>down){
					m = down;
					right--;
				}
				
			}
			else if(m==down){
				array[m][right] = count;
				right--;
				if(right<left){
					right = left;
					down--;
				}
			}
			else if(right==left){
				array[down][left] = count;
				down--;
				if(down<=up){
					down = up;
					left++;
				}
			}
			else{
				up++;
				down = n-1;
				right = m-1;
				m = up;
				n = left;
				count--;                  
				
			}
			if(count>=max){
				break;
			}
			}
		//�������
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		}

	}


