
/**
 * @author Administrator
 	Time Complexity:
	Best case: O(n)
	Average case: O(n^2)
	Worst case: O(n^2)
 */

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 5, 1, 4, 2, 8};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("After sorting");
		
		/* Best case:  O(n)
			Average case:  O(n^2)
			Worst case:  O(n^2)
		*/
		bubbleSort(a);
	}
	// If array is sorted then also it takes o(n)
	public static void bubbleSort(int[] a) {
		boolean swapped;
		for (int i = 0; i < a.length; i++) {
			swapped = false;
			for (int j = i; j < a.length-i-1; j++) {
				
				if(a[j] > a[j+1]) {
					int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
						swapped = true;
				}
				
			}
			if(swapped == false) break;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	// If array is sorted then also it takes o(n2)
	public static void bubbleSort2(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length-i-1; j++) {
				
				if(a[j] > a[j+1]) {
					int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
				}
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	/* Ex
	 	 a ={5 1 4 2 8}
	    i=0
	    	j= 0 compare with a[0]{5}  > a[1]{1} swap 	 1 5 4 2 8
	    	j= 1 compare with a[1] {5} > a[2]{4} swap 	 1 4 5 2 8
	    	j= 2 compare with a[2] {5} > a[3]{2} swap 	 1 4 2 5 8
	    	j= 3 compare with a[3] {5} > a[4]{8} no swap 1 4 2 5 8
	    	
	    a ={1 4 2 5 8}
    	i=1 
	    	j= 1 compare with a[1] {4} > a[1]{2} swap 	  1 2 4 5 8
	    	j= 2 compare with a[2] {4} > a[3]{4} no swap  1 2 4 5 8
	    	j= 3 compare with a[3] {5} > a[3]{8} no swap  1 2 4 5 8
	    	
	    	etc
	    		
	    
	 
	 */
}
