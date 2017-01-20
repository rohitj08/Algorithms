package Searching;
/**
 * 
 * @author Rohit Jadhav
 *
 */

public class LinearSearch {

	public static void main(String [] args){
		int x[]={1,4,6,6,7};
		doLinersearch(x,9);
	}

	public static void doLinersearch(int y[],int num){
	 boolean found=false;
	 System.out.println("array lenght "+y.length);
		for(int i=0;i<y.length;i++){
			if(num==y[i]){
				System.out.println("element found " +y[i] +" at position " +i);
				found=true;
				}

		}
		if(!found){
			System.out.println("element not found");
		}
		
	}


}
