package com.encore.data.structor.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphServiceImpl {

	public GraphServiceImpl() {
	}

	public GraphNode makeNode(int data) {
		GraphNode node = new GraphNode(data);
		return node ;
	}

	public void makeEdge(GraphNode idxNode, GraphNode corNode) {
		idxNode.getCorLst().add(corNode) ;
	}

	// 재귀호출이 필요하고
	// Iterator 
	// 방문을 체크 
	public void dfs(GraphNode node) {
		System.out.print(node.getData()+"\t");
		node.setVisited(true);
		/*
		List<GraphNode> lst = node.getCorLst();
		for(int idx = 0 ; idx < lst.size() ; idx++) {
			GraphNode data = lst.get(idx);
			if( !data.isVisited() ) {
				dfs(data);
 			}
		}
		*/
		Iterator<GraphNode> iter = node.getCorLst().iterator();
		while( iter.hasNext() ) {
			GraphNode data =  iter.next() ;
			if( !data.isVisited() ) {
				dfs(data);
			}
		}
	}// dfs

	public void bfs(int [][] ary , boolean [] visit) {
		Queue<Integer> queue = new LinkedList<Integer>();

		// 1 데이터이면서 2차원배열의 행 인덱스
		queue.offer(1);
		visit[1] = true ;

		while(!queue.isEmpty()) {
			int row_data = queue.poll();
			System.out.print(row_data + "\t") ;
			for(int idx = 0 ; idx < ary[row_data].length ; idx ++) {
				// 데이터이지만 인덱스로 사용
				int temp = ary[row_data][idx] ;
				if( !visit[temp] ) {
					visit[temp] = true ;
					queue.offer(temp);
				}
			}
		}
	}

}






