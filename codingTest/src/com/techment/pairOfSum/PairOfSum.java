package com.techment.pairOfSum;

public class PairOfSum {

	public static void findPairOfSum(int[]num,int pairOfSum) {
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]+num[j] == pairOfSum) {
					System.out.println("pair found("+num[i]+","+num[j]+")");
					return;
				}
			}
		}
		System.out.println("pair not found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {1,2,3,4,5,6,7,8};
		int pairOfSum = 5;
				
				findPairOfSum(number,pairOfSum);
	}

}
