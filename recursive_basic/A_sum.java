package recursive_basic;

public class A_sum {
	/*	
	    ����1 : sum()
	    1���� n���� �հ踦 ����ϴ� sum �Լ��� �����϶�.
		��� ȣ��� �����϶�.
		
		��� ��� : 3 6
				4 10
				5 15
				6 21
				7 28
				8 36
				9 45
				10 55
	*/
			
		    static int sum(int n) {
		    	if(n==1)
		    		return 1;
		    		return n + sum(n-1);
		    }

		    public static void main(String[] args) {
		        for (int i = 3; i <= 10; ++i)
		            System.out.printf("%d %d\n", i, sum(i));
		    }

}
