package com.company;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setLayout(null);
        window.setSize(800,600);

        JLabel title = new JLabel();
        title.setText("-Registro-");
        title.setSize(300, 25);
        title.setLocation(380, 5);

        // nombre

        JLabel inputNombre = new JLabel();
        inputNombre.setText("Ingrese su nombre");
        inputNombre.setSize(300, 25);
        inputNombre.setLocation(25, 25);

        JTextField campoDeTextoNombre = new JTextField();
        campoDeTextoNombre.setSize(300,25);
        campoDeTextoNombre.setLocation(25,60);

        // edad

        JLabel inputEdad = new JLabel();
        inputEdad.setText("Ingrese su edad");
        inputEdad.setSize(300, 25);
        inputEdad.setLocation(25, 90);

        JTextField campoDeTextoEdad = new JTextField();
        campoDeTextoEdad.setSize(300,25);
        campoDeTextoEdad.setLocation(25,120);

        // dni

        JLabel inputDni = new JLabel();
        inputDni.setText("Ingrese su dni");
        inputDni.setSize(300, 25);
        inputDni.setLocation(25, 150);

        JTextField campoDeTextoDni = new JTextField();
        campoDeTextoDni.setSize(300,25);
        campoDeTextoDni.setLocation(25,180);

        // telefono

        JLabel inputTelefono = new JLabel();
        inputTelefono.setText("Ingrese su telefono");
        inputTelefono.setSize(300, 25);
        inputTelefono.setLocation(25, 210);

        JTextField campoDeTextoTelefono = new JTextField();
        campoDeTextoTelefono.setSize(300,25);
        campoDeTextoTelefono.setLocation(25,240);

        // direccion

        JLabel inputDireccion = new JLabel();
        inputDireccion.setText("Ingrese su direccion");
        inputDireccion.setSize(300, 25);
        inputDireccion.setLocation(25, 270);

        JTextField campoDeTextoDireccion = new JTextField();
        campoDeTextoDireccion.setSize(300,25);
        campoDeTextoDireccion.setLocation(25,300);

        // boton

        JButton boton = new JButton("Enviar");
        boton.setSize(100, 30);
        boton.setLocation(25,330);

        // displayRespuesta
        JLabel displayRespuesta = new JLabel();
        displayRespuesta.setSize(300,200);
        displayRespuesta.setLocation(150,334);

        window.add(title);
        window.add(inputNombre);
        window.add(campoDeTextoNombre);

        window.add(inputEdad);
        window.add(campoDeTextoEdad);

        window.add(inputDni);
        window.add(campoDeTextoDni);

        window.add(inputTelefono);
        window.add(campoDeTextoTelefono);

        window.add(boton);
        window.add(displayRespuesta);

        window.add(inputDireccion);
        window.add(campoDeTextoDireccion);
        window.setVisible(true);

        ArrayList<Persona> personas = new ArrayList<>();

        boton.addMouseListener(
                new MouseAdapter(){

                @Override
                public void mouseClicked(MouseEvent e){

                    String nombre = campoDeTextoNombre.getText();
                    int edad = Integer.parseInt(campoDeTextoEdad.getText());
                    int dni = Integer.parseInt(campoDeTextoDni.getText());
                    int telefono = Integer.parseInt(campoDeTextoTelefono.getText());
                    String direccion = campoDeTextoDireccion.getText();

                    Persona persona = new Persona(nombre, edad, dni, telefono, direccion);
                    personas.add(persona);
                }
        });


    }
}
