package Searching;
/**
 * 
 * @author Rohit Jadhav
 *
 */

public class BinarySearch {

	public static void main(String [] args){
		int x[]={5,6,7,8,9};
		doBinarysearch(x,8);
	}

	private static void doBinarysearch(int[] x, int num) {
		boolean found=false;
		int l=0;
		int r=x.length-1;
		while(l<=r){
			System.out.println("l="+l +"r" +r);
			int mid=l+(r-1)/2;
			if(num==x[mid]){
				System.out.println("element found "+x[mid] );
				found=true;
				break;
			}
			if(num>x[mid]){
				l=mid+1;
				
			}
			else{
				r=mid-1;
				found=true;
			}
		}



		if(!found){
			System.out.println("element not found");
		}


	}

}
