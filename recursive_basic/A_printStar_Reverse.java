package recursive_basic;

import java.util.Scanner;

public class A_printStar_Reverse {
	
/* 
 
 출력 결과 :
      		  *
      		 **
      		***
      	   ****
      	  *****
      	 ******
      	*******

*/
    static void print1(int n) {

    }

    static void print2(int n, int i, int j) {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("행 수를 입력하시오: ");
            int n = scanner.nextInt();
            print1(n);
            System.out.println();
            print2(n, 0, 0);
        }
    }
}

}
