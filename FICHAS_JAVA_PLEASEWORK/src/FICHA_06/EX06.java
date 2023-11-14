//        Implemente o programa “Análise de um Vetor” que pergunte um o tamanho do vetor que o utilizador deseja
//        inserir.
//        De seguida, permita ao utilizador preencher o vetor.
//        Posteriormente apresente um menu de opções ao utilizador, que permitem analisar o vetor inserido.
//        Esse menu de opções deve ter o seguinte aspeto:
//        7. Maior Elemento
//        8. Menor Elemento
//        9. Crescente ou Não Crescente


package FICHA_06;
import java.util.Scanner;
import static FICHA_06.EX05.*;

    public class EX06 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Declarar variáveis
            int tamanhoArray, opcao;

            // Perguntar tamanho do vetor
            System.out.print("Tamanho do Array: ");
            tamanhoArray=input.nextInt();

            // Declarar o array
            int[] vetor = new int[tamanhoArray];

            // Preencher o vetor
            for(int indice=0; indice<vetor.length;indice++){
                System.out.print("Insira no vetor["+indice+"]: ");
                vetor[indice]= input.nextInt();
            }

            // Analisar o vetor
            do{
                System.out.println("\n\n******* Análise do Vetor *******");
                System.out.println("1. Imprimir o Vetor");
                System.out.println("2. Maior Elemento");
                System.out.println("3. Menor Elemento");
                System.out.println("4. Crescente ou Não Crescente");
                System.out.println("0. Sair");
                System.out.print("\nInsira a opção: ");
                opcao= input.nextInt();

                switch (opcao){
                    case 1: // Imprimir o vetor
                        imprimirArray(vetor);
                        break;

                    case 2: // Maior elemento
                        System.out.println("Maior: "+maiorElementoArray(vetor));
                        break;

                    case 3: // Menor elemento
                        System.out.println("Menor: "+menorElementoArray(vetor));
                        break;

                    case 4: // Crescente ou não
                        if(arrayCrescente(vetor)){
                            System.out.println("Crescente");
                        }else{
                            System.out.println("Não Crescente");
                        }
                        break;

                    case 0: // Sair
                        System.out.println("Obrigado! Até logo!");
                        break;

                    default:
                        System.out.println("Opção Inválida");
                }
            }while(opcao!=0);
        }
    }