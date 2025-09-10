import Abstract.*;
import Builder.Usuario;
import Factory.*;
import Singleton.Database;
import Factory.Libro;
import prototype.Prestamo;

public class Main {
    public static void main(String[] args) {
     //Singleton────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────
        // ✮⋆˙Obtenemos la instancia única
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        // ✮⋆˙Verificamos que son la misma instancia
        System.out.println("¿Son la misma instancia? " + (db1 == db2));
        //✮⋆˙Agregamos libros usando db1
        db1.agregarLibro("El Quijote");
        db1.agregarLibro("Clean Code");
        // ✮⋆˙Listamos usando db2 (misma base)
        db2.listarLibros();
        System.out.println("────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ");
    //Factory Method ────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────
        // ✮⋆˙Usamos la fábrica de libros físicos
        Logistica logisticaFisica = new LogisticaFisica();
        Libro libro1 = logisticaFisica.crearLibro();
        libro1.mostrarTipo();
        // ✮⋆˙Usamos la fábrica de libros digitales
        Logistica logisticaDigital = new LogisticaDigital();
        Libro libro2 = logisticaDigital.crearLibro();
        libro2.mostrarTipo();
        System.out.println("────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ");
    // Abstract Factory ────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────
        AbstractFactory factoryUsuario = new UsuarioFactory();
        AbstractFactory factoryAdmin = new AdminFactory();
        InterfazUI uiUsuario = factoryUsuario.crearUI();
        MetodoEnvio envioUsuario = factoryUsuario.crearEnvio();

        InterfazUI uiAdmin = factoryAdmin.crearUI();
        MetodoEnvio envioAdmin = factoryAdmin.crearEnvio();

        uiUsuario.mostrar();   // "Interfaz de Usuario Normal"
        envioUsuario.enviar(); // "Envío Normal"

        uiAdmin.mostrar();     // "Interfaz de Administrador"
        envioAdmin.enviar();   // "Envío Express"
        System.out.println("────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ");
    //Builder ────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────
        // Usuario con todos los datos
        Usuario u1 = new Usuario.Builder()
                .setNombre("Carla Fernández")
                .setEmail("carla@gmail.com")
                .setDireccion("Calle Falsa 123")
                .setTelefono("123456789")
                .setFechaNacimiento("1990-05-15")
                .build();
        // Usuario con datos parciales
        Usuario u2 = new Usuario.Builder()
                .setNombre("Juan Pérez")
                .setEmail("juanp@gmail.com")
                .build();

        // Mostrar la información
        u1.mostrarInfo();
        u2.mostrarInfo();
        System.out.println("────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ");
    //Prototype ────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────────୨ৎ────
        // Creamos un préstamo original (prototipo)
        Prestamo prestamoBase= new Prestamo("El Quijote", "Carla Fernández", "2025-08-01", "2025-08-15");

        // Clonamos y modificamos
        Prestamo prestamo1 = prestamoBase.clone();
        prestamo1.setUsuario("Juan Pérez");
        prestamo1.setFechaFin("2025-08-20");

        Prestamo prestamo2 = prestamoBase.clone();
        prestamo2.setUsuario("Ana López");
        prestamo2.setLibro("Clean Code");

        // Mostramos todos
        System.out.println("★ Préstamo original ");
        prestamoBase.mostrar();

        System.out.println("★ Clon 1 ");
        prestamo1.mostrar();

        System.out.println("★ Clon 2");
        prestamo2.mostrar();
    }
}
