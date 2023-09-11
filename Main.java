import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Iniciamos el escanner para usarlos mas adelante
        int a[], b[], c[]; //Instanciamos los arreglos A,B,C

        a= new int[6]; //Declaramos el arreglo A con 6 espacios
        b= new int[6]; //Declaramos el arreglo A con 6 espacios
        c= new int[12]; //Declaramos el arreglo A con 6 espacios


        System.out.println("Guardando datos del primer arreglo...");
        for(int i=0 ; i<6 ; i++){
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite los seis numeros para el arreglo A:"));
            //System.out.println("Digite los doce numeros para el arreglo A: ");
            //a[i] = entrada.nextInt();

        }System.out.println("Guardando datos del segundo arreglo...");
        for(int i=0 ; i<6; i++){
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite los seis numeros para el arreglo B:"));
            //System.out.println("Digite los doce numeros para el arreglo B: ");
            //b[i] = entrada.nextInt();
        }

    int i=0; //Declaramos un nuevo iterador para poder usar en el while
    int j=0; //Inciamos el iterador para el arreglo C, resultante

    while(i<6){ //mientras i sea menor que 6 se cumple lo que esta dentro, 6 porque contiene 6 datos cada arreglo A y B
        for(int k=0 ; k<2 ; k++){ //mostrar 2 datos de A y guardar en C
            c[j] = a[i+k]; //Reemplazamos la posicion de arreglo C con el areglo A
            j++; //aumentamos J para segui acumulando datos
        }
        for(int k=0 ; k<2 ; k++){ //mostrar 2 datos de B y guardar en C
            c[j] = b[i+k]; //Reemplazamos la posicion de arreglo C con el areglo B
            j++; //aumentamos J para segui acumulando datos
        }
        i +=2; //iteramos de 2 en 2 para que se guarde 1A, 1B, 2A, 2B...
    }
        System.out.println("Los datos dela arreglo son: ");
    for(i=0 ; i<12 ; i++){ //Mostramos el arreglo resultante
        System.out.println(c[i]+" - ");

    }


    }
}