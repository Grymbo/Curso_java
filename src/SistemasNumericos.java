import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingresa un numero cualquiera");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error!!!, usted debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        char saltoLinea = '\n';
        String resultado = "numeroDecimal = " + numeroDecimal;
        String resultadoBinario = "numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadcimal = "numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);

        System.out.println(resultado);
        System.out.println(resultadoBinario);
        System.out.println(resultadoOctal);
        System.out.println(resultadoHexadcimal);

        String mensaje = "numeroDecimal = " + numeroDecimal + saltoLinea;
        mensaje += "numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal) + saltoLinea;
        mensaje += "numero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal) + saltoLinea;
        mensaje += "numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
