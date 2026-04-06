package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphDemo {

    List<List<Integer>> adjacentList = new ArrayList<>();

    GraphDemo(int v) {
        for(int i=0; i<v; i++) {
            adjacentList.add(new ArrayList<>());  // 0[1,2], 1[], 2[], 3[], 4[]
        }
    }


    public void createEdge(int u, int v) {   // 0, 1
        adjacentList.get(u).add(v);
        adjacentList.get(v).add(u);
    }


    /**
     * BFS traversal
     * @param start
     */
    public void BFSTraversal(int start) {
        boolean[] isVisited = new boolean[adjacentList.size()];

        Queue<Integer> queue = new LinkedList<>();

        isVisited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println("Node Visited "+ node);

            for(int neighbour : adjacentList.get(node)) {
                if(!isVisited[neighbour]) {
                    isVisited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }

    public void printGraph() {
        for(int i=0; i<adjacentList.size(); i++) {
            System.out.println("Vertex : "+ i);
            for(int j=0; j<adjacentList.get(i).size(); j++) {
                System.out.println(" "+adjacentList.get(i).get(j));
            }
        }

    }

    public static void main(String[] args) {
        GraphDemo graph = new GraphDemo(5);

        graph.createEdge(0,1);
        graph.createEdge(2,3);
        graph.createEdge(1,2);
        graph.createEdge(3,4);
        graph.createEdge(0,4);

        graph.printGraph();

        graph.BFSTraversal(0);
    }


}