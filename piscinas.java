public class piscinas {
        public static void main(String[] args) {
    
                int longitud1 = 300;
                int ancho1 = 150;
                int profundidad1 = 20;
    
                int longitud2 = 300;
                int ancho2 = 80;
                int profundidad2 = 35;
    
                // 1. Áreas de las piscinas
                System.out.println("Area de piscina 1: " + longitud1 * ancho1);
                System.out.println("Area de piscina 2: " + longitud2 * ancho2);
    
                // 2. Volúmenes de las piscinas
                System.out.println("Volumen de piscina 1: " + longitud1 * ancho1 * profundidad1);
                System.out.println("Volumen de piscina 2: " + longitud2 * ancho2 * profundidad2);
    
                // 3. Los valores de las dos piscinas juntas
                System.out.println("Longitud de piscina combinada: " + longitud1);
                System.out.println("Ancho de piscina combinada: " + (ancho1 + ancho2));
    
                // 4. Área de las dos piscinas juntas
                System.out.println("Area de piscina combinada: " + longitud1 * (ancho1 + ancho2));
    
                // 5. Volumen de las dos piscinas combinadas
                System.out.println("Volumen de piscina combinada: " + ((longitud1 * ancho1 * profundidad1) + (longitud2 * ancho2 * profundidad2)));
    
                // 6. Intercambiamos valores
                int intercambio = profundidad1;
                profundidad1 = profundidad2;
                profundidad2 = intercambio;
                
                //6. Nuevos valores piscin 1
                System.out.println("Hemos intercambiado los valores de la profundidad de las piscinas.");
                System.out.println("Longitud de piscina 1: " + longitud1);
                System.out.println("Ancho de piscina 1: " + ancho1);
                System.out.println("Profundidad de piscina 1 :" + profundidad1);
                System.out.println("Volumen de piscina 1: " + longitud1 * ancho1 * profundidad1);
    
                //7. Nuevos valores piscina 2
                System.out.println("Longitud de la piscina 2: " + longitud2);
                System.out.println("Ancho de piscina 2: " + ancho2);
                System.out.println("Profundidad de piscina 2: " + profundidad2);
                System.out.println("Volumen de piscina 2: " + longitud2 * ancho2 * profundidad2);
    
    
        }
    }
