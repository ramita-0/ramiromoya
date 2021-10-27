package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/** url: http://localhost:8080/api/... **/

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    @Autowired
    private AccesoBaseDeDatos db;

    public Controller() {
        this.db = new AccesoBaseDeDatos();
    }

    @RequestMapping(value = "/datos/alumnos", method = RequestMethod.GET)
    public ResponseEntity<Object> obtenerDatos() {

        //conectar en linux
        //this.db.conectar("alumno","alumnoipm");

        //conectar en windows
        this.db.conectar("apitest","123");

        HashMap<String,Object> datos = db.serializarQuery("SELECT * FROM alumnos");
        return new ResponseEntity<>(datos, HttpStatus.OK);
    }

    @RequestMapping(value = "/datos/alumnos/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> obtenerInformacionDeAlumno(@PathVariable int id){

        //conectar en linux
        //this.db.conectar("alumno","alumnoipm");

        //conectar en windows
        this.db.conectar("apitest","123");

        HashMap<String, Object> datos = db.serializarQuery("SELECT * FROM alumnos WHERE id = " + id);
        return new ResponseEntity<>(datos,HttpStatus.OK);
    }

    @RequestMapping(value = "/datos/alumnos", method = RequestMethod.POST)
    public ResponseEntity<Object> postearAlumno(@RequestBody HashMap<String,String> alumno) {

        //conectar en linux
        //this.db.conectar("alumno","alumnoipm");

        //conectar en windows
        this.db.conectar("apitest","123");

        String nombre = alumno.get("nombre");
        String edad = alumno.get("edad");

        db.modificarTabla("INSERT INTO alumnos (nombre, edad) VALUES (" + "'" + nombre + "'" + ", " + edad + ")");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public AccesoBaseDeDatos getDb() {
        return db;
    }
}