package com.example.aromasapp.models;

import java.util.ArrayList;

public class Habitaciones {
    public String nombreHabitacion;
    public  String descripcionHabitacion;
    public  Habitaciones(String _nombre, String _descripcion){
        this.nombreHabitacion = _nombre;
        this.descripcionHabitacion = _descripcion;
    }
    public String toString(){
        return this.nombreHabitacion;
    }

    public  static  ArrayList<Habitaciones> getData(){
    ArrayList<Habitaciones> habitaciones  = new ArrayList<>();
        habitaciones.add(new Habitaciones("Galletitas",
                 "galletas deliciosas"));
        return habitaciones;
    }
}
