import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a= new int[6];
        b= new int[6];
        c= new int[12];


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

    int i=0;
    int j=0;
    while(i<6){ //mientras i sea menor que 6 se cumple lo que esta dentro.
        for(int k=0 ; k<2 ; k++){ //mostrar 2 datos de A y guardar en C
            c[j] = a[i+k];
            j++;
        }
        for(int k=0 ; k<2 ; k++){ //mostrar 2 datos de B y guardar en C
            c[j] = b[i+k];
            j++;
        }
        i +=2; //iteramos de 2 en 2
    }
        System.out.println("Los datos dela arreglo son: ");
    for(i=0 ; i<12 ; i++){
        System.out.println(c[i]+" - ");

    }


    }
}