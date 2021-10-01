public class Prestamo {

    protected String solicitante;
    protected int cantidadDias;
    protected boolean devuelto;

    public Prestamo(String solicitante, int cantidadDias, boolean devuelto) {
        this.solicitante = solicitante;
        this.cantidadDias = cantidadDias;
        this.devuelto = devuelto;
    }
    public Prestamo(){

    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "solicitante='" + solicitante + '\'' +
                ", cantidadDias=" + cantidadDias +
                ", devuelto=" + devuelto +
                '}';
    }

}

