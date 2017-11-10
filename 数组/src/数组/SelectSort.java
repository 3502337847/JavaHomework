package Êý×é;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{63,4,24,1,3,15};
		String end = "";
		int index;
		for(int i=1;i<a.length;i++){
			index = 0;
			for(int j=1;j<a.length-1;j++){
				if(a[j]>a[index]){
					index = j;
				}
			}
			end = a[index]+""+end;
			int temp = a[a.length-i];
			a[a.length-i] = a[index];
			a[index] = temp;
			System.out.print("¡¾");
			for(int j=0;j<a.length-i;j++){
				System.out.print(a[j]+"");
			}
			System.out.println("¡¿ "+end);
		}

	}

}
