import java.util.Scanner;

public class TabelaHash {
    private int colisoes;
    private ListaEncadeada[] tabela;
    private int tam;

    public TabelaHash(int tam) {
        this.tam = tam;
        this.colisoes = 0;
        this.tabela = new ListaEncadeada[tam];

        // Inicializa cada posição da tabela com uma lista encadeada
        for (int i = 0; i < tam; i++) {
            tabela[i] = new ListaEncadeada();
        }
    }

    // Função hash: chave % tamanho da tabela
    private int funcaoHash(int chave) {
        return chave % tam;
    }

    // Método para inserir a chave na tabela hash
    public void insere(int chave) {
        int indice = funcaoHash(chave);

        // Se o índice já contém elementos, incrementa colisão
        if (!tabela[indice].isVazia()) {
            colisoes++;
        }

        // Insere a chave na lista encadeada correspondente ao índice calculado
        tabela[indice].inserePrimeiro(chave);
    }

    // Método para imprimir a tabela
    public void imprimeTabela() {
        for (int i = 0; i < tam; i++) {
            System.out.print("Índice " + i + ": ");
            tabela[i].imprimeLista();
        }
        System.out.println("Colisões: " + colisoes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do tamanho da tabela
        System.out.print("Informe o tamanho da tabela: ");
        int tam = sc.nextInt();

        TabelaHash tabelaHash = new TabelaHash(tam);

        // Exemplo de inserção
        System.out.println("Informe a quantidade de chaves a serem inseridas: ");
        int numChaves = sc.nextInt();
        for (int i = 0; i < numChaves; i++) {
            System.out.print("Insira a chave " + (i + 1) + ": ");
            int chave = sc.nextInt();
            tabelaHash.insere(chave);
        }

        // Imprime a tabela hash final
        tabelaHash.imprimeTabela();

        sc.close();
    }
}
