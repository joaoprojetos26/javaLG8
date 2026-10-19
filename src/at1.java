import java.util.Scanner;

public class at1 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int contador = 1; // Inicializa o contador para garantir as 20 repetições
    int numero;

    System.out.println("Verificação de Pares e Ímpares (Total: 20 números):");

    // Prepara a janela gráfica para exibir os resultados na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // Laço Enquanto (while) que roda exatamente até coletar 20 números
    while (contador <= 20) {
        System.out.print("Digite o " + contador + "º número: ");
        numero = sc.nextInt();

        // Calcula o resto da divisão por 2 usando o operador % (Mod)
        // E usa a estrutura condicional Se (if/else) para exibir a mensagem gráfica
        if (numero % 2 == 0) {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O número " + numero + " é PAR.",
                    "Resultado (" + contador + "/20)",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O número " + numero + " é ÍMPAR.",
                    "Resultado (" + contador + "/20)",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        contador++; // Incrementa o contador para avançar de 1 até 20
    }

    // Exibe uma mensagem de encerramento quando o laço termina
    javax.swing.JOptionPane.showMessageDialog(frame,
            "Processamento dos 20 números concluído com sucesso!",
            "Fim do Programa",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
