package com.encore.data.structor.graph;

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
		System.out.println(node.getData()+"\t"); 
	}

	public void bfs(int[][] ary, boolean[] visit) {
		Queue<Integer> queue = new LinkedList();

		// 데이터이면서 2차원 배열의 행 인덱스
		queue.offer(1);
		visit[1] = true;

		while (!queue.isEmpty()) {
			int row_data = queue.poll();
			System.out.println(row_data + "\t");
			for (int i = 0; i < ary[row_data].length; i++) {
				// temp 데이터이면서 인덱스로 사용
				int temp = ary[row_data][i];
				if (!visit[temp]) {
					visit[temp] = true;
					queue.offer(temp);
				}
			}
		}
	}

}






