public class Node {
    private Node prox;
    private int info;
    public Node(int info){
        this.info = info;
        this.prox = null;
    }

    public void setProx(Node prox){
        this.prox = prox;
    }

    public int getInfo() {
        return this.info;
    }

    public Node getProx() {
        return this.prox;
    }
}
