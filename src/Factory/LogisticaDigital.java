package Factory;

public class LogisticaDigital extends Logistica{
    @Override
    public Libro crearLibro() {
        return new LibroDigital();
    }
}
