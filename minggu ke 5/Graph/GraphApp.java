package Graph;

public class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 3
        theGraph.addVertex('D'); // 4
        theGraph.addVertex('E'); // 5
        
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(2, 3); // AD
        theGraph.addEdge(3, 4); // DE
        
        theGraph.bfs();
        
        //theGraph.display();
    }
}
