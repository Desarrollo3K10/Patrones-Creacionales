package Factory;

public class LibroFisico implements Libro{
    @Override
    public void mostrarTipo() {
        System.out.println("Este es un libro FÍSICO.");
    }
}
