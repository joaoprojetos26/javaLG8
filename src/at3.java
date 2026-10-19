import java.util.Scanner;

public class at3 {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int contador = 1;         // Controla o laço para garantir as 15 repetições
    int contadorMultiplos4 = 0; // Armazena a quantidade de múltiplos de 4 encontrados

    System.out.println("Digite 15 números para contar os múltiplos de 4:");

    // Laço Enquanto (while) executando exatamente 15 vezes
    while (contador <= 15) {
        System.out.print("Digite o " + contador + "º número: ");
        int numero = sc.nextInt();

        // Usa o operador % (Mod) para verificar se o resto da divisão por 4 é zero
        if (numero % 4 == 0) {
            contadorMultiplos4++; // Incrementa o contador de múltiplos de 4
        }

        contador++; // Incrementa o contador do laço
    }

    // Prepara a janela gráfica para exibir os resultados na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // Verifica se algum múltiplo de 4 foi digitado para personalizar a resposta final
    if (contadorMultiplos4 > 0) {
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Total de números múltiplos de 4 digitados: " + contadorMultiplos4,
                "Resultado Final",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } else {
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Nenhum número múltiplo de 4 foi digitado.",
                "Aviso",
                javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
