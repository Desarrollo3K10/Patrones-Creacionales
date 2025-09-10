package Abstract;

public class EnvioNormal implements MetodoEnvio{
    @Override
    public void enviar() {
        System.out.println("Envío NORMAL en proceso...");
    }
}
