package com.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ Crear objeto libro1 con constructor con parámetros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 10, 2);

        // 2️⃣ Crear libro2 con constructor por defecto
        Libro libro2 = new Libro();

        System.out.println("Ingrese titulo del libro:");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor:");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingrese numero de ejemplares:");
        libro2.setNumeroEjemplares(sc.nextInt());

        libro2.setEjemplaresPrestados(0);

        // 3️⃣ Crear objeto LibroTextoUNIAC
        LibroTextoUNIAC libroUniac = new LibroTextoUNIAC(
                "Programacion II",
                "Juan Perez",
                5,
                1,
                "Programacion",
                "Ingenieria"
        );

        // 4️⃣ Crear objeto Novela
        Novela novela = new Novela(
                "Sherlock Holmes",
                "Arthur Conan Doyle",
                6,
                2,
                "Policiaca"
        );

        // Probar método préstamo
        if (libro1.prestamo()) {
            System.out.println("Prestamo realizado correctamente");
        } else {
            System.out.println("No hay ejemplares disponibles");
        }

        // Probar método devolución
        if (libro1.devolucion()) {
            System.out.println("Devolucion realizada correctamente");
        } else {
            System.out.println("No hay libros prestados");
        }

        // Mostrar información de los objetos
        System.out.println("\n--- INFORMACION DE LIBROS ---");

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroUniac);
        System.out.println(novela);

        sc.close();
    }
}