/*
Implemente una clase Libro_Fisica que contenga los siguientes atributos:
código de tipo entero, titulo de tipo String, autor de tipo String, 
anio_edicion de tipo entero.
Diseñe e implemente sus respectivos métodos get() y set() correspondientes para 
cada atributo; además, implemente el método toString() para mostrar la información 
relativa a la clase Libro_Fisica.
 */
package libro_fisicaapp;

/**
 *
 * @author DARIO CHISAGUANO AIMACAÑA 
 */
// Clase Libro_Fisica
class Libro_Fisica{
    //Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
    
    //Constructor
    public Libro_Fisica(int pCodigo, String pTitulo, String pAutor, int pAnio_Edicion){
        
       codigo= pCodigo;
       titulo=pTitulo;
       autor=pAutor;
       anio_edicion=pAnio_Edicion;
    }
    
    // Métodos
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void  setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void  setAutor(String autor){
        this.autor=autor;
    }
    
    public int getAnio_Edicion(){
        return anio_edicion;
    }
    
    public void  setAnio_Edicion(int anio_edicion){
        this.anio_edicion=anio_edicion;
    }
    
    @Override
    public String toString(){
        return "El libro selecionado es de Fisica del autor "+autor+" con CODIGO: "+codigo+"--"
                + " tiene como titulo "+titulo+
                 "y fue elaborado en el anio "+anio_edicion+ " sexta edición";
    }
}

public class Libro_FisicaApp {

    public static void main(String[] args) {
        // Creamos los objetos
        Libro_Fisica libro1=new Libro_Fisica(15," Fisica de Wilson  "," Wilson Buffa Lou", 2007);
       Libro_Fisica libro2=new Libro_Fisica(10," Física de SERWEY JEWETT "," Raymond Serwey y John Jewett", 2009);
        
        //Mostramos su estado
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        //Modificamos el Atributo NumMantenimiento del manual 11
        libro1.setAnio_Edicion(2010);
        
        //Comparamos quien tiene mas mantenimiento
        
        //if(libro1.getAnio_Edicion()<libro2.getAnio_Edicion()){
            //System.out.println(libro1.getAutor()+" tiene menor tiempo de ser publicado");
           // }else{
           // System.out.println(libro2.getAutor()+" tiene menor tiempo de ser publicado");
            //}
       }

}
    






















