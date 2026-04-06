package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijikstraAlgo {

    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance= distance;
        }
    }


    /**
     * Time complexity O( (V+E) log V)
     * @param V
     * @param adj
     * @param src
     */

    public static void dijikstra(int V, List<List<Pair>> adj, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(
                (a,b) -> a.distance - b.distance
        );

        dist[src] = 0;
        priorityQueue.add(new Pair(src, 0));

        while(!priorityQueue.isEmpty()) {
            Pair current = priorityQueue.poll();

            int node = current.node;
            int currentDist = current.distance;

            for(Pair neighbour : adj.get(node)) {
                int adjNode = neighbour.node;
                int weight = neighbour.distance;

                if(currentDist + weight < dist[adjNode]) {
                    dist[adjNode] = currentDist + weight;
                    priorityQueue.add(new Pair(adjNode, dist[adjNode]));

                }
            }
        }

        System.out.println("Shortest distance from source "+ src + ":");
        for(int i=0; i< V; i++) {
            System.out.println("To "+ i + " -> "+ dist[i]);
        }
    }


    public static void main(String[] args) {
        int V = 5;
        List<List<Pair>> adj = new ArrayList<>();

        for( int i =0; i< V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges
        adj.get(0).add(new Pair(1,2));
        adj.get(0).add(new Pair(2,4));

        adj.get(0).add(new Pair(2,1));
        adj.get(0).add(new Pair(3,7));

        adj.get(0).add(new Pair(4,3));
        adj.get(0).add(new Pair(4,1));

        dijikstra(V, adj, 0);

    }
}