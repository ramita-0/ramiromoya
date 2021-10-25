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
    private String nombreBaseDeDatos;
    private String nombreTabla;

    public AccesoBaseDeDatos(){
    }

    public void conectar(String user, String password) {

        String url = "jdbc:mysql://localhost:3306/" + this.nombreBaseDeDatos + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

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

    public ResultSet obtenerResultado(String consulta){

        ResultSet resultado = null;

        try {
            // pq no andas flaco??????! //de alguna manera conexion es null...
            Statement sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);


        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
        return resultado;
    }

    //querys
    public ResultSet seleccionarTodo(){
        String consulta = "SELECT * FROM " + this.nombreTabla;
        ResultSet resultado = this.obtenerResultado(consulta);
        return resultado;
    }

    //print querys
    public void imprimirDatosAlumno(ResultSet set) {

        ResultSet resultado = set;

        try {

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");

                System.out.println(id + " " + nombre + " " + edad);
            }

            resultado.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    //getColumnas
    public ResultSet mostrarColumnas(){
        String consulta = "SHOW COLUMNS FROM " + this.nombreTabla;
        ResultSet resultado = this.obtenerResultado(consulta);
        return resultado;
    }

    //arraylist de las columnas... ?
    public ArrayList<String> colocarCamposEnLista() {

        ArrayList<String> nombresDeCampos = new ArrayList<>();
        ResultSet resultado = this.mostrarColumnas();

        try {

            while (resultado.next()) {
                String nombreDeColumna = resultado.getString("field");
                nombresDeCampos.add(nombreDeColumna);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return nombresDeCampos;
    }

    public HashMap<String,Object> obtenerDatos(){

        HashMap<String,Object> mapASerializar = new HashMap<>();

        ArrayList<Persona> alumnos = new ArrayList<>();
        //POR QUE ME TIRAS NULL POINTERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR?!!!?!!?!?!!?!!!!?!!?!?!? SI ESTA CONECTADO A LA DB
        ResultSet resultado = this.obtenerResultado("SELECT * FROM alumno");

        ObjectMapper mapper = new ObjectMapper();

        String objetoJson = null;

        try {

            while (resultado.next()){

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");

                Persona alumnoActual = new Persona(id, nombre, edad);
                alumnos.add(alumnoActual);
            }
            mapASerializar.put("alumnos", alumnos);
        System.out.println(mapASerializar);
        }

        catch(SQLException e1){
            e1.printStackTrace();
        }

        return mapASerializar;
    }


    public void agregarAlumno(Alumno alumno) {
        /** completar **/
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

    /*
    Colocar mysql-connector-java-8.0.21.jar en una carpeta llamada lib

    File -> Project Structure -> + -> JARs y directorios ->
    seleccionar mysql-connector-java-8.0.21.jar -> tildar -> aplicar -> ok
    */
}
