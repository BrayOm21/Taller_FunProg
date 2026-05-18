import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaAprobacion = 6.0;
        
        System.out.println("=== REGISTRO DE CALIFICACIONES ===\n");
        
        // ===== BLOQUE 1: VARIABLES Y ENTRADA =====
        System.out.print("Nombre del alumno: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Cuantas materias curso? ");
        int cantidadMaterias = entrada.nextInt();
        
        // TODO 1: Mostrar saludo con el nombre y cantidad de materias
        
        // ===== BLOQUE 2: VALIDACION CON IF =====
        // TODO 2: Validar que cantidadMaterias sea mayor a 0
        // Si no lo es, mostrar error y usar return para terminar
        
        // ===== BLOQUE 3: ARREGLOS Y CICLOS =====
        // TODO 3: Declarar arreglo double[] calificaciones con tamaño cantidadMaterias
        
        // TODO 4: Llenar el arreglo con un ciclo for
        // Pedir cada calificacion con entrada.nextDouble()
        
        // TODO 5: Declarar variable double suma = 0
        
        // TODO 6: Recorrer el arreglo con otro for y acumular la suma
        
        // ===== BLOQUE 4: RESULTADO FINAL =====
        // TODO 7: Calcular promedio = suma / calificaciones.length
        
        // TODO 8: Mostrar nombre, cantidad de materias y promedio
        
        // TODO 9: Usar if-else para mostrar si aprobo o reprobo
        // Usar la variable notaAprobacion como referencia
        
        entrada.close();
    }
}