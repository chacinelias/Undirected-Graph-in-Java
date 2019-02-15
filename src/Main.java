public class Main {

    public static void main(String[] args){

        UndirectedGraph myGraph = new UndirectedGraph(5);

        myGraph.addEdge(myGraph.vertices.get(0), myGraph.vertices.get(1));
        myGraph.addEdge(myGraph.vertices.get(0), myGraph.vertices.get(4));
        myGraph.addEdge(myGraph.vertices.get(1), myGraph.vertices.get(2));
        myGraph.addEdge(myGraph.vertices.get(1), myGraph.vertices.get(3));
        myGraph.addEdge(myGraph.vertices.get(1), myGraph.vertices.get(4));
        myGraph.addEdge(myGraph.vertices.get(2), myGraph.vertices.get(3));
        myGraph.addEdge(myGraph.vertices.get(3), myGraph.vertices.get(4));

        myGraph.printGraph();

        myGraph.DFS(myGraph.vertices.get(2));
    }
}
