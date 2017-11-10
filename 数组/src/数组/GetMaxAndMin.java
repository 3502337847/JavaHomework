package 数组;

public class GetMaxAndMin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,2,3,4,5,6,7,8};
		int max = 0;
		int min = 0;
		if(a.length>0){
			max = a[0];
			min = a[0];
		}
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max = a[i];
			}
			if(min>a[i]){
				min = a[i];
			}
		}
		System.out.println("最大为："+max);
		System.out.println("最小为："+min);

	}

}
