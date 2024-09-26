public class FilaEncadeada {
    private Node Fila;

    public FilaEncadeada(){
        Fila = null;
    }

    public int insereUltimo(int info) {
        Node novo = new Node(info);

        if (Fila == null) {
            Fila = novo;
        } else {
            Node atual = Fila;
            while (atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProx(novo); //seta o novo nó como último
        }

        return info;
    }

    public int remove(){
        if (Fila == null) {
            System.out.println("A lista está vazia.");
            return 0;
        }
        else {
            Node atual = Fila;
            int removido = atual.getInfo();
            Fila = Fila.getProx(); //atualiza o ponteiro
            return removido;
        }
    }

    public void imprimeFila() {
        Node atual = Fila;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }


}
