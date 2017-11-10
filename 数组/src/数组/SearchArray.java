package 数组;
import java.util.Arrays;
public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[]{"我是王梦凡","我希望我可以变漂亮！","my dream is happy everyday！"};
		Arrays.sort(a);
		System.out.println("排序后的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int index = Arrays.binarySearch(a, "my dream is happy everyday！");
		if(index>=0){
			System.out.println("索引为："+index);
		}else{
			System.out.println("数组中不存在所找的词汇!");
		}

	}

}
