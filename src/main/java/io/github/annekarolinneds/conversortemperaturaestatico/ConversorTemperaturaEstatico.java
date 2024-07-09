/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.annekarolinneds.conversortemperaturaestatico;

/**
 *
 * @author annekarolinneds
 */
public class ConversorTemperaturaEstatico {

    public static double kelvinParaCelsius(double k) {
        if (k < 0) {
            throw new IllegalArgumentException("Temperatura Kelvin não pode ser negativa.");
        }
        return k - 273.15;
    }

    public static double kelvinParaFahrenheit(double k) {
        if (k < 0) {
            throw new IllegalArgumentException("Temperatura Kelvin não pode ser negativa.");
        }
        return (k - 273.15) * 9/5 + 32;
    }

    public static double celsiusParaKelvin(double c) {
        if (c < -273.15) {
            throw new IllegalArgumentException("Temperatura Celsius não pode ser inferior a -273.15.");
        }
        return c + 273.15;
    }

    public static double celsiusParaFahrenheit(double c) {
        if (c < -273.15) {
            throw new IllegalArgumentException("Temperatura Celsius não pode ser inferior a -273.15.");
        }
        return (c * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double f) {
        if (f < -459.67) {
            throw new IllegalArgumentException("Temperatura Fahrenheit não pode ser inferior a -459.67.");
        }
        return (f - 32) * 5/9;
    }

    public static double fahrenheitParaKelvin(double f) {
        if (f < -459.67) {
            throw new IllegalArgumentException("Temperatura Fahrenheit não pode ser inferior a -459.67.");
        }
        return (f - 32) * 5/9 + 273.15;
    }

    public static void main(String[] args) {
        // Testes
        try {
            System.out.println("300K em Celsius: " + ConversorTemperaturaEstatico.kelvinParaCelsius(300));
            System.out.println("300K em Fahrenheit: " + ConversorTemperaturaEstatico.kelvinParaFahrenheit(300));

            System.out.println("27C em Kelvin: " + ConversorTemperaturaEstatico.celsiusParaKelvin(27));
            System.out.println("27C em Fahrenheit: " + ConversorTemperaturaEstatico.celsiusParaFahrenheit(27));

            System.out.println("80F em Celsius: " + ConversorTemperaturaEstatico.fahrenheitParaCelsius(80));
            System.out.println("80F em Kelvin: " + ConversorTemperaturaEstatico.fahrenheitParaKelvin(80));

            // Testando exceções
            System.out.println("Tentando converter -500K...");
            System.out.println(ConversorTemperaturaEstatico.kelvinParaCelsius(-500));  // Deve lançar exceção
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Tentando converter -300C...");
            System.out.println(ConversorTemperaturaEstatico.celsiusParaKelvin(-300));  // Deve lançar exceção
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Tentando converter -500F...");
            System.out.println(ConversorTemperaturaEstatico.fahrenheitParaCelsius(-500));  // Deve lançar exceção
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

