package ����;
import java.util.Arrays;
//��a�Ĳ������ݸ��Ƶ�b����
public class CopyArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		int[] b = Arrays.copyOfRange(a,5,a.length);//ʹ��Arrays�ิ������
		for(int i=5;i<a.length;i++){
			b[i-5] = a[i];
		}
		for(int i=1;i<b.length;i++){//ΪʲôҪ��i���1������ΪҪ��0�Ļ�����һ�����־ͻ�����
			if(i%5==0||i==b.length){
				System.out.println(b[i-1]);
			}else{
				System.out.print(b[i-1]+" ");
			}
		}

	}

}
