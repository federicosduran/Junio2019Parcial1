import java.util.ArrayList;

public class Mensaje {
    private String fecha;
    private int longitud;
    private Canal canal;
    private Interlocutor emisor;
    private ArrayList<Interlocutor> receptores;
    private ArrayList<LineaDeTexto> lineas;

    public Mensaje() {
        longitud=0;
        receptores = new ArrayList<>();
        lineas = new ArrayList<>();
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public void setCanal(Canal canal)
    {
        this.canal = canal;
    }

    public void setEmisor(Interlocutor emisor) {
        this.emisor = emisor;
    }
    public void añadirReceptor(Interlocutor receptor)
    {
        receptores.add(receptor);
    }
    public void añadirLinea(LineaDeTexto linea) {
        lineas.add(linea);
        longitud+= linea.getLongitud();

    }

    public void imprimirMensaje()
    {
        System.out.println("El contenido del mensaje es el siguiente:");
        for(LineaDeTexto linea :lineas)
        {
            System.out.println(linea);
        }

    }
}
