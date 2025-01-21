package source;

public class Edge {
    private  Vertex vertexIn;
    private  Vertex vertexOut;
    private Object label;

    public Edge(Vertex vertexIn, Vertex vertexOut, Object label) {
        this.vertexIn = vertexIn;
        this.vertexOut = vertexOut;
        this.label = label;
    }
}