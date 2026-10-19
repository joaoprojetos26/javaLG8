import java.util.Scanner;

public class at2 {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o número limite: ");
    int limite = sc.nextInt();

    int contador = 1; // Começa a percorrer a partir do número 1
    String resultadoMúltiplos = ""; // Variável para acumular os múltiplos encontrados

    // Laço Enquanto (while) para percorrer de 1 até o limite digitado
    while (contador <= limite) {

        // O operador % (Mod) verifica se o número é múltiplo de 3 E de 5 ao mesmo tempo
        if (contador % 3 == 0 && contador % 5 == 0) {
            resultadoMúltiplos += contador + " "; // Adiciona o número na lista de resultados
        }

        contador++; // Incrementa o contador para avançar para o próximo número
    }

    // Prepara a janela gráfica para exibir os resultados na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // Verifica se foi encontrado algum múltiplo no intervalo para evitar tela vazia
    if (!resultadoMúltiplos.trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Os números múltiplos de 3 e 5 ao mesmo tempo até " + limite + " são:\n" + resultadoMúltiplos,
                "Resultado Final",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } else {
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Nenhum número múltiplo de 3 e 5 ao mesmo tempo foi encontrado nesse intervalo.",
                "Aviso",
                javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
