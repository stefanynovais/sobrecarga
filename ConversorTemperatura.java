

public class ConversorTemperatura {

    // método para converter celsius para fahrenheit
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // método para converter fahrenheit para celsius
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // método para converter celsius para fahrenheit, com ajuste de 2 e
    // arredondamento
    public int celsiusParaFahrenheit(double celsius, double ajuste) {
        return (int) Math.round(((celsius + ajuste) * 9 / 5) + 32);
    }

    // array de temperaturas, para percorrê-las todas de uma vez
    public double[] converterTodas(double[] temperaturasArray, boolean IsCelsiusToFahrenheit) {
        double[] resultado = new double[temperaturasArray.length];

        for (int i = 0; i < temperaturasArray.length; i++) {
            if (IsCelsiusToFahrenheit) {

                resultado[i] = celsiusParaFahrenheit(temperaturasArray[i]);

            } else {

                resultado[i] = fahrenheitParaCelsius(temperaturasArray[i]);

            }
        }
        return resultado;
    }
}