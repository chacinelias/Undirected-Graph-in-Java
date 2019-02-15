import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class UndirectedGraph {

    int numVertex;
    LinkedList<Vertex> vertices;

    public UndirectedGraph(int numVertex) {

        this.numVertex = numVertex;
        this.vertices = new LinkedList<>();

        for (int i = 0; i < numVertex; i++) {

            vertices.add(new Vertex(i));
        }
    }

    public void addEdge(Vertex src, Vertex dest){

        src.adjacent.add(dest);
        dest.adjacent.add(src);
    }

    public void printGraph(){

        for (int i = 0; i < numVertex; i++) {

            System.out.println("Vertex " + this.vertices.get(i).index + " adjacent vertices:");

            for(int j = 0; j < vertices.get(i).adjacent.size(); j++){

                System.out.println(vertices.get(i).adjacent.get(j).index);
            }
        }
    }

    //TO DO: refactor to eliminate BREAK statement
    public void DFS(Vertex v){

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> set = new HashSet<>();

        stack.push(vertices.get(0));

        while (!stack.isEmpty()){

            Vertex curr = stack.pop();

            for (int i = 0; i < curr.adjacent.size(); i++) {

                if(!set.contains(curr.adjacent.get(i)) && !stack.contains(curr.adjacent.get(i))){
                    stack.push(curr.adjacent.get(i));
                }
            }

            if(curr == v){
                System.out.println();
                System.out.println("Found vertex: " + v.index);
                System.out.println("Adjacent vertices: ");
                for (int i = 0; i < curr.adjacent.size(); i++) {

                    System.out.println(curr.adjacent.get(i).index);
                }
                break;
            }else{

                set.add(curr);
            }
        }
    }
}
