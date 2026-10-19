import java.util.Scanner;

public class at10 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor do troco em centavos (ex: 87): ");
    int centavos = sc.nextInt();

    // Salva o valor original apenas para exibir no relatório final
    int valorOriginal = centavos;

    // Variáveis para contar a quantidade de cada moeda
    int moedas25 = 0;
    int moedas10 = 0;
    int moedas5 = 0;
    int moedas1 = 0;

    // O laço Enquanto (while) continua rodando enquanto ainda houver centavos para converter
    while (centavos > 0) {

        // Verifica e retira o máximo de moedas de 25 centavos
        if (centavos >= 25) {
            moedas25 = centavos / 25;   // Divisão inteira descobre quantas moedas de 25 cabem
            centavos = centavos % 25;   // O operador % (Mod) guarda o resto que sobrou
        }
        // Verifica e retira o máximo de moedas de 10 centavos do que sobrou
        else if (centavos >= 10) {
            moedas10 = centavos / 10;
            centavos = centavos % 10;
        }
        // Verifica e retira o máximo de moedas de 5 centavos do que sobrou
        else if (centavos >= 5) {
            moedas5 = centavos / 5;
            centavos = centavos % 5;
        }
        // O que restar são moedas de 1 centavo
        else {
            moedas1 = centavos;
            centavos = 0; // Zera a variável para encerrar o laço Enquanto
        }
    }

    // Prepara a janela gráfica para exibir os resultados na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // Monta o texto com a menor quantidade de moedas necessária
    String resultadoTroco = "Para o valor de " + valorOriginal + " centavos, são necessárias:\n\n" +
            "• Moedas de 25¢: " + moedas25 + "\n" +
            "• Moedas de 10¢: " + moedas10 + "\n" +
            "• Moedas de 5¢:   " + moedas5 + "\n" +
            "• Moedas de 1¢:   " + moedas1;

    // Exibe a janela gráfica com a divisão do troco
    javax.swing.JOptionPane.showMessageDialog(frame,
            resultadoTroco,
            "Calculadora de Troco Eficiente",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
