package com.main;

public class Application {

	public static void main(String[] args) {
		int[] dizi = new int[] {3,4,5,6,7};
		int[] b = new int[dizi.length];
		int[] queries = new int[] {2,3};
		int k=5;
		int[] result = new int[queries.length];
		k=k%5;	
		for (int i = 0; i < dizi.length; i++) {
			b[i] = dizi[(dizi.length-k+i)%dizi.length];
		}
		
		for (int i = 0; i < queries.length; i++) {
			result[i] = b[queries[i]];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.printf("%3d",b[i]);
		}
			System.out.println();
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%3d",result[i]);
		}
	}

}
