import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Scanner scan = new Scanner(System.in);
        int opcao, valor;
        Random gerarNumeroAleatorio = new Random();

        List<Integer> numerosSorteados = new ArrayList<>();
        for (int i = 0;i < 20; i++) {
            int valorSorteado = gerarNumeroAleatorio.nextInt(101);
            numerosSorteados.add(valorSorteado);
            arvore.inserir(valorSorteado);
        }

        System.out.println("numeros sorteados:");
        for (int numero : numerosSorteados) {
            System.out.print(numero+" ");
        }
        System.out.println();
        System.out.println("");
        System.out.println("impressoes antes da remoção:");
        System.out.println("pre-ordem ");
        arvore.imprimirPreOrdem();
        System.out.println("");
        System.out.println("em ordem:");
        arvore.imprimirEmOrdem();
        System.out.println("");
        System.out.println("pos-ordem:");
        arvore.imprimirPosOrdem();
        System.out.println("");
        System.out.println("em nivel:");
        arvore.imprimirEmNivel();

        do {
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1 adicionar valor");
            System.out.println("2 remover valor");
            System.out.println("3 imprimir arvore");
            System.out.println("4 sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("digite o valor a ser inserido: ");
                    valor = scan.nextInt();
                    arvore.inserir(valor);
                    break;
                case 2:
                    System.out.print("digite o valor a ser removido: ");
                    valor = scan.nextInt();
                    arvore.remover(valor); 
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("impressões da arvore:");
                    System.out.println("pre-ordem:");
                    arvore.imprimirPreOrdem();
                    System.out.println("");
                    System.out.println("em ordem:");
                    arvore.imprimirEmOrdem();
                    System.out.println("");
                    System.out.println("pos-ordem:");
                    arvore.imprimirPosOrdem();
                    System.out.println("");
                    System.out.println("em nível:");
                    arvore.imprimirEmNivel();
                    break;
                case 4:
                    System.out.println("saindo");
                    break;
                default:
                    System.out.println("opcão invalida, tente novamente!");
            }
        } while (opcao != 4); 
    }
}
