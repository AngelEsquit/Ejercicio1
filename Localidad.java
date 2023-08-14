import java.util.Random;

public class Localidad {
    Random random = new Random();
    private String nombreLoc;
    private int numLoc;
    private int precioLoc;

    public void setNombreLoc(String nombreLoc) {
        this.nombreLoc = nombreLoc;
    }

    public String getNombreLoc() {
        return nombreLoc;
    }

    public void setNumLoc(int numLoc) {
        this.numLoc = numLoc;
    }

    public int getNumLoc() {
        return numLoc;
    }

    public void setPrecioLoc(int precioLoc) {
        this.precioLoc = precioLoc;
    }

    public int getPrecioLoc() {
        return precioLoc;
    }

    //Este método se agregó para hacer la resta de boletos disponibles
    public void compraNumLoc(int n) {
        this.numLoc -= n;
    }
}
