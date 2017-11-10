package สýื้;

public class CopyArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		int[] b = new int[a.length-5];
		for(int i=5;i<a.length;i++){
			b[i-5] = a[i];
		}
		for(int i=1;i<b.length;i++){
			if(i%5==0||i==b.length){
				System.out.println(b[i-1]);
			}else{
				System.out.print(b[i-1]+" ");
			}
		}

	}

}
