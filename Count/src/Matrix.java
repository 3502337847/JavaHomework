import java.util.Scanner;

/**
 * @author 王梦凡
 * MatrixShun
 * 数字矩阵。当输入矩阵规格大小，从左上角开始，顺时针按照矩阵大小从外圈旋转至内圈输出数字
 * 2017年9月23日上午10:29:17
 */
public class Matrix {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("输入数组大小");
		 int size = input.nextInt();
		int count = 0;
		int array[][] = new int[size][size];
		int m=0,n=0;
		int down,right,up = 0,left = 0;
		down = size-1;
		right = size-1;
		int max = size*size;
		//从外圈进行至内圈
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
		//输出矩阵
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		}

	}


