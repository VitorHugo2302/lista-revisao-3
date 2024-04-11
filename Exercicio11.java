/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listarevisao3;

/**
 *
 * @author Vitor Hugo
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo da adivinhação! Tente adivinhar o número de 1 a 100.");

        while (!acertou) {
            System.out.print("Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }

        scanner.close();
    }
}
