import model.SenaiCalc;

public class Main {
    public static void main(String[] args) {
        SenaiCalc senai = new SenaiCalc(); //instancia de classe

        int resultado = senai.soma(5,5);
        System.out.println("o resultado da soma é: " + resultado);

        int resultado2 = senai.subtracao(5,3);
        System.out.println("o resultado da subtração é: " + resultado2);

        int resultado3 = senai.multiplicacao(5,5);
        System.out.println("o resultado da multiplicação é: " + resultado3);

        double resultado4 = senai.divisao(5.0,5.0);
        System.out.println("o resultado da divisão é: " + resultado4);

        int resultado5 = senai.modulo(5,7);
        System.out.println("o resto da divisão é: " + resultado5);

        System.out.println(senai.verCPF());

        }
    }
