package Graphen;

import java.util.HashMap;
import java.util.*;

public class Vertex {

    private String name;

    private HashMap<Vertex, ArrayList<Edge>> listEdges = new HashMap<>();


    public Vertex(String name) {
        this.name = name;
    }

    public void addVerbindung(Vertex newVertex, int weight) {
        
        listEdges.put(this, new ArrayList<>());
        listEdges.get(this).add(new Edge(this, newVertex, weight));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Vertex, ArrayList<Edge>> getListEdges() {
        return listEdges;
    }

    public void setListEdges(HashMap<Vertex, ArrayList<Edge>> listEdges) {
        this.listEdges = listEdges;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listEdges == null) ? 0 : listEdges.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (listEdges == null) {
            if (other.listEdges != null)
                return false;
        } else if (!listEdges.equals(other.listEdges))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
    
}
