public class ListaEncadeada {
    private Node Lista;
    public ListaEncadeada(){
        Lista = null;
    }

    public boolean isVazia(){
        return Lista == null;
    }

    public int inserePrimeiro(int info){
        if (Lista == null){
            Lista = new Node(info);
        }
        else {
            Node novo = new Node(info);
            novo.setProx(Lista);
            Lista = novo;
            return info;
        }
        return info;
    }

    public int insereDepois(int node, int info) {
        if (Lista == null) {
            System.out.println("Nenhum nó predecessor encontrado");
            return -1;
        }
        else {
            Node list = Lista;
            while (list != null) {
                if (list.getInfo() == node) {
                    Node novo = new Node(info);
                    novo.setProx(list.getProx());
                    list.setProx(novo);
                    return info;
                }
                else {
                    list = list.getProx();
                }
            }
        }
        return info;
    }

    public int insereOrdenado(int info) {
        Node novo = new Node(info);

        if (Lista == null || Lista.getInfo() >= info) {
            novo.setProx(Lista);
            Lista = novo;
            return info;
        }

        Node atual = Lista;
        while (atual.getProx() != null && atual.getProx().getInfo() < info) {
            atual = atual.getProx();
        }

        novo.setProx(atual.getProx());
        atual.setProx(novo);

        return info;
    }

    public int removePrimeiro() {
        if (Lista == null) {
            System.out.println("A lista está vazia. Nada para remover.");
            return -1;
        }

        int info = Lista.getInfo();
        Lista = Lista.getProx();
        return info;
    }

    public int removeUltimo() {
        if (Lista == null) {
            System.out.println("A lista está vazia. Nada para remover.");
            return -1;
        }

        if (Lista.getProx() == null) {
            int info = Lista.getInfo();
            Lista = null;
            return info;
        }

        Node atual = Lista;
        while (atual.getProx().getProx() != null) {
            atual = atual.getProx();
        }

        int info = atual.getProx().getInfo();
        atual.setProx(null);
        return info;
    }


    public boolean remove(int info) {
        if (Lista == null) {
            System.out.println("A lista está vazia.");
            return false;
        }

        if (Lista.getInfo() == info) {
            Lista = Lista.getProx();
            return true;
        }

        Node atual = Lista;
        while (atual.getProx() != null) {
            if (atual.getProx().getInfo() == info) {
                atual.setProx(atual.getProx().getProx());
                return true;
            }
            atual = atual.getProx();
        }

        System.out.println("Nó " + info + " não foi encontrado.");
        return false;
    }


    public void imprimeLista() {
        Node atual = Lista;
        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getProx();
        }
        System.out.println();
    }

}
