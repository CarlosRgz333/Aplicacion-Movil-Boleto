/*
Nombre: Rodriguez Chavez Carlos Arnoldo
Fecha: 03/05/2022
Descripcion: Ejercicio de repaso para la materia de programacion movil sobre un boleto de autobus
 */
package examenrepaso;

public class Boleto {
    private int id;
    private String nombreCliente;
    private String destino;
    private String tipoViaje;
    private String fecha;
    private double precio;
    
    private int edad;
    //Constructor Vacío
    public Boleto(){
        
    }
    //Constructor de Parametros
    public Boleto(int id, String nombreCliente, String destino, String tipoViaje, String fecha, double precio){
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.destino = destino;
        this.tipoViaje = tipoViaje;
        this.fecha = fecha;
        this.precio = precio;
    }
    //Constructor de Copia
    public Boleto(Boleto boleto){
        this.id = boleto.id;
        this.nombreCliente = boleto.nombreCliente;
        this.destino = boleto.destino;
        this.tipoViaje = boleto.tipoViaje;
        this.fecha = boleto.fecha;
        this.precio = boleto.precio;
    }
    //Encapsulamiento (SET´s & GET´s) | Metodos de propiedad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getTipoViaje() {
        return tipoViaje;
    }
    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Metodos de Accion
    
    public double calcularSubtotal(){
        double subtotal=0;
        if(tipoViaje.equalsIgnoreCase("sencillo")){
            subtotal=precio;
        }else if(tipoViaje.equalsIgnoreCase("doble")){
            subtotal=precio+(precio*.8);
        }
        return subtotal;
    }
    public double calcularImpuesto(){
        double impuesto;
        impuesto = calcularSubtotal()*.16;
        return impuesto;
    }
    public double calcularDescuento(int edad){
        
        double descuento=0;
        
        
        if(edad>60){
            descuento = (calcularSubtotal()+calcularImpuesto())*.5;
        }
        return descuento;
    }
    public double calcularPagoTotal(){
        double pagoTotal;
        pagoTotal = (calcularSubtotal()+calcularImpuesto())-calcularDescuento(getEdad());
        return pagoTotal;
    }
    
    public void imprimirImporte(){
        System.out.println("\n---Importe---");
        System.out.println("Subtotal = "+calcularSubtotal());
        System.out.println("Impuesto 16% (+) = "+calcularImpuesto());
        System.out.println("Descuento (-) = "+calcularDescuento(getEdad()));
        System.out.println("Total a Pagar = "+calcularPagoTotal());
        
    }
    
    public void imprimirBoleto(){
        System.out.println("\n------------------------------");
        System.out.println("\n---Boleto---");
        System.out.println("Id: "+getId());
        System.out.println("Nombre Cliente: "+getNombreCliente());
        System.out.println("Destino: "+getDestino());
        System.out.println("Tipo de Viaje: "+getTipoViaje());
        System.out.println("Fecha: "+getFecha());
        System.out.println("Precio: "+getPrecio());
        imprimirImporte();
        System.out.println("\n------------------------------");
    }
    
 
}
