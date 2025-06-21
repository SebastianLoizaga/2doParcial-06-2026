package empresa;

import cliente.Cliente;
import java.util.ArrayList;
import java.util.List;

import articulo.Articulo;

public class Empresa {
    private String razonSocial;
    private List<Cliente> clientes;
    private List<Articulo> articulos;

    public Empresa(String razonSocial){
        this.razonSocial = razonSocial;
        clientes = new ArrayList<Cliente>();
        articulos = new ArrayList<Articulo>();
    }

    public void addArticulo(Articulo articulo){
        articulos.add(articulo);
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    /* public List<Cliente> getCliente(){

    }

    public List<Articulo> getArticulo(){
        
    } */
}
