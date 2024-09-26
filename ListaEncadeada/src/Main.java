public class Main {
    public static void main(String[] args) {
        ListaEncadeada  lista = new ListaEncadeada();
        PilhaEncadeada pilha = new PilhaEncadeada();
        FilaEncadeada fila = new FilaEncadeada();

//===================================== TESTES PILHA ===============================================

        pilha.inserePrimeiro(3);
        pilha.inserePrimeiro(4);
        pilha.inserePrimeiro(9);
        pilha.inserePrimeiro(54);
        pilha.inserePrimeiro(7);

        System.out.println("O topo da Pilha é: " + pilha.ImprimeTopo());

        System.out.println("Elemento removido: " + pilha.RemoveTopo());
//
        pilha.imprimePilha();

//===================================== TESTES FILA ===============================================

//        fila.insereUltimo(3);
//        fila.insereUltimo(7);
//        fila.insereUltimo(12);
//
//        System.out.println("Nó removido: " + fila.remove());
//
//        fila.imprimeFila();

//===================================== TESTES LISTA ===============================================

//        System.out.println(lista.isVazia());
//
//        lista.inserePrimeiro(5);
//        lista.inserePrimeiro(4);
//        lista.inserePrimeiro(2);
//        lista.inserePrimeiro(1);
//
//        //lista.insereDepois(5,3);
//
//        lista.insereOrdenado(3);
//
//        lista.remove(2);
//
//        lista.imprimeLista();

    }
}