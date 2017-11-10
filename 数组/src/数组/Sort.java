package 数组;
import java.util.Arrays;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,4,6,43,6,12,1,67,34,7,21};
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+" ");
		}
		int[] nums = new int[]{2,3,46,76,32,34,76};
		System.out.println("输出num中的元素"+Arrays.toString(nums));

	}

}
