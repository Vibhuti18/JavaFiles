package com.psl.searchmethod;

public class LinearSearch {

	private int array[] = new int[7];
	private int res;

	public LinearSearch() {
		// TODO Auto-generated constructor stub
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=i+1;
		
		}
		
		res = -1;

	}
	
	
	static int findPosition(int num,int[] nos)
	{
		
	
		int c=0;
		int i;
		for(i=0;i<nos.length;i++)
		{
			if(nos[i]==num)
			{
				
				c=1;
				break;
			}
		
		}
		
		if(c==1)
			return i+1;
		else
			return 0;
		
	}

	public static void main(String args[]) {
		
		LinearSearch obj = new LinearSearch();
		obj.res=obj.findPosition(5,obj.array);
		
		if(obj.res==0)
			System.out.println(-1);
		else
			System.out.println(obj.res);
		
		

	}

}
