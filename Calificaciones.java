import java.util.Scanner;

public class Calificaciones {

    private String nombre;
    private double[] calificaciones = new double[5];

    public double calcularPromedio() {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados(double promedio, char calificacionFinal) {

        System.out.println("\nUniversidad Tecmilenio");
        System.out.println("Nombre del estudiante: " + nombre);

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + calificaciones[i]);
        }

        System.out.println("Promedio final: " + promedio);
        System.out.println("Calificacion: " + calificacionFinal);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Calificaciones alumno = new Calificaciones();

        System.out.print("Ingrese el nombre del estudiante: ");
        alumno.nombre = entrada.nextLine();

        for (int i = 0; i < alumno.calificaciones.length; i++) {
            System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
            alumno.calificaciones[i] = entrada.nextDouble();
        }

        double promedio = alumno.calcularPromedio();
        char calificacionFinal = alumno.obtenerCalificacionFinal(promedio);

        alumno.imprimirResultados(promedio, calificacionFinal);
    }
}
