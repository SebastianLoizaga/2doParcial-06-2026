package articulo;

public class Composicion {
    private Componente componente;
    private int cantUnidades;

    public Composicion(Componente componente, int cantUnidades){
        this.componente = componente;
        this.cantUnidades = cantUnidades;
    }

    public int getCantidadComponente(){
        return this.cantUnidades;
    }

    public Componente getComponente(){
        return this.componente;
    }

    /* public CompStr getCompStr(){

    } */
}
