package com.example.aromasapp.models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Usuarios  {
    public String nombreUsuario;
    public String contraseniaUsuario;

    public static boolean contraseniaUsuarioIsValis(String Usuario, String Contrasenia){
        for (Usuarios i: getUsuarios()){
            if (i.nombreUsuario.equals(Usuario)&& i.contraseniaUsuario.equals(Contrasenia)){
                return  true;
            }
        }
        return false;
    }
    public static List<Usuarios> getUsuarios(){
        List<Usuarios> list = new ArrayList<Usuarios>();
        Usuarios o = new Usuarios();
        o.nombreUsuario = "admin";
        o.contraseniaUsuario = "123456";
        list.add(o);

        Usuarios t = new Usuarios();
        t.nombreUsuario = "cliente1";
        t.contraseniaUsuario = "1234567";
        list.add(t);

        Usuarios n = new Usuarios();
        n.nombreUsuario = "cliente2";
        n.contraseniaUsuario = "1234";
        list.add(n);
        return list;
    }

}
