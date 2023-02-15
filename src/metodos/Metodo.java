package metodos;
import datoLibro.Libro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Metodo {
    ArrayList<Libro> bs=new ArrayList();
    public Scanner sc=new Scanner(System.in);
    Random rm=new Random();
    
    public void agregar(){
        String titulo,fecha,autor,codigo="";
        
        sc.nextLine();
        System.out.print("Ingrese el titulo: ");
        titulo=sc.nextLine();
        System.out.print("Ingrese el autor: ");
        autor=sc.nextLine();
        System.out.print("Ingrese la fecha de publicacion: ");
        fecha=sc.nextLine();
        
        if(bs.size()==0)
            codigo=String.valueOf(rm.nextInt(100000)+100000);
        else{
            for(int i=0;i<bs.size();i++){
                codigo=String.valueOf(rm.nextInt(100000)+100000);
                if(bs.get(i).getCodigo().equals(codigo)){
                    break;
                }
            }
        }
        
        
        bs.add(new Libro(titulo,autor,codigo,fecha));
        System.out.println("Agregado Exitosamente");
        System.out.println();
    }
    
    public void eliminar(){
        String codigo;
        
        System.out.print("Ingrese el codigo del libro: ");
        codigo=sc.next();
        
        if(bs.size()!=0){
            for(int i=0;i<bs.size();i++){
                if(bs.get(i).getCodigo().equals(codigo)){
                    bs.remove(i);
                    System.out.println("Eliminado Exitosamente");
                }
            }
        }
        System.out.println();
    }
    
    public void mostrar(){
        for(Libro libro:bs){
            System.out.println("Titulo: "+libro.getTitulo());
            System.out.println("Autor: "+libro.getAutor());
            System.out.println("Fecha de Publicacion: "+libro.getFecha());
            System.out.println("Codigo: "+libro.getCodigo());
        }
    }
}
