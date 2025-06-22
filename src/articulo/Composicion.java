package articulo;

public class Composicion {
    private Componente subComponente;
    private int cantUnidades;

    public Composicion(Componente subComponente, int cantUnidades){
        this.subComponente = subComponente;
        this.cantUnidades = cantUnidades;
    }

    public int getCantidadComponente(){
        return this.cantUnidades;
    }

    public Componente getComponente(){
        return this.subComponente;
    }

    /* public CompStr getCompStr(){

    } */
}
