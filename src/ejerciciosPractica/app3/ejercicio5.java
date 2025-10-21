package ejerciciosPractica.app3;

public class ejercicio5 {
    public static void main(String[] args) {
        if(args.length<=0){
            System.err.println("Argumento incorrecto!");
        } else{
            String frase = args[0];
            StringBuilder sb = new StringBuilder(frase);
            String fraseInvertida = sb.reverse().toString();

            System.out.println("Frase original: " + frase);
            System.out.println("Frase invertida: " + fraseInvertida);
        }
    }
}
