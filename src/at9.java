import java.util.Scanner;

public class at9 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Define o número secreto fixo no início do algoritmo
    int numeroSecreto = 42;
    int palpite = 0;
    int totalTentativas = 0;

    System.out.println("--- Jogo de Adivinhação Iniciado ---");
    System.out.println("Tente adivinhar o número secreto!");

    // Prepara a janela gráfica para exibir os feedbacks na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // O laço Enquanto continua rodando até que o palpite seja igual ao número secreto
    while (palpite != numeroSecreto) {
        System.out.print("\nDigite o seu palpite: ");
        palpite = sc.nextInt();
        totalTentativas++; // Conta quantas tentativas o usuário já fez

        // Se o palpite estiver correto, interrompe o laço imediatamente
        if (palpite == numeroSecreto) {
            break;
        }

        // Variável para montar o texto da dica que aparecerá na janela gráfica
        String dica = "Você ERROU!\n\n";

        // 1. Dica de tamanho (Maior ou Menor) usando o Se (if/else)
        if (palpite < numeroSecreto) {
            dica += "• O número secreto é MAIOR que " + palpite + ".\n";
        } else {
            dica += "• O número secreto é MENOR que " + palpite + ".\n";
        }

        // 2. Dica de paridade usando o Mod (%)
        if (palpite % 2 == 0) {
            dica += "• O palpite que você digitou (" + palpite + ") é PAR.";
        } else {
            dica += "• O palpite que você digitou (" + palpite + ") é ÍMPAR.";
        }

        // Exibe a janela gráfica com as dicas para a próxima tentativa
        javax.swing.JOptionPane.showMessageDialog(frame,
                dica,
                "Dica da Tentativa #" + totalTentativas,
                javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    // Janela de vitória exibida após o acerto (saída do loop)
    javax.swing.JOptionPane.showMessageDialog(frame,
            "🎉 PARABÉNS! Você acertou!\n\n" +
                    "• Número Secreto: " + numeroSecreto + "\n" +
                    "• Total de tentativas: " + totalTentativas,
            "Vitória!",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
