package test;

import java.util.Arrays;

public class arrfreq {

		public static void countfreq(int arr[],int n) {
			
				boolean visited[] = new boolean[n];
					
					Arrays.fill(visited, false);
					
					for(int i=0;i<n;i++) {
						
						if(visited[i]==true)
							continue;
						
						int count=1;
						for(int j=i+1;j<n;i++) {
							if(arr[i] == arr[j]) {
								visited[j]=true;
								count++;
							}
						}	
						System.out.println(arr[i]+ "    "+count);
					}
		}
		
		
		public static void main(String[] args) {
			
//				String str="sahil";
//				
//				char[] str1=str.toCharArray();
//				
//				int freq[]= new int[str.length()];
//				
//				int n=str1;
			
			int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
		    int n = arr.length;
		    countfreq(arr, n);
				
		}
}
