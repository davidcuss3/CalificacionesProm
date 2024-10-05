import java.util.Scanner;
// Creamos la clase de Alumno
public class Alumno {

    private String nombre;
    private int[] calificaciones;
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new int[5];
    }

    // Funcion para introducir calificaciones
    public void introducirCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce las calificaciones de 5 materias para " + nombre + ":");
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }
    }

    // Funcion para calcular promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / 5.0; //
    }

    // Funcion para asignar una calificacion alfanumerica al promedio
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio >= 91 && promedio <= 100) {
            return 'A';
        } else if (promedio >= 8.1 && promedio <= 9.0) {
            return 'B';
        } else if (promedio >= 7.1 && promedio <= 8.0) {
            return 'C';
        } else if (promedio >= 6.1 && promedio <= 7.0) {
            return 'D';
        } else if (promedio >= 5.1 && promedio <= 6.0) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Metodo para imprimir las calificaciones
    public void mostrarResultado(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Metodo principal de clase
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = scanner.nextLine();
        Alumno alumno = new Alumno(nombre);
        alumno.introducirCalificaciones();

        double promedio = alumno.calcularPromedio();
        char calificacionFinal = alumno.obtenerCalificacionFinal(promedio);

        alumno.mostrarResultado(nombre, promedio, calificacionFinal);
    }
}
