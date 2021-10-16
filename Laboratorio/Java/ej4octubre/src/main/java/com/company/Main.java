package com.company;

public class Main {

    public static void main(String args []){

        AccesoBaseDeDatos base = new AccesoBaseDeDatos("mydb", "table1");

        base.conectar("rama","123");

        base.modificarTabla("INSERT INTO table1 VALUES (id, 'Rama', 'Moya', '45000000');");
        base.modificarTabla("INSERT INTO table1 VALUES (id, 'Jose', 'Miranda', '45428001');");
        base.modificarTabla("INSERT INTO table1 VALUES (id, 'Mariano', 'Bellante', '4400301');");

        LecturaEscrituraArchivos.escrituraArchivo(base);
        LecturaEscrituraArchivos.lecturaArchivo();
    }

}
