package com.company;

import java.sql.*;

public class AccesoBaseDeDatos {

    private Connection conexion;
    private String nombreDB;
    private String nombreTabla;

    public AccesoBaseDeDatos(String nombreDB, String nombreTabla){
        this.nombreDB = nombreDB;
        this.nombreTabla = nombreTabla;
    }

    public void conectar(String user, String password){
        String url = "jdbc:mysql://localhost/" + this.nombreDB + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        try {

            conexion = DriverManager.getConnection(url, user, password);

            if (conexion != null) {
                System.out.println("Se ha conectado exitosamente con la base de datos");
            }

            else {
                System.out.println("No se ha podido conectar con la base de datos");
            }
        }

        catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public ResultSet obtenerResultado(String consulta){

        ResultSet resultado = null;

        try {

            Statement sentencia = this.conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);


        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }

        return resultado;
    }

    public ResultSet seleccionarTodo(){
        String consulta = "SELECT * FROM " + this.nombreTabla;
        ResultSet resultado = this.obtenerResultado(consulta);
        return resultado;
    }

    public void modificarTabla(String consulta) {
        /* INSERT, UPDATE, DELETE */
        try {
            Statement sentencia = this.conexion.createStatement();
            sentencia.executeUpdate(consulta);
            sentencia.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public String getDatos(ResultSet resultado) {

        String datos = null;

        try {


            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String dni = resultado.getString("dni");

                if (datos == null){
                    datos = id + " " + nombre + " "  + apellido + " "  + dni;
                }

                else{
                    datos = datos + "\n" + id + " " + nombre + " "  + apellido + " "  + dni;
                }
            }

            resultado.close();

        }
        catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
        return datos;
    }

    public void imprimirDatos(ResultSet resultado) {
        System.out.println(getDatos(resultado));
    }
}
