public class LineaDeTexto {
    private String frase;
    private int longitud;

    public LineaDeTexto(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
}
