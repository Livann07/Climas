package com.example.itlm.myapplication.forecastModels;

public class headerForecast {

    String fecha,pronostico,temperatura,icono,problluvia,velViento,humedad;

    public headerForecast() {
    }

    public headerForecast(String fecha, String pronostico, String temperatura, String icono, String problluvia, String velViento, String humedad) {
        this.fecha = fecha;
        this.pronostico = pronostico;
        this.temperatura = temperatura;
        this.icono = icono;
        this.problluvia = problluvia;
        this.velViento = velViento;
        this.humedad = humedad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getProblluvia() {
        return problluvia;
    }

    public void setProblluvia(String problluvia) {
        this.problluvia = problluvia;
    }

    public String getVelViento() {
        return velViento;
    }

    public void setVelViento(String velViento) {
        this.velViento = velViento;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }
}
