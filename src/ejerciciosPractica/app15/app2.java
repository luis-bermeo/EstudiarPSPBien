package ejerciciosPractica.app15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class app2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Map<Integer, Integer> repeticiones = new HashMap<>();
        int suma = 0;

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;

            while ((linea = br.readLine()) != null){
                int n = Integer.parseInt(linea);
                if(n <= 0) break;
                suma+=n;
                repeticiones.put(n, repeticiones.getOrDefault(n, 0) + 1);
                numeros.add(n);
            }

            if(numeros.isEmpty()){
                System.out.println("No hay numeros en el programa.");
                return;
            }

            //Calcular los dos mayores, el menor y la media
            Collections.sort(numeros);

            int mayor =  numeros.get(numeros.size()-1);
            int anteMayor =  numeros.get(numeros.size()-2);
            int menor =  numeros.get(0);
            double media = (double) suma / numeros.size();

            //Numero que más se repite
            int numeroMasRep =  numeros.get(0);
            int maxRep = 0;

            for(Map.Entry<Integer, Integer> entrada : repeticiones.entrySet()){
                if(entrada.getValue() > maxRep){
                    maxRep = entrada.getValue();
                    numeroMasRep = entrada.getKey();
                }
            }

            //Imprimir todo por pantalla
            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El segundo numero mayor es: " + anteMayor);
            System.out.println("El numero menor es: " + menor);
            System.out.println("La media es: " + media);
            System.out.println("El numero mas repetido es: " + numeroMasRep + " con un numero de repeticiones de " + maxRep);

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
