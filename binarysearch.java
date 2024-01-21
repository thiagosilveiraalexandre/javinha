import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        char[] vogais = {'u', 'e', 'a', 'o', 'i'};

        // Ordenando a lista de vogais
        Arrays.sort(vogais);

        // Imprimindo a lista ordenada
        System.out.println("Lista de Vogais Ordenada: " + Arrays.toString(vogais));

        // Realizando a busca binária
        char vogalProcurada = 'i';
        int indice = buscaBinaria(vogais, vogalProcurada);

        // Verificando se a vogal foi encontrada
        if (indice != -1) {
            System.out.println("A vogal '" + vogalProcurada + "' foi encontrada no índice " + indice + ".");
        } else {
            System.out.println("A vogal '" + vogalProcurada + "' não foi encontrada na lista.");
        }
    }

    // Função de busca binária
    private static int buscaBinaria(char[] array, char elemento) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == elemento) {
                return meio; // Elemento encontrado, retorna o índice
            } else if (array[meio] < elemento) {
                inicio = meio + 1; // Busca na metade superior
            } else {
                fim = meio - 1; // Busca na metade inferior
            }
        }

        return -1; // Elemento não encontrado
    }
}
