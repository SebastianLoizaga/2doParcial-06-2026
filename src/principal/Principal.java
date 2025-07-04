package principal;

import articulo.Articulo;
import articulo.Componente;
import articulo.Composicion;
import cliente.Cliente;
import compra.Compra;
import empresa.Empresa;
import region.Continente;
import region.Pais;
import region.Provincia;

public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("FGingredientes");
        Cliente cliente1 = new Cliente("Dantien", new Provincia("Garin"), "Roma 555");
        Cliente cliente3 = new Cliente("Coca", new Pais("Estados Unidos"), "direccion");
        Cliente cliente4 = new Cliente("Luciannos", new Continente("Europa"), "Juramento 2900");
        empresa.addCliente(cliente1);
        empresa.addCliente(cliente3);
        empresa.addCliente(cliente4);
        Componente gomaGuar = new Componente("Goma Guar");
        Componente gomaXantica = new Componente("Goma Xantica");
        Componente bicDeSodio = new Componente("Bicarbonato de Sodio");
        Componente monoglicerido = new Componente("Monoglicido");
        Componente neutro = new Componente("E21");
        neutro.addComposicion(new Composicion(gomaGuar, 5));
        neutro.addComposicion(new Composicion(gomaXantica, 1));
        neutro.addComposicion(new Composicion(monoglicerido, 1));
        neutro.addComposicion(new Composicion(bicDeSodio, 3));
        Articulo articulo1 = new Articulo("Goma Guar", gomaGuar);
        Articulo articulo2 = new Articulo("E21", neutro);
        Articulo articulo3 = new Articulo("Goma Xantica", gomaXantica);
        Articulo articulo4 = new Articulo("Bicarbonato de Sodio", bicDeSodio);
        Articulo articulo5 = new Articulo("Monoglicerido", monoglicerido);
        empresa.addArticulo(articulo1);
        empresa.addArticulo(articulo2);
        empresa.addArticulo(articulo3);
        empresa.addArticulo(articulo4);
        empresa.addArticulo(articulo5);
        Compra compraCliente1 = new Compra();
        compraCliente1.addArticulo(articulo5);
        compraCliente1.addArticulo(articulo2);
        cliente1.addCompra(compraCliente1);
        Compra compraCliente3 = new Compra();
        compraCliente3.addArticulo(articulo3);
        compraCliente3.addArticulo(articulo2);
        cliente3.addCompra(compraCliente3);
        Compra compraCliente4 = new Compra();
        compraCliente4.addArticulo(articulo4);
        compraCliente4.addArticulo(articulo2);
        compraCliente4.addArticulo(articulo1);
        cliente4.addCompra(compraCliente4);
    }
}
