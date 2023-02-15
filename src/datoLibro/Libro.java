package datoLibro;

public class Libro {
    private String titulo;
    private String autor;
    private String codigo;
    private String fechaPublica;
    
    public Libro(String titulo, String autor, String codigo, String fechaPublica){
        this.autor=autor;
        this.codigo=codigo;
        this.titulo=titulo;
        this.fechaPublica=fechaPublica;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getFecha(){
        return fechaPublica;
    }
}
