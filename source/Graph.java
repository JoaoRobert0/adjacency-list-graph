package source;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Vertex> vertexs;
    List<Edge> edges;

    public Graph() {
        this.vertexs = new ArrayList<>();
        this.edges = new ArrayList<>();
    }
}