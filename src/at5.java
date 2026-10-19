import java.util.Scanner;

public class at5 {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Cria e prepara a janela gráfica para exibir as mensagens na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    System.out.println("--- Verificador de Divisibilidade ---");

    // Variável de controle para continuar ou parar o laço Enquanto
    String continuar = "S";

    // Laço Enquanto roda enquanto a variável continuar for igual a "S" ou "s"
    while (continuar.equalsIgnoreCase("S")) {
        System.out.print("\nDigite o número (N): ");
        int n = sc.nextInt();

        System.out.print("Digite o divisor (D): ");
        int d = sc.nextInt();

        // Proteção contra divisão por zero para evitar erro no programa
        if (d == 0) {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Erro: Não é possível dividir por zero!",
                    "Erro Matemático",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            // Usa o operador % (Mod) para verificar se o resto da divisão é zero
            if (n % d == 0) {
                javax.swing.JOptionPane.showMessageDialog(frame,
                        "O número " + n + " É divisível por " + d + ".",
                        "Resultado do Teste",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(frame,
                        "O número " + n + " NÃO é divisível por " + d + ".",
                        "Resultado do Teste",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        }

        // Pergunta ao usuário se ele deseja continuar testando novos pares
        System.out.print("Deseja testar outro par de números? (S/N): ");
        continuar = sc.next();
    }

    // Mensagem final ao encerrar o programa
    javax.swing.JOptionPane.showMessageDialog(frame,
            "Programa encerrado com sucesso!",
            "Fim",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
