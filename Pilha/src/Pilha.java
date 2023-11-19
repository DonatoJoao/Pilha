import java.util.Scanner;
/*
Estudo baseado no livro "Estrutura de dados: algoritmos e análise da complexidade e implementação..."

Minha próxima meta neste exercício:
1:
    Aprender a lançar ou tratar um possível erro de entrada:
    simulando o caso de um usuário digitar qualquer coisa que não seja um número para armazenar na pilha,
    visto que o tipo de dado é um inteiro.

2:
    Criar uma interface?? para eliminar a repetição de ifs == pilha vazia


 */

public class Pilha {
    private static class PILHA{ //no livro é criada essa classe com letras maiusculas
        public int num;
        public PILHA prox;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PILHA topo = null;
        PILHA aux;
        int op;
        do {
            System.out.println("\nMenu de opções\n");
            System.out.println("1 - Para Inserir um número na pilha");
            System.out.println("2 - Para Consultar a pilha");
            System.out.println("3 - Para Remover um item da pilha");
            System.out.println("4 - Para Esvaziar a pilha completamente");
            System.out.println("5 - Sair");
            System.out.println("Digite sua opção: ");
            op = entrada.nextInt();
            if (op < 1 || op > 5)
                System.out.println("Opção INVÁLIDA");
            if (op == 1){
                System.out.println("Digite um número para ser inserido: ");
                PILHA novo = new PILHA();
                novo.num = entrada.nextInt();
                novo.prox = topo;
                topo = novo;
                System.out.println("Número inserido na pilha.");
            } if (op == 2){
                if (topo == null){
                    System.out.println("A Pilha está Vazia");
                } else {
                    System.out.println("\nConsultado a Pilha\n");
                    aux = topo;
                    while (aux != null){
                        System.out.println(aux.num+" ");
                        aux = aux.prox;
                    }
                }
            }
            if (op == 3){
                if (topo == null) {
                    System.out.println("Pilha Vazia: não há itens para remover.");
                } else {
                    System.out.println("Número "+ topo.num + " foi removido da pilha.");
                    topo = topo.prox;
                }
            }
            if (op == 4) {
                if (topo == null){
                    System.out.println("Pilha Vazia: não precisa ser esvaziada.");
                } else {
                    topo = null;
                    System.out.println("Pilha ESVAZIADA, não mais nada na pilha.");
                }
            }
        }
        while (op !=5);
    }
}
