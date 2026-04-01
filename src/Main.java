import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n=======================");
            System.out.println("-- CALCULE O SEU IMC --");
            System.out.println("=======================");

            System.out.println("Classificações: ");
            System.out.println("--------------------------------------------");
            System.out.println("Menos que 18,5kg: Abaixo do peso/Magreza |");
            System.out.println("18,5kg a 24,9kg: Peso normal/adequado |");
            System.out.println("25,0kg a 29,9kg: Sobrepeso |");
            System.out.println("30,0kg a 34,9kg: Obesidade grau I |");
            System.out.println("35,0kg a 39,9kg: Obesidade grau II |");
            System.out.println("Maior que 40kg: Obesidade grau III(mórbida) |");
            System.out.println("--------------------------------------------");

            System.out.print("Por favor, digite o seu peso: ");
            double peso = input.nextDouble();

            System.out.print("Por favor, digite a sua altura: ");
            double altura = input.nextDouble();

            double result = peso / (altura * altura);

            if (result < 18.5) {
                System.out.print("Seu IMC é: " + result + " | Abaixo do peso");
            }
            else if (result >= 18.5 && result <= 24.9) {
                System.out.print("Seu IMC é: " + result + " | Peso normal");
            }
            else if (result >= 25.0 && result <= 29.9) {
                System.out.print("Seu IMC é: " + result + " | Sobrepeso");
            }
            else if (result >= 30.0 && result <= 34.9) {
                System.out.print("Seu IMC é: " + result + " | Obesidade grau I");
            }
            else if (result >= 35.0 && result <= 39.9) {
                System.out.print("Seu IMC é: " + result + " | Obesidade grau II");
            }
            else {
                System.out.println("Seu IMC é: " + result + " | Obesidade grau III(mórbida)");
            }

            System.out.print("\nDeseja refazer o IMC? (s/n)");
            while (true) {
                String choice = input.next();
                if (choice.equalsIgnoreCase("s")) {
                    break;
                }
                else if (choice.equalsIgnoreCase("n")) {
                    System.out.println("\nObrigado, até a próxima! Encerrando...");
                    return;
                }
                else {
                    System.out.println("** Erro: digite 's' para sim e 'n' para não.");
                    System.out.print("-- Deseja refazer o IMC? (s/n)");
                }
            }
        }


    }
}