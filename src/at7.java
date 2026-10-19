public class at7 { public static void main(String[] args) {
    // Como o enunciado pede para percorrer de 1 a 100 de forma fixa,
    // não precisamos do Scanner para ler dados do usuário.

    int contador = 1;  // Começa a percorrer a partir do número 1
    int somaTotal = 0; // Armazena a soma acumulada dos múltiplos

    System.out.println("Calculando a soma dos múltiplos de 3 ou 5 entre 1 e 100...");

    // Laço Enquanto (while) para percorrer de 1 até 100
    while (contador <= 100) {

        // O operador || significa "OU".
        // O número será somado se for múltiplo de 3, ou se for de 5, ou de ambos.
        if (contador % 3 == 0 || contador % 5 == 0) {
            somaTotal += contador; // Soma o número atual ao total acumulado
        }

        contador++; // Incrementa o contador para avançar para o próximo número
    }

    // Prepara a janela gráfica para exibir os resultados na tela
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setAlwaysOnTop(true);

    // Exibe o painel final com o resultado da soma de todos os múltiplos encontrados
    javax.swing.JOptionPane.showMessageDialog(frame,
            "A soma de todos os múltiplos de 3 ou 5 no intervalo de 1 a 100 é: " + somaTotal,
            "Resultado Final (Project Euler #1)",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

    frame.dispose(); // Fecha os recursos da janela gráfica corretamente
}
}
