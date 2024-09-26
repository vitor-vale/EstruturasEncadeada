public class PilhaEncadeada {
    private Node Topo;
    public PilhaEncadeada(){
        Topo = null;
    }

    public int inserePrimeiro(int info){
        if (Topo == null){
            Topo = new Node(info);
        }
        else {
            Node novo = new Node(info);
            novo.setProx(Topo); // seta o topo atual como próximo
            Topo = novo; //atualiza o ponteiro no nó criado como topo
            return info;
        }
        return info;
    }

    public int RemoveTopo(){
        if (Topo == null) {
            System.out.println("A lista está vazia.");
            return 0;
        }
        else {
            Node atual = Topo; //no atual
            int removido = atual.getInfo();
            Topo = Topo.getProx(); //define o ponteiro para o prox nó
            return removido;
        }
    }

    public int ImprimeTopo(){
        int topoPilha = Topo.getInfo();
        return topoPilha;
    }


    public void imprimePilha() {
        Node atual = Topo;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }
}
