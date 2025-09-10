package Singleton;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Database {
    private final List<String> libros = new ArrayList<>();


    //costructor privado
    private Database(){
        System.out.println("Instancia creada");
    }
    private static class Holder{
        private static final Database INSTANCE = new Database();
    }
    // Metodo público para obtener la instancia única
    public static Database getInstance() {
        return Holder.INSTANCE;
    }
    public void agregarLibro(String titulo){
        libros.add(titulo);
    }
    public List<String> getLibro(){
        return Collections.unmodifiableList(libros); //Collections.unmodifiableList → devuelve la lista en modo solo lectura (nadie la puede modificar desde afuera).
    }
    public void listarLibros(){
        if (libros.isEmpty()){
            System.out.println("(Sin libros)");
        } else {
            libros.forEach(l -> System.out.println("✮ " + l));
        }
    }
}
