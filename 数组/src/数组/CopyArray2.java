package 数组;
import java.util.Arrays;
//将a的部分数据复制到b里面
public class CopyArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		int[] b = Arrays.copyOfRange(a,5,a.length);//使用Arrays类复制数组
		for(int i=5;i<a.length;i++){
			b[i-5] = a[i];
		}
		for(int i=1;i<b.length;i++){//为什么要把i设成1，是因为要是0的话，第一个数字就换行了
			if(i%5==0||i==b.length){
				System.out.println(b[i-1]);
			}else{
				System.out.print(b[i-1]+" ");
			}
		}

	}

}
