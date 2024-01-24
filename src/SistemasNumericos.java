public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 30;

        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("numero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal));
        System.out.println("numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal));
    }
}
