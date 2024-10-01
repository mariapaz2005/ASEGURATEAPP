package org.example.MODELOS;

public class Accidente {
    private int id;
    private String fecha;
    private String lugar;
    private String descripcion;
    private String tipoAccidente;
    private double danosMateriales;
    private boolean hayLesionados;
    private String estado;
    private String idAsegurado;
    private String idVehiculo;

    // Constructores
    public Accidente() {}

    public Accidente(int id, String fecha, String lugar, String descripcion, String tipoAccidente,
                     double danosMateriales, boolean hayLesionados, String estado,
                     String idAsegurado, String idVehiculo) {
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipoAccidente = tipoAccidente;
        this.danosMateriales = danosMateriales;
        this.hayLesionados = hayLesionados;
        this.estado = estado;
        this.idAsegurado = idAsegurado;
        this.idVehiculo = idVehiculo;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public double getDanossMateriales() {
        return danosMateriales;
    }

    public void setDanossMateriales(double danosMateriales) {
        this.danosMateriales = danosMateriales;
    }

    public boolean isHayLesionados() {
        return hayLesionados;
    }

    public void setHayLesionados(boolean hayLesionados) {
        this.hayLesionados = hayLesionados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdAsegurado() {
        return idAsegurado;
    }

    public void setIdAsegurado(String idAsegurado) {
        this.idAsegurado = idAsegurado;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
}


