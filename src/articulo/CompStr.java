package articulo;

public class CompStr {
    private int cantidad;
    private String composicionStr;

    public CompStr(int cantidad, String composicionStr){
        this.cantidad = cantidad;
        this.composicionStr = composicionStr;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public String getCompoStr(){
        return this.composicionStr;
    }
}
