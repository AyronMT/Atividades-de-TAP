import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Declaração do Scanner para detectar a entrada do usuário.
        Scanner entrada = new Scanner(System.in);

        // Declaração da variavel Juros.
        double juros;

        // Inicio do sistema, requisitando o valor do produto.
        System.out.println("Digite o valor do produto: ");
        double valorProduto = entrada.nextDouble();

        // Requisitando o numero de parcelas.
        System.out.println("Digite em quantas vezes voce deseja parcelar o produto: ");
        int parcelas = entrada.nextInt();

        // calculo do juros, utilizando a formula de juros compostos, onde o valor do juros é igual
        // a (1 + taxa de juros) elevado ao numero de parcelas, menos 1.
        juros = Math.pow(1 + 0.05, parcelas) - 1;
        
        // Calculo do valor final, somando o valor do produto mais o calculo do Juros.
        double valorFinal = valorProduto * (1 + juros);
        valorFinal = Math.round(valorFinal * 100.0) / 100.0;

        // Exibição do valor final.
        System.out.println("O valor final do produto é: " + valorFinal + "R$");

        // Fim do sistema.
        return;
    }
}