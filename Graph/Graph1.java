import java.util.*;

class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int V; // Number of nodes

    Graph(int nodes) {
        V = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());

        }

    }

    void addEdge(int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Node " + i);
            for (int x : graph.get(i))
                System.out.print("->" + x);
            System.out.println();
        }

    }

}

class Graph1 {
    public static void main(String a[]) {
        Graph g=new Graph(5);
        g.addEdge(0,1 );
        g.addEdge(1,2 );
        g.addEdge(2,3 );
        g.addEdge(0,3 );
        g.addEdge(3,4 );
        g.printGraph();

    }
}
