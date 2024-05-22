/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.List;

public class Pedido {
    private int id;
    private String fecha;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Producto> productos;

    public Pedido() {}

    public Pedido(int id, String fecha, Cliente cliente, Vendedor vendedor, List<Producto> productos) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.productos = productos;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Vendedor getVendedor() { return vendedor; }
    public void setVendedor(Vendedor vendedor) { this.vendedor = vendedor; }

    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }

    public void imprimir() {
        System.out.println("Pedido{id=" + id + ", fecha='" + fecha + "', cliente=" + cliente.getNombre() + ", vendedor=" + vendedor.getNombre() + ", productos=" + productos + "}");
    }
}

