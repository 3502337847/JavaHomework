package ����;
import java.util.Arrays;
public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[]{"�������η�","��ϣ���ҿ��Ա�Ư����","my dream is happy everyday��"};
		Arrays.sort(a);
		System.out.println("����������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int index = Arrays.binarySearch(a, "my dream is happy everyday��");
		if(index>=0){
			System.out.println("����Ϊ��"+index);
		}else{
			System.out.println("�����в��������ҵĴʻ�!");
		}

	}

}
