public class sprint2 {
        public static void main(String[] args) {
    
                int largo1 = 300;
                int ancho1 = 150;
                int profundidad1 = 20;
    
                int largo2 = 300;
                int ancho2 = 80;
                int profundidad2 = 35;
    
                // 1. Áreas de las piscinas
                int area2 = ancho2 * largo2;
                int area1 = ancho1 * largo1;
                System.out.println("La piscina 1 tiene un area de " + area1 +
                " y la piscina 2 tiene un area de " + area2);
    
                // 2. Volúmenes de las piscinas
                int volumen1 = area1 * profundidad1;
                int volumen2 = area2 * profundidad2;
                System.out.println("La piscina 1 tiene un volumen de " + volumen1 + 
                " y la piscina 2 tiene un volumen de " + volumen2);
        
                // 3. Los valores de las dos piscinas juntas
                int largonuevo = largo1;
                int anchonuevo = ancho1 + ancho2;
                System.out.println("El largo de las dos piscinas juntas es de " + largonuevo + 
                " y el nuevo ancho de las piscinas juntas es de " + anchonuevo);
        
                // 4. Área de las dos piscinas juntas
                int areanueva = largonuevo * anchonuevo;
                System.out.println("El area de las dos piscinas juntas es de " + areanueva);
        
                // 5. Volumen de las dos piscinas combinadas
                double volumennuevo = volumen1 + volumen2;
                System.out.println("El volumen de las dos piscinas juntas es de " + volumennuevo);
        
                // 6. Intercambiamos valores
                int aux = profundidad1;
                profundidad1 = profundidad2;
                profundidad2 = aux;
                
                //6. Nuevos valores las dos piscinas
                int volumennuevo1 = area1 * profundidad1;
                System.out.println("El nuevo volumen de la piscina 1 con las profundidades intercambiadas es de " + volumennuevo1);
                int volumennuevo2 = area2 * profundidad2;
                System.out.println("El nuevo volumen de la piscina 2 con las profundidades intercambiadas es de " + volumennuevo2);    
    
        }
    }
