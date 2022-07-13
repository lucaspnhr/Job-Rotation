import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a string: ");
        String valorEntrada = sc.nextLine();
        
        String stringInvertida = reverseString(valorEntrada);

        System.out.println("A string convertida ficou: "+stringInvertida);
    }

    public static String reverseString(String valorParaConverter){
        String resultado = "";
        char[] valor = valorParaConverter.toCharArray();

        for(int i = valor.length - 1; i >= 0; i--){
            resultado += valor[i];
        }

        return resultado;
    }
}
