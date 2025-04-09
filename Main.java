

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        double celsius;
        double resultadoF;
        double fahrenheit;
        double resultadoC;
        double celsiusAjuste;
        int resultadoAjuste;
        int tipoConversão;
        int tamanho;

        ConversorTemperatura conversor1 = new ConversorTemperatura();

        do {
            // menu interativo
            System.out.println("Bem-vindo ao sistema de Conversão de Temperaturas!");
            System.out.println();
            System.out.println("Escolha uma operação: ");
            System.out.println();
            System.out.println("1- Converter Celsius para Fahrenheit");
            System.out.println("2- Converter Fahrenheit para Celsius");
            System.out.println("3- Converter Celsius para Fahrenheit, com ajuste de 2 e arredondamento no valor final");
            System.out.println("4- Converter todas as temperaturas de uma vez");
            System.out.println("0- Sair");
            System.out.println();
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            System.out.println();

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");

                    celsius = teclado.nextDouble();
                    resultadoF = conversor1.celsiusParaFahrenheit(celsius);

                    System.out.println("A temperatura " + celsius + "°C em Fahrenheit é: " + resultadoF + "°F\n\n");
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");

                    fahrenheit = teclado.nextDouble();
                    resultadoC = conversor1.fahrenheitParaCelsius(fahrenheit);

                    System.out.println("A temperatura " + fahrenheit + "°F em Celsius é: " + resultadoC + "°C\n\n");
                    break;

                case 3:
                    System.out.print("Digite a temperatura em Celsius: ");

                    celsiusAjuste = teclado.nextDouble();
                    resultadoAjuste = conversor1.celsiusParaFahrenheit(celsiusAjuste, 2);

                    System.out.println("A temperatura " + celsiusAjuste
                            + "°C em Fahrenheit com ajuste de 2 e arredondamento é: " + resultadoAjuste + "°F\n\n");
                    break;

                case 4:
                    // converter todas as temperaturas de uma vez, com quantidade de temperaturas
                    System.out.print("Quantas temperaturas deseja coverter?: \n");
                    tamanho = teclado.nextInt();
                    double[] temperaturas = new double[tamanho];

                    for (int i = 0; i < tamanho; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + ": \n");
                        temperaturas[i] = teclado.nextDouble();
                    }

                    System.out.print("Escolha a conversão: \n");
                    System.out.println("1- Celsius para a Fahrenheit");
                    System.out.println("2- Fahrenheit para Celsius");
                    tipoConversão = teclado.nextInt();

                    boolean IsCelsiusToFahrenheit = tipoConversão == 1;

                    double[] resultado = conversor1.converterTodas(temperaturas, IsCelsiusToFahrenheit);

                    if (IsCelsiusToFahrenheit) {

                        System.out.print("Temperaturas convertidas de Celsius para Fahrenheit: \n");

                    } else {

                        System.out.print("Temperaturas convertidas de Fahrenheit para Celsius: ");

                    }

                    for (int i = 0; i < resultado.length; i++) {
                        System.out.println(resultado[i]);
                        
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção Inválida! Tente novamente.\n\n");
            }

        } while (opcao != 0);
    }
}
