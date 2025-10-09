package Calculadora;

/*
 * @author raissa
 */
public class Calculos {
    public double calcular(double num1, double num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("Erro: Divisão por zero não é permitida.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operador inválido. Use apenas +, -, *, ou /.");
        }
    }
}
