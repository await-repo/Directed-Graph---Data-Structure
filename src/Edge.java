public class Edge {

    //Como es un grafo dirigido se tiene un nodo de origen y un nodo de destino
    //La arista (edge) va desde el nodo de origen (start) al nodo de destino (end)
    Node start;
    Node end;

    //Constructos de la clase Edge
    public Edge(Node origin, Node destination) {
        this.start = origin;
        this.end = destination;
    }

    //toString lo utilizamos para retornar el contenido de una clase (Atributos o Variables) como un String
    @Override
    public String toString() {
        return "\n\t\t Edge{ start = " + start + ", end=" + end + " }";
    }
}
