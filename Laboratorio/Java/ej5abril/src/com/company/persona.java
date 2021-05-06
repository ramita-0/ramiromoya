package com.company;

public class persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    //constructores
    public void datosDefault(){
        nombre="xxxx";
        edad=1;
        dni=11111111;
        telefono=1100000000;
        direccion="xxxx";
    }
    public void newNombre(String nuevoNombre, dni){
        nombre=nuevoNombre;
    }
    public void newTodo(String nNombre,int nEdad,int nDni,int nTel,String nDir){
        nombre = nNombre;
        edad = nEdad;
        dni = nDni;
        telefono = nTel;
        direccion = nDir;
    }

    //getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getDni(){
        return dni;
    }
    public int getTel(){
        return telefono;
    }
    public String getDir(){
        return direccion;
    }

    //setters
    public void setNombre(String nNombre){
        nombre = nNombre;
    }
    public void setEdad(int nEdad){
        edad = nEdad;
    }
    public void setDni(int nDni){
        dni = nDni;
    }
    public void setTel(int nTel){
        telefono = nTel;
    }
    public void setDir(String nDir){
        direccion = nDir;
    }
}


