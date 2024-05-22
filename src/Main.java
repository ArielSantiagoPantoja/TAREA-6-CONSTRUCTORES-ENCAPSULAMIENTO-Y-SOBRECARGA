/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear Productos-------------------------------------------------
        Producto p1 = new Producto(1, "Camiseta", 20.0f, 100);
        Producto p2 = new Producto(2, "Pantalón", 40.0f, 50);
        Producto p3 = new Producto(3, "Chaqueta", 60.0f, 30);
        Producto p4 = new Producto(4, "Gorra", 15.0f, 200);
        Producto p5 = new Producto(5, "Zapatos", 80.0f, 20);

        // Crear Clientes-------------------------------------------------
        Cliente c1 = new Cliente(1, "Juan Pérez", "Calle 123", "123456789");
        Cliente c2 = new Cliente(2, "María López", "Avenida 456", "987654321");
        Cliente c3 = new Cliente(3, "Carlos García", "Calle 789", "456789123");
        Cliente c4 = new Cliente(4, "Ana Torres", "Avenida 321", "321654987");
        Cliente c5 = new Cliente(5, "Luis Gómez", "Calle 456", "654987321");

        // -------------------------------------------------
                // Crear Vendedores-------------------------------------------------
        Vendedor v1 = new Vendedor(1, "Pedro Díaz", "1122334455");
        Vendedor v2 = new Vendedor(2, "Laura Fernández", "2233445566");
        Vendedor v3 = new Vendedor(3, "Miguel Ruiz", "3344556677");
        Vendedor v4 = new Vendedor(4, "Sofía Herrera", "4455667788");
        Vendedor v5 = new Vendedor(5, "Ricardo Ramos", "5566778899");

        // Crear Listas de Productos para los Pedidos-------------------------------------------------
        List<Producto> productosPedido1 = new ArrayList<>();
        productosPedido1.add(p1);
        productosPedido1.add(p2);

        List<Producto> productosPedido2 = new ArrayList<>();
        productosPedido2.add(p3);
        productosPedido2.add(p4);
        
        List<Producto> productosPedido3 = new ArrayList<>();
        productosPedido3.add(p5);
        
        List<Producto> productosPedido4 = new ArrayList<>();
        productosPedido4.add(p1);
        productosPedido4.add(p3);

        List<Producto> productosPedido5 = new ArrayList<>();
        productosPedido5.add(p2);
        productosPedido5.add(p4);
        productosPedido5.add(p5);

        // Crear Pedidos-------------------------------------------------
        Pedido ped1 = new Pedido(1, "2023-05-20", c1, v1, productosPedido1);
        Pedido ped2 = new Pedido(2, "2023-05-21", c2, v2, productosPedido2);
        Pedido ped3 = new Pedido(3, "2023-05-22", c3, v3, productosPedido3);
        Pedido ped4 = new Pedido(4, "2023-05-23", c4, v4, productosPedido4);
        Pedido ped5 = new Pedido(5, "2023-05-24", c5, v5, productosPedido5);

        // Calcular totales para las Facturas-------------------------------------------------
        float total1 = p1.getPrecio() + p2.getPrecio();
        float total2 = p3.getPrecio() + p4.getPrecio();
        float total3 = p5.getPrecio();
        float total4 = p1.getPrecio() + p3.getPrecio();
        float total5 = p2.getPrecio() + p4.getPrecio() + p5.getPrecio();

        // Crear Facturas-------------------------------------------------
        Factura f1 = new Factura(1, ped1, total1);
        Factura f2 = new Factura(2, ped2, total2);
        Factura f3 = new Factura(3, ped3, total3);
        Factura f4 = new Factura(4, ped4, total4);
        Factura f5 = new Factura(5, ped5, total5);

        // Imprimir Información de cada Objeto
System.out.println("___________________________________________________________________________________________________________________________________");

        p1.imprimir();
        c1.imprimir();
        v1.imprimir();
        ped1.imprimir();
        f1.imprimir();
   
System.out.println("___________________________________________________________________________________________________________________________________");
         
        p2.imprimir();   
        c2.imprimir();
        v2.imprimir();
        f2.imprimir();
        ped2.imprimir();
System.out.println("___________________________________________________________________________________________________________________________________");
       
    
        p3.imprimir();
        c3.imprimir();
        v3.imprimir();
        ped3.imprimir();
        f3.imprimir();

System.out.println("___________________________________________________________________________________________________________________________________");


        p4.imprimir();
        c4.imprimir();
        v4.imprimir();
        ped4.imprimir();
        f4.imprimir();

System.out.println("___________________________________________________________________________________________________________________________________");

        
        p5.imprimir();
        c5.imprimir();
        v5.imprimir();
        ped5.imprimir();
        f5.imprimir();
System.out.println("___________________________________________________________________________________________________________________________________");



    }
    
}



