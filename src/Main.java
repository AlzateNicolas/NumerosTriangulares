import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroTriangular verificador = new NumeroTriangular();

        while (true) {
            BigInteger numero = scanner.nextBigInteger();

            if (numero.equals(BigInteger.ZERO)) {
                break;
            }

            verificador.verificar(numero);
        }

        scanner.close();
    }
}