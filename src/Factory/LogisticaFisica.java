package Factory;

public class LogisticaFisica extends Logistica {
    @Override
    public Libro crearLibro() {
        return new LibroFisico();
    }
}
