package Searching;
/**
 * 
 * @author Rohit Jadhav
 *
 */

public class BinarySearch {

	public static void main(String [] args){
		int x[]={4,5,6,7,8,9,11,12,14,56,78,99,999,9999,99999};
		doBinarysearch(x,9);
	}

	private static void doBinarysearch(int[] x, int num) {
		boolean found=false;
		int l=0;
		int r=x.length-1;
		while(l<=r){
			
			int mid=l+(r-l)/2;
			System.out.println("l="+l +"r" +r +"mid"+mid);
			if(num==x[mid]){
				System.out.println("element "+x[mid] +" found");
				found=true;
				break;
			}
			if(num>x[mid]){
				l=mid+1;
				
			}
			else{
				r=mid-1;
				
			}
		}
		 if(!found){
			System.out.println("element not found");
		}


	}

}
