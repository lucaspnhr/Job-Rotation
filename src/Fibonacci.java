import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor para testar na sequencia: ");
        int valorEntrada = sc.nextInt();
        
        System.out.println(estaNaSequencia(valorEntrada) ? "sim o valor esta na sequencia" : "nao, o valor nao esta na sequencia");
    }

    public static boolean estaNaSequencia(int valor){
        int f = 1;     // atual
        int ant = 0;   // anterior

        while (f < valor) {
           f += ant;
           ant = f - ant;
        }

        return f == valor;
    }
}
