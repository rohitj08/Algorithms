package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int x[]={55,32,322,8912};
		int y[]=doSelectionSort(x);
		System.out.println("selection sort");
		for (int a :y){

			System.out.print(" "+a);
		}

	}

	private static int[] doSelectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++){
			int min=i;
			for (int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
				}
				
				int tmp=a[i];
				a[i]=a[min];
				a[min]=tmp;


			}
		}
		return a;

	}

}
