package Abstract;

public class EnvioExpress implements MetodoEnvio{
    @Override
    public void enviar() {
        System.out.println("Envío EXPRESS en proceso...");
    }
}
