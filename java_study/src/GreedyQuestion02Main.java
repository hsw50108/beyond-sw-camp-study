import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
입력예시) 
5 8 3
2 4 5 4 6
첫째 줄에 큰 수의 법칙에 따라 더해진 답을 출력한다.
요점
가장 큰 수와 두 번째로 큰 수를 구해 조건에 맞게 배치한다.
가장 큰 수를 K번 더하고 두 번째로 큰 수를 한 번 더하는 패턴을 반복한다.

출력예시)     
46 
*/
public class GreedyQuestion02Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
	    // 조건 값들 입력 받기
		String [] inputAry = scan.nextLine().split(" ");
	    int n = Integer.parseInt(inputAry[0]);
	    int m = Integer.parseInt(inputAry[1]);
	    int k = Integer.parseInt(inputAry[2]);
	    
	    Integer [] numAry = new Integer[n];
	    for(int i = 0; i < n; i++){
	        numAry[i] = scan.nextInt();
	    }
	    
	    Arrays.sort(numAry, Comparator.reverseOrder());
	    
	    for(int num : numAry) {
	    	System.out.print(num + "\t");
	    }
	    System.out.println();
	    int first = (m / (k+1) * k) + (m % (k+1));
	    int second = m - first;
	    int result = (numAry[0] * first) + (numAry[1] * second);
	 
        System.out.println("result = " + result);
	}

}




