public class PaqueteDeEnvio {
    Persona remitente;
    Persona destinatario;
    String tipoEnvio;
    String contenido;
    int peso;

    public PaqueteDeEnvio(Persona remitente, Persona destinatario, String tipoEnvio, String contenido, int peso) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.tipoEnvio = tipoEnvio;
        this.contenido = contenido;
        this.peso = peso;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    public static class Persona {
        String nombre;
        String apellido;
        int numDocIdentidad;
        String direccion;
        int telefono;

        public Persona(String nombre, String apellido, int numDocIdentidad, String direccion, int telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numDocIdentidad = numDocIdentidad;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public int getNumDocIdentidad() {
            return numDocIdentidad;
        }
        public String getDireccion() {
            return direccion;
        }
        public int getTelefono() {
            return telefono;
        }
    }
}
