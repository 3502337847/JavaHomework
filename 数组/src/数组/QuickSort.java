package 数组;
//快速排序法
public class QuickSort {
	static int[] a = new int[]{49,38,65,97,76,13,27,49};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(a,0,a.length-1);
	}
	private static void quickSort(int sortarray[],int lowindex,int highindex){
		int lo = lowindex;	
		int hi = highindex;
		int mid;
		if(highindex>lowindex){
			mid = sortarray[(lowindex+highindex)/2];
			while(lo<=hi){
				while((lo<highindex)&&(sortarray[lo]<mid)){
					++lo;
				}
				while((hi>lowindex)&&(sortarray[hi]>mid)){
					--hi;
				}
				if(lo<=hi){
					swap(sortarray,lo,hi);
					++lo;
					--hi;
				}
			}
			if(lowindex<hi){
				quickSort(sortarray,lowindex,hi);
			}
			if(lo<highindex){
				quickSort(sortarray,lo,highindex);
			}
		}
	}
	private static void swap(int swapArray[],int i,int j){
		int temp = swapArray[i];
		swapArray[i] = swapArray[j];
		swapArray[j] = temp;
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
		System.out.println();
	}
	

}
