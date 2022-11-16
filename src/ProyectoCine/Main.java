
package ProyectoCine;

import java.util.Scanner;

public class Main {
    
    static Scanner entrada=new Scanner(System.in);
    static String arreglo [][]=new String[10][10];
    
    public static void main(String[] args) {
        
        Asientos();
        Cliente cli[]=new Cliente[100];
        String nombre;
        int edad,contC=0;
        double dinero;
        
        
        double precio;
        String titulo,duracion,director;
        int edadmin,opcion;
        
        
            System.out.print("Ingrese el nombre de la pelicula:  ");
            titulo=entrada.nextLine();
            System.out.print("Ingrese la dracion de la pelicula: ");
            duracion=entrada.nextLine();
            System.out.print("Ingrese la edad minima: ");
            edadmin=entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese el director de la pelicula");
            director=entrada.nextLine();
            Pelicula peli=new Pelicula(titulo, duracion, edadmin, director);
            System.out.print("Ingrese el precio del boleto");
            precio=entrada.nextDouble();
            Cine sala=new Cine(precio, peli);
 
            do {
                System.out.println("Menu de opciones");
                System.out.println("1-Comprar Boletos:");
                System.out.println("2-Salir");
                System.out.print("INGRESE LA OPCION: ");
                opcion=entrada.nextInt();
                switch(opcion){
                    case 1://Comprar Boletos
                        System.out.print("Ingrese la edad del cliente: ");
                        edad=entrada.nextInt();
                        if (edad<peli.getEdadmin()) {
                            System.out.println("Usted no puede ver esta Pelicula");
                        }else{
                            entrada.nextLine();
                            System.out.print("Ingrese le nombre: ");
                            nombre=entrada.nextLine();
                            System.out.print("Ingrese la cantidad de dinero: ");
                            dinero=entrada.nextDouble();
                           cli[contC]=new Cliente(nombre, edad, dinero);
                           comprarB();
                        }
                        break;
                    case 2: System.out.println("Gracias");
                    break;
                    default: System.out.println("EERRROS");
                        break;
                }
        } while (opcion!=2);
             
    }
    
    
    
    
    
    
    public static void Asientos(){
        String h;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                h=String.valueOf(i);
                
                if (j==0) {
                    arreglo[i][j]=h+"a";
                }else if (j==1) {
                    arreglo[i][j]=h+"b";
                }else if (j==2) {
                    arreglo[i][j]=h+"c";
                }else if (j==3) {
                    arreglo[i][j]=h+"d";
                }else if (j==4) {
                    arreglo[i][j]=h+"e";
                }else if (j==5) {
                    arreglo[i][j]=h+"f";
                }else if (j==6) {
                    arreglo[i][j]=h+"g";
                }else if (j==7) {
                    arreglo[i][j]=h+"h";
                }else if (j==8) {
                    arreglo[i][j]=h+"i";
                }else if (j==9) {
                    arreglo[i][j]=h+"j";
                }
                
            }
        }
    }
        
        public static void comprarB(){
        
            String asiento;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arreglo[i][j]+"   ");
            }
            System.out.println("");
        }
        entrada.nextLine();
        System.out.print("Elija un asiento ");
        asiento=entrada.nextLine();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (asiento.equals(arreglo[i][j])) {
                    arreglo[i][j]="So";
                }
            }
        }
        
        
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arreglo[i][j]+"   ");
            }
            System.out.println("");
        }
        
    }
    
    
}
