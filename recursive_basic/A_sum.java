package recursive_basic;

public class A_sum {
	/*	
	    ����1 : sum()
	    1���� n���� �հ踦 ����ϴ� sum �Լ��� �����϶�.
		��� ȣ��� �����϶�.
		������ �޼ҵ��� �ð� ���⵵��? 
		O(n), ��(n), ��(n)
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
