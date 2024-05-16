package examplesforloop;

public class InsertElement {
	public static void main(String[] args) {
		int[] arr = {25,14,56,15,36,56,77,18,29,69};
		int Index_position = 2;
		int newValue = 5;
		for(int i=arr.length-1;i>Index_position;i--) {
			arr[i] = arr[i-1];
		}
		arr[Index_position] = newValue;
		System.out.println("New Array :" +arr);
			
		} 
				
}  
