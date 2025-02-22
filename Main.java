/* Actividad #3
Actividad: Elaborar una aplicación de consola que permita almacenar información sobre un visitante 
a un edificio de departamentos utilizando todos los tipos de datos primitivos en Java.
Diseña un programa que declare y asigne valores a variables para representar diferentes 
aspectos de la información del estudiante y luego imprima esos valores en pantalla. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu primer nombre? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuál es tu apellido? ");
        String apellido = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        byte edad = sc.nextByte();

        System.out.print("¿En qué año naciste? ");
        short añoNacimiento = sc.nextShort();

        System.out.print("¿Cuál es tu número de matrícula? ");
        int matricula = sc.nextInt();

        System.out.print("¿Cuántos alumnos hay en tu escuela? ");
        long numEstudiantes = sc.nextLong();

        System.out.print("¿Cuál es tu altura (en metros)? ");
        float altura = sc.nextFloat();

        System.out.print("¿Cuál es tu nota final? ");
        double nota = sc.nextDouble();

        System.out.print("¿Ya terminaste la escuela? (true o false): ");
        boolean finalizoEscuela = sc.nextBoolean();

        sc.nextLine();

        // Imprimir la información del estudiante
        System.out.println("\n=== Información del Estudiante ===");
        System.out.println("Nombre del alumno: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Año de nacimiento: " + añoNacimiento);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Total de estudiantes en la escuela: " + numEstudiantes);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Nota final: " + nota);
        System.out.println("¿Terminaste la escuela?: " + (finalizoEscuela ? "Sí" : "No"));

        sc.close();
    }
}
