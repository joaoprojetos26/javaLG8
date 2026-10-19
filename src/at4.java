import java.util.Scanner;

public class at4 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int contador = 1;      // Controla o laço para garantir as 12 repetições
    int totalPares = 0;    // Armazena a quantidade de números pares
    int totalImpares = 0;  // Armazena a quantidade de números ímpares

    System.out.println("Digite 12 números para separá-los em pares e ímpares:");

    // Laço Enquanto (while) executando exatamente 12 vezes
    while (contador <= 12) {
        System.out.print("Digite o " + contador + "º número: ");
        int numero = sc.nextInt();

        // Usa o operador % (Mod) para testar se o número é par ou ímpar
        if (numero % 2 == 0) {
            totalPares++;   // Se o resto for 0, incrementa o grupo dos pares
        } else {
            totalImpares++; // Caso contrário, incrementa o grupo dos ímpares
        }

        contador++; // Incrementa o contador do laço
    }

    // Prepara a janela gráfica para exibir os resultados na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // Exibe o painel final com o resumo das contagens
    javax.swing.JOptionPane.showMessageDialog(frame,
            "Análise dos 12 números concluída:\n\n" +
                    "• Quantidade de números PARES: " + totalPares + "\n" +
                    "• Quantidade de números ÍMPARES: " + totalImpares,
            "Resultado Final",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
