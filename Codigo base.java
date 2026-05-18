import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaAprobacion = 6.0;
        
        System.out.println("=== REGISTRO DE CALIFICACIONES ===\n");
        
        // BLOQUE 1: Variables y entrada
        System.out.print("Nombre del alumno: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Cuantas materias curso? ");
        int cantidadMaterias = entrada.nextInt();
        
        // BLOQUE 2: Validación con if
        if (cantidadMaterias <= 0) {
            System.out.println("Error: minimo una materia.");
            return;
        }
        
        // BLOQUE 3: Arreglos y ciclos
        double[] calificaciones = new double[cantidadMaterias];
        double suma = 0;
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificacion materia #" + (i+1) + ": ");
            calificaciones[i] = entrada.nextDouble();
        }
        
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        
        // BLOQUE 4: Resultado
        double promedio = suma / calificaciones.length;
        
        System.out.println("\n===== RESULTADO =====");
        System.out.println("Alumno: " + nombre);
        System.out.println("Promedio: " + promedio);
        
        if (promedio >= notaAprobacion) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
        
        entrada.close();
    }
}