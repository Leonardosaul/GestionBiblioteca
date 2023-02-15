package main;
import metodos.Metodo;


public class main {

    public static void main(String[] args) {
        System.out.println("Gestion de Libros de Biblioteca");
        boolean band=true;
        Metodo mt=new Metodo();
        
        do {
            System.out.println("1.Agregar Libro\n2.Eliminar Libro\n3).Mostrar Libros");
            int op=mt.sc.nextInt();
            
            switch (op) {
                case 1:
                    mt.agregar();
                    break;
                case 2:
                    mt.eliminar();
                    break;
                case 3:
                    mt.mostrar();
                    break;
                default:
                    band=false;
            }
        } while (band);
    }
    
}
