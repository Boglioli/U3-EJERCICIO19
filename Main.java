public class Main {
    public static void main(String[] args) {
        Contacto contacto = new Contacto("martin", "2634651964", "martin@gmail.com");
        System.out.println("\ndatos iniciales:");
        System.out.println(contacto.getDatos());
        contacto.setTelefono("987cba654");
        contacto.setCorreo("martin.gmail.com");
        contacto.setTelefono("64845895");
        contacto.setCorreo("martin@hotmail.com");
        System.out.println("\ndatos finales:");
        System.out.println(contacto.getDatos());
    }
}
