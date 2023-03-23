public class Main {
    public static void main(String[] args) {

        Mensaje mensaje = new Mensaje();
        mensaje.setCanal(new Email("federico_Sd@hotmail.com"));
        mensaje.setFecha("23/03/2023");

        Persona p1 = new Persona("Federico");
        Persona p2 = new Persona("Ángel");
        Persona p3 = new Persona("Julian");

        Entidad e1 = new Entidad("Praxis");
        Entidad e2 = new Entidad("UPCT");


        mensaje.setEmisor(p1);
        mensaje.añadirReceptor(e1);
        mensaje.añadirReceptor(e2);
        mensaje.añadirReceptor(p2);
        mensaje.añadirReceptor(p3);

        mensaje.añadirLinea(new LineaDeTexto("Buenas tardes"));
        mensaje.añadirLinea(new LineaDeTexto("el motivo de este mensaje"));
        mensaje.añadirLinea(new LineaDeTexto("es para probar el funcionamiento"));
        mensaje.añadirLinea(new LineaDeTexto("de este programa"));
        mensaje.añadirLinea(new LineaDeTexto("realizado en JAVA"));

        mensaje.imprimirMensaje();




    }
}
