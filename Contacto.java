public class Contacto {
    private String nombre;
    private String telefeno;
    private String correo;
    public Contacto(String nombre, String telefeno, String correo) {
        this.nombre = nombre;
        setTelefono(telefeno);
        setCorreo(correo);
    }
    public void setTelefono(String telefeno){
        if (telefeno.matches("[0-9+() -]+")) {
            this.telefeno = telefeno;
            System.out.println("telefono actualizado correctamente");
        } else {
            System.out.println("error: el telefono no puede contener letras");
        }
    }
    public void setCorreo(String correo) {
        if (correo.contains("@")) {
            this.correo = correo;
            System.out.println("correo actualizado correctamente");
        } else {
            System.out.println("error: el correo debe contener @");
        }
    }
    public String getDatos() {
        return "nombre: " + nombre + "\ntelefono: " + telefeno + "\ncorreo: " + correo;
    }
}
