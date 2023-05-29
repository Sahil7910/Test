package test;

public class Secondhighest {
	
	public static void main(String[] args) {
		
		int arr[]= {100,90,80,70,50,70,101,102,104};
		
		int largest=0;
		int secondlargest=0;
		
		System.out.println("the given array is:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>largest) {
					secondlargest=largest;
					largest=arr[i];
				}
				else if(arr[i]>secondlargest) {
					secondlargest=arr[i];
				}
			}
			
		System.out.println("second largest number:"+secondlargest);
		System.out.println("largest number:"+largest);
	}

}
