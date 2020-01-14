/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Arrays;

/**
 *
 * @author Alejandro Serrano Loredo
 */
public class EjerciciosRepaso {
    
    int[] listaNumeros = {99, 31, 27, 2, 5, 50};
    
    private int[] maximos(int[] lista){
        int maximo = lista[0];
        int maximo2 = lista[1];
        for(int i=0; i<lista.length; i++){
            if(maximo < lista[i]){
                maximo2 = maximo;
                maximo = lista[i];
            } else if(maximo2 < lista[i] && lista[i] != maximo){
                maximo2 = lista[i];
            }
        }
        int[] max = {maximo, maximo2};
        return max;
    }
    
    private boolean esPalindromo(String cadena){
            // Suponemos que el string que nos pasan no tiene tildes        
        cadena = cadena.toUpperCase();
        cadena = quita(cadena);
        int izquierda = 0;
        int derecha = cadena.length()-1;
        
        while((izquierda <= derecha) && (cadena.charAt(izquierda) == cadena.charAt(derecha))){
            izquierda++;
            derecha--;
        }
        if(izquierda > derecha){
            return true;
        }       
        return false;
    }
    
    public String quita(String cadena){
        String auxiliar = "";
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i) != ' '){
                auxiliar += cadena.charAt(i);
            }
        }
        return auxiliar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EjerciciosNivel01Java ejercicio = new EjerciciosNivel01Java();
        EjerciciosRepaso ejercicio = new EjerciciosRepaso();
        
        System.out.println("El números máximos son " + Arrays.toString(ejercicio.maximos(ejercicio.listaNumeros)));
        System.out.println("¿Es \"amoroma\" un palíndromo? -> " + ejercicio.esPalindromo("amoroma"));
    }
    
}
