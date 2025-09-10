package Builder;

public class Usuario {
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;

    // Constructor privado: solo se puede invocar desde el Builder
    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.email = builder.email;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    // Clase interna estática: el Builder
    public static class Builder {
        private String nombre;
        private String email;
        private String direccion;
        private String telefono;
        private String fechaNacimiento;

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }
        // Metodo final que construye el objeto
        public Usuario build() {
            return new Usuario(this);
        }
    }
    // Metodo para mostrar la información del usuario
    public void mostrarInfo() {
        System.out.println("Usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("-----------------------------");
    }
    }
