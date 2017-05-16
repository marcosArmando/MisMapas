package com.yucatancorp.mismapas;

/**
 * Created by marcos on 05/05/2017.
 */

public class Lugar {

    private String nombre;
    private double longitud;
    private double latitud;
    private int    logo;
    private int    foto;

    public Lugar(String nombre, double latitud, double longitud, int logo, int foto)
    {
        this.nombre   = nombre;
        this.longitud = longitud;
        this.latitud  = latitud;
        this.logo     = logo;
        this.foto     = foto;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
