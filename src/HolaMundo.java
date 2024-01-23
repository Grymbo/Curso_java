public class HolaMundo {
    public static void main(String[] args){
        String saludar = "Hola mundo desde java";

        System.out.println(saludar);
        System.out.println(saludar.toUpperCase());

        int numero = 11;
        System.out.println("numero = " + numero);
        
        String nombre;
        
        nombre = "Luffy";
        
        if(numero > 10) {
            nombre = "Zoro";
        }
        System.out.println("nombre = " + nombre);
    }
}
