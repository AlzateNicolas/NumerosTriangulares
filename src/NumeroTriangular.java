import java.math.BigInteger;

public class NumeroTriangular {

    public void verificar(BigInteger numero) {
        BigInteger ocho = BigInteger.valueOf(8);
        BigInteger resultado = numero.multiply(ocho);
        BigInteger discriminante = resultado.add(BigInteger.ONE);

        BigInteger raiz = discriminante.sqrt();

        BigInteger raizCuadrada = raiz.multiply(raiz);

        if (raizCuadrada.equals(discriminante)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}