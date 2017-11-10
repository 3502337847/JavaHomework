package 数组;
//直接插入排序
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{20,40,90,30,80,70,50};
		System.out.println("排序前：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		int temp;
		int j;
		for(int i=1;i<a.length;i++){
			temp = a[i];
			for(j=i-1;j>=0&&a[j]>temp;j--){
				a[j+1] = a[j];
			}
		//	a[j+1] = temp;
		}
		System.out.println();
		System.out.println("排序后：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}

}
