import java.util.Scanner;

public class at6 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número para verificar se é primo: ");
    int numero = sc.nextInt();

    int contador = 1;       // Começa a testar a divisão a partir do número 1
    int totalDivisores = 0; // Armazena quantas divisões exatas aconteceram

    // Laço Enquanto (while) que vai testar do 1 até o próprio número digitado
    while (contador <= numero) {

        // Usa o operador % (Mod) para checar se o número é divisível pelo contador atual
        if (numero % contador == 0) {
            totalDivisores++; // Se o resto for zero, conta como um divisor válido
        }

        contador++; // Incrementa o contador para testar o próximo divisor
    }

    // Prepara a janela gráfica para exibir os resultados na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // Um número é primo se, e somente se, possui exatamente 2 divisores (o 1 e ele mesmo)
    if (totalDivisores == 2) {
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O número " + numero + " É PRIMO.\nEle possui apenas " + totalDivisores + " divisores (1 e ele mesmo).",
                "Resultado Final",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } else {
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O número " + numero + " NÃO É PRIMO.\nEle possui " + totalDivisores + " divisores.",
                "Resultado Final",
                javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
