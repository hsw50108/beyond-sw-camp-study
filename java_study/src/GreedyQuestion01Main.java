import java.util.Scanner;

/*
입력예시) 1460  
출력예시) 8    
*/
public class GreedyQuestion01Main {

	public static void main(String[] args) {
		System.out.print("10의 배수의 금액을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
	    int total = scan.nextInt();
	    
	    int coinCnt = 0 ; 
	    int [] ary  = {500, 100, 50, 10} ;
	    for(int coin : ary) {
	    	coinCnt += total / coin ;
	    	total %= coin ; 
	    }
	    System.out.println("동전의 개수 : " + coinCnt ) ; 
	    
	}

}
