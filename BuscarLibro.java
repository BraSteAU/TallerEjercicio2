package TallerEjercicio2;

import java.util.Scanner;

public class BuscarLibro {

    public Libro[][] llenarBiblioteca(int n, Scanner sc){
        Libro[][] m = new Libro[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Libro l = new Libro();
                System.out.println("Ingrese nombre del titulo");
                l.setTitulo(sc.nextLine());
                System.out.println("Ingrese nombre del autor ");
                l.setAutor(sc.nextLine());
                System.out.println("Ingrese precio del libro ");
                l.setPrecio(sc.nextInt());
                sc.nextLine();
                m[i][j] = l;
            }
        }
        return m;
    }
}
