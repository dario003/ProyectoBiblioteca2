import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Libro {

    protected String titulo;
    protected float precio;
    protected int estado;
    protected ArrayList<Prestamo> prestamos = new ArrayList<>();

    public Libro(){
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void agregarPrestamo(Prestamo nuevo){
        prestamos.add(nuevo);
    }

    public Libro(String titulo, float precio, int estado) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
    }

}
