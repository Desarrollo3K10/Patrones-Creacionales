package prototype;

public class Prestamo implements Cloneable {
    private String libro, usuario, fechaInicio, fechaFin;

    public Prestamo(String libro, String usuario, String fechaInicio, String fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    // Implementamos clone() usando el método de Object
    @Override
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone(); // Shallow clone
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    // Getters y setters para poder modificar después

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    // Metodo para mostrar info
    public void mostrar(){
        System.out.println("Prestamo de " + libro + " a " + usuario + " desde " +fechaInicio+ " hasta " +fechaFin);
    }
}
