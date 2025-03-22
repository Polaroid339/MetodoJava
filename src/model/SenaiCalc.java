package model;

public class SenaiCalc {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }
    public double divisao(double a, double b) {
        if (b != 0){
            return a / b;
        } else {
            System.out.println("Não é possivel dividir por 0");
            return 0;
        }
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public String verCPF() {
        return "555.666.777-88";
    }
}
