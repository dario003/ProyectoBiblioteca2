import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Biblioteca() {
    }

    public void agregarLibro(Libro l){
        libros.add(l);
    }

    public int cantidadLibros(){

        return libros.size();
    }

    public int cantidadLibrosPorEstado(int estado){
        int cantidad = 0;
        int i = 0;
        if (libros.get(i).estado == estado){
            cantidad ++;
        }
        return cantidad;
    }

    public String listadoSolicitantes(String titulo){
        int i= 0;
        Prestamo pe = new Prestamo();

        for (Libro li: libros) {
            if (libros.get(i).getTitulo().equals(titulo)){
                System.out.println(libros.get(i).getTitulo());
            }
           i++;
        }
        return "Listo el poio";//tengo mis dudas, hay que probarlo
    }

    public float promedioPrestamos(){
        int cantidadPrestamos= 0;
        int c = 0;
        float promedio;
        for(Libro l : libros){
            if(l.getPrestamos().size() > 0)
                cantidadPrestamos += l.getPrestamos().size();
            c++;
        }
        promedio = cantidadPrestamos;// promedio = cantidadPrestamos/c;
        return promedio;
    }

    public float sumaPrecioExtraviados(){
        float pre = 0;
        for(Libro l : libros){
            if(l.estado == 3)
                pre += l.precio;
        }

        return pre;
    }

}

