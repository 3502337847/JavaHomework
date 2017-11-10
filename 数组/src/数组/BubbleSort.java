package Êý×é;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{63,4,24,1,3,13};
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a.length-i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				System.out.print(a[j]+" ");
			}
			System.out.print("¡¾");
		for(int j=a.length-i;j<a.length;j++){
				System.out.print(a[j]+" ");
			}
			System.out.println("¡¿");
		}

	}

}
