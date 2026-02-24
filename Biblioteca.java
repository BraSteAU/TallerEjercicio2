package TallerEjercicio2;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuscarLibro buscar = new BuscarLibro();
        int n,opcion;
        System.out.println("Ingrese la dimensión de la biblioteca");
        n=sc.nextInt();
        Libro[][] m = new Libro[n][n];
        System.out.println("Biblioteca");
        System.out.println("1)Ingresar libros\n 2)Encontrar precio mayor");
        opcion=sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                m=buscar.llenarBiblioteca(n,sc);
                break;
            case 2:
                Libro mayor = buscar.encontrarLibro(m);
                System.out.println("Libro más caro: " + mayor.getTitulo());
                System.out.println("Autor: " + mayor.getAutor());
                System.out.println("Precio: " + mayor.getPrecio());
                break;
                
        }
    }
}
