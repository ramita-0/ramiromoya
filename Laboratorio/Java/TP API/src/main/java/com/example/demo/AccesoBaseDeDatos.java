package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

@Service
public class AccesoBaseDeDatos {

    private Connection conexion;
    private final String nombreBaseDeDatos;
    private final String nombreTabla;

    public AccesoBaseDeDatos(){
        this.nombreBaseDeDatos = "mydb";
        this.nombreTabla = "alumnos";
    }

    public AccesoBaseDeDatos(String nombreBase, String nombreTabla){
        this.nombreBaseDeDatos = nombreBase;
        this.nombreTabla = nombreTabla;
    }


    // realiza la conexion a la db
    public void conectar(String user, String password) {
        //windows
        String url = "jdbc:mysql://localhost:3306/" + this.nombreBaseDeDatos + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        //linux
        //String url = "jdbc:mysql://localhost:3306/" + this.nombreBaseDeDatos;

        try {

            this.conexion = DriverManager.getConnection(url, user, password);

            if (conexion != null) {
                System.out.println("Se ha conectado exitosamente con la base de datos");
            } else {
                System.out.println("No se ha podido conectar con la base de datos");
            }

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    // devuelve el resultado del query, sin serializarlo
    public ResultSet obtenerResultado(String query){

        ResultSet resultado = null;

        try {
            Statement sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    // serializa el resultset del metodo de arriba
    public HashMap<String, Object> serializarQuery(String query){

        ResultSet resultado = this.obtenerResultado(query);
        HashMap<String, Object> json = new HashMap<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();

        try {

            while (resultado.next()){

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");

                Alumno alumnoActual = new Alumno(id, nombre, edad);
                alumnos.add(alumnoActual);
            }
            json.put("alumno(s)", alumnos);
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

        return json;
    }

    // modifica una tabla de la db, sirve para inserts, updates y deletes
    public void modificarTabla(String query) {
        /* INSERT, UPDATE, DELETE */
        try {
            Statement sentencia = this.conexion.createStatement();
            sentencia.executeUpdate(query);
            sentencia.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }


    public Connection getConexion() {
        return conexion;
    }
    public String getNombreBaseDeDatos() {
        return nombreBaseDeDatos;
    }
    public String getNombreTabla() {
        return nombreTabla;
    }
}
