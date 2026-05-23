package unid02_Mi_profe_el_torturador;

public class DebugFibonacci { 
	 public static void main(String[] args) { 
	 int limite = 10; 
	 System.out.println("=== SUCESION DE FIBONACCI ==="); 
	 for (int i = 0; i <= limite; i++) { 
	 int resultado = fibonacci(i); 
	 System.out.println("Fibonacci de " + i + " = " + resultado); 
	 } 
	 System.out.println("\n=== ANALISIS MATEMATICO ===");
	 int suma = sumarFibonacci(limite); 
	 System.out.println("La suma total es: " + suma);  double media = calcularMedia(suma, limite);  System.out.println("La media es: " + media);  boolean esPar = comprobarPar(suma); 
	 System.out.println("¿La suma es par? " + esPar);  } 
	 public static int fibonacci(int n) {
		    if (n == 0) {
		        return 0;      // Corregido
		    }
		    if (n == 1) {
		        return 1;
		    }
		    return fibonacci(n - 1) + fibonacci(n - 2); // Corregido
		}
	 public static int sumarFibonacci(int limite) {
		    int suma = 0;
		    for (int i = 0; i <= limite; i++) { 
		        suma += fibonacci(i);             // Corregido: acumular
		    }
		    return suma;
		}
	 public static double calcularMedia(int suma, int limite) {
		    int cantidad = limite + 1;                
		    return (double) suma / cantidad;           // Corregido: división
		}
	 public static boolean comprobarPar(int numero) {
		    return numero % 2 == 0;   // Corregido
		}
	} 

