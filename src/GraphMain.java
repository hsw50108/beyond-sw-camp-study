import com.encore.data.structor.graph.GraphNode;
import com.encore.data.structor.graph.GraphServiceImpl;

public class GraphMain {
    public static void main(String[] args) {

        GraphServiceImpl graphService = new GraphServiceImpl();

        GraphNode node1 = graphService.makeNode(1);
        GraphNode node2 = graphService.makeNode(1);
        GraphNode node3 = graphService.makeNode(1);
        GraphNode node4 = graphService.makeNode(1);
        GraphNode node5 = graphService.makeNode(1);
        GraphNode node6 = graphService.makeNode(1);


        // 생성한(1 ~ 6) 노드의 방향을 연결
        graphService.makeEdge(node1, node2);
        graphService.makeEdge(node2, node4);
        graphService.makeEdge(node4, node3);
        graphService.makeEdge(node3, node5);
        graphService.makeEdge(node5, node4);
    }

    //재귀 호출이 필요
    // Iterator
    // 방문을 체크
    public void dfs(GraphNode node) {
        System.out.println(node.getData() + "\t");
    }

    public void bfs(int[][] ary, boolean[] visit) {

    }






}
