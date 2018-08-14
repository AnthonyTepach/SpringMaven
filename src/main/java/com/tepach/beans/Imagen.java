/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.beans;

/**
 *
 * @author Anthony Tepach
 */
public class Imagen {
    private String nom_imagen;
    private String extencion;
    private String tamanio;

    public String getNom_imagen() {
        return nom_imagen;
    }

    public void setNom_imagen(String nom_imagen) {
        this.nom_imagen = nom_imagen;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
