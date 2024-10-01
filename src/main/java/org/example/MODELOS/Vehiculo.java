package org.example.MODELOS;

public class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private String ano;
    private String color;
    private String numeroPlaca;
    private String tipo;
    private String chasis;
    private String motor;
    private String tipoCombustible;
    private int cantidadPasajeros;
    private double valorComercial;
    private String numeroSerie;
    private String seguroVigente;
    private String fechaRegistro;
    private boolean esActivo;

    // Constructor vacío
    public Vehiculo() {}

    // Constructor lleno
    public Vehiculo(int id, String marca, String modelo, String ano, String color,
                    String numeroPlaca, String tipo, String chasis, String motor,
                    String tipoCombustible, int cantidadPasajeros, double valorComercial,
                    String numeroSerie, String seguroVigente, String fechaRegistro, boolean esActivo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
        this.numeroPlaca = numeroPlaca;
        this.tipo = tipo;
        this.chasis = chasis;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.cantidadPasajeros = cantidadPasajeros;
        this.valorComercial = valorComercial;
        this.numeroSerie = numeroSerie;
        this.seguroVigente = seguroVigente;
        this.fechaRegistro = fechaRegistro;
        this.esActivo = esActivo;
    }

    // Métodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getSeguroVigente() {
        return seguroVigente;
    }

    public void setSeguroVigente(String seguroVigente) {
        this.seguroVigente = seguroVigente;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isEsActivo() {
        return esActivo;
    }

    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }

}

