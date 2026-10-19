import java.util.Scanner;

public class at8 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int contador = 1; // Controla o laço para garantir as 10 repetições
    int numero;

    System.out.println("Classificação de números pelo último dígito (Total: 10 números):");

    // Prepara a janela gráfica para exibir os resultados na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // Laço Enquanto (while) que executa exatamente 10 vezes
    while (contador <= 10) {
        System.out.print("Digite o " + contador + "º número inteiro: ");
        numero = sc.nextInt();

        // O operador % 10 (Mod 10) isola e descobre o último dígito de qualquer número inteiro
        int ultimoDigito = numero % 10;

        // Tratamento caso o usuário digite um número negativo
        if (ultimoDigito < 0) {
            ultimoDigito = Math.abs(ultimoDigito); // Converte para positivo para não quebrar a lógica
        }

        // Estrutura condicional Se (if / else if / else) para classificar o dígito
        if (ultimoDigito == 0) {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O número " + numero + " termina em 0.",
                    "Classificação (" + contador + "/10)",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else if (ultimoDigito == 5) {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O número " + numero + " termina em 5.",
                    "Classificação (" + contador + "/10)",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "O número " + numero + " termina com outro valor (" + ultimoDigito + ").",
                    "Classificação (" + contador + "/10)",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        contador++; // Incrementa o contador do laço
    }

    // Mensagem final após processar todos os números
    javax.swing.JOptionPane.showMessageDialog(frame,
            "Processamento dos 10 números concluído com sucesso!",
            "Fim do Programa",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
    sc.close();      // Fecha o leitor do teclado
}
}
