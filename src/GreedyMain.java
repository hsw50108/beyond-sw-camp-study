import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.encore.algorithm.greedy.GreedyNode;
/*
코테 백준 문제
- 거스름돈
- 동전
- 강의실 배정  
*/
public class GreedyMain {

	public static void main(String[] args) {
		List<GreedyNode> lst = new ArrayList<GreedyNode>() ; 
		lst.add( new GreedyNode("A", 7, 8));
		lst.add( new GreedyNode("B", 5, 7));
		lst.add( new GreedyNode("C", 3, 6));
		lst.add( new GreedyNode("D", 1, 2));
		lst.add( new GreedyNode("E", 6, 9));
		lst.add( new GreedyNode("F", 10, 11));
		
		//List<Integer> list = new ArrayList<Integer>() ;
		//list.add(10); list.add(9);
		//Collections.sort(list); 
		//System.out.println(list);
		Collections.sort(lst) ;
		for(GreedyNode node : lst ) {
			System.out.print(node.getEndTime() + "\t" ); 
		}
		System.out.println();
		// Greedy algorithm 수행 후 결과 출력 
		// 출력되는 결과는 활동명(예시) -> D-> C-> A-> F)
		List<GreedyNode> results = process(lst);
		for(GreedyNode node : results) {
			System.out.print( node.getActionName() + "\t" ) ;
		}
	}
	
	
	// endTime 을 비교해서 활동할 수 있는 Node를 담아서 리턴.....
	public static List<GreedyNode> process(List<GreedyNode> lst) {
		List<GreedyNode> answer = new ArrayList<GreedyNode>();
		Iterator<GreedyNode> iter = lst.iterator() ; 
		
		int time = 0 ; 
		while( iter.hasNext() ) {
			GreedyNode node = iter.next() ;
			// System.out.println( node.getStartTime() + "\t" + node.getEndTime() ) ;
			if( time <= node.getStartTime() ) {
				answer.add(node);
				time = node.getEndTime() ; 
			}
			
		}
		return answer ; 
		/*
		for(GreedyNode node : lst) {
			System.out.println( node.getStartTime() + "\t" + node.getEndTime() ) ;
		}
		*/
		/*
		for(int idx = 0 ; idx < lst.size() ; idx++) {
			GreedyNode node =  lst.get(idx);
			System.out.println( node.getStartTime() + "\t" + node.getEndTime() ) ;
		}
		*/
		
		
	}
}








