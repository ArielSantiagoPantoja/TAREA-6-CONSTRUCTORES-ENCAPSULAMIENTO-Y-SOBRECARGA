/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Factura {
    private int id;
    private Pedido pedido;
    private float total;

    public Factura() {}

    public Factura(int id, Pedido pedido, float total) {
        this.id = id;
        this.pedido = pedido;
        this.total = total;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }

    public float getTotal() { return total; }
    public void setTotal(float total) { this.total = total; }

    public void imprimir() {
        System.out.println("Factura{id=" + id + ", pedido=" + pedido.getId() + ", total=" + total + "}");
    }
}
