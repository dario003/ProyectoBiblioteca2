import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        Libro libro1 = new Libro("El resplandor", 3293, 1);
        Prestamo pre = new Prestamo("Juan", 21, false);
        libro1.agregarPrestamo(pre);
        Prestamo pre1 = new Prestamo("Sebastian", 87, true);
        libro1.agregarPrestamo(pre1);

        Libro libro2 = new Libro("Amanecer en las ruinas", 5493, 3);
        Prestamo pre2 = new Prestamo("Jacinto", 11, true);
        libro2.agregarPrestamo(pre2);
        Prestamo pre3 = new Prestamo("Aurelio", 1, true);
        libro2.agregarPrestamo(pre3);

        ArrayList<Libro> libritos = new ArrayList<>();
        libritos.add(libro1);
        libritos.add(libro2);

        Biblioteca bib = new Biblioteca(libritos);

        Libro libro3 = new Libro("IT", 548, 3);
        Prestamo pre4 = new Prestamo("Julio Rodrigo", 11, false);
        libro2.agregarPrestamo(pre2);
        Prestamo pre5 = new Prestamo("Marco Polo", 17, true);
        libro2.agregarPrestamo(pre3);

        bib.agregarLibro(libro3);
        System.out.println("Cantidad de libros: "+bib.cantidadLibros());
        System.out.println("Cantidad por estado: "+bib.cantidadLibrosPorEstado(1));
        System.out.println("Esta es para vos que lo mira por tv: "+bib.listadoSolicitantes("IT"));
        //System.out.println(bib.cantidadLibros();
        System.out.println("Promedio de Prestamos: "+bib.promedioPrestamos());
        System.out.println("Suma de precio extraviados: "+bib.sumaPrecioExtraviados());
    }
}
