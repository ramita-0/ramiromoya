package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;


public class Display {
    private JFrame ventana;
    private JPanel panelSuperior;
    //test
    private JButton areaCirculo;
    private JPanel panelInferior;
    private JTextField areaRadio;
    private JTextField altura;

    public Display(){
        this.ventana = new JFrame();
        this.ventana.setLayout(new BorderLayout());
        this.ventana.setSize(800, 600);

        this.panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(1,5));

        this.areaCirculo = new JButton("Circulo");
        JButton areaEsfera = new JButton("Esfera");
        JButton areaCuadrado = new JButton("Cuadrado");
        JButton areaCubo = new JButton("Cubo");
        JButton areaTriangulo = new JButton("Triangulo");

        panelSuperior.add(areaCirculo);
        panelSuperior.add(areaEsfera);
        panelSuperior.add(areaCuadrado);
        panelSuperior.add(areaCubo);
        panelSuperior.add(areaTriangulo);

        this.panelInferior = new JPanel();
        panelInferior.setLayout(new GridLayout(3,3));

        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");

        panelInferior.add(boton1);
        panelInferior.add(boton2);
        panelInferior.add(boton3);
        panelInferior.add(boton4);
        panelInferior.add(boton5);
        panelInferior.add(boton6);
        panelInferior.add(boton7);
        panelInferior.add(boton8);
        panelInferior.add(boton9);

        JLabel textoAreaRadio = new JLabel();
        textoAreaRadio.setText("Area / Radio");
        textoAreaRadio.setSize(100,30);
        textoAreaRadio.setLocation(130, 270);

        this.areaRadio = new JTextField();
        areaRadio.setSize(300,30);
        areaRadio.setLocation(0, 300);


        JLabel textoAltura = new JLabel();
        textoAltura.setText("Altura");
        textoAltura.setSize(100,30);
        textoAltura.setLocation(430, 270);

        this.altura = new JTextField();
        altura.setSize(300,30);
        altura.setLocation(300,300);

        // display para el input de los botones
        JLabel inputDisplay = new JLabel();
        inputDisplay.setSize(600,30);
        inputDisplay.setLocation(0,330);

        ventana.add(panelSuperior, BorderLayout.NORTH);
        ventana.add(panelInferior,BorderLayout.SOUTH);
        ventana.add(textoAreaRadio);
        ventana.add(textoAltura);
        ventana.add(areaRadio);
        ventana.add(altura);
        ventana.add(inputDisplay);

        ventana.setVisible(true);


    }



    public void calcularAreaCirculo(Display display){
        Metodos.areaCirculo(display, display.getAreaRadio());
    }

    // acceder al boton y agregarlo un listener que ejecuto el metodo de arriba cuando se toque;
    JPanel[areaCirculo].addMouseListener(
            new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){
                Metodos.areaCirculo(//parametros);
            }
        });

    public JFrame getVentana() {
        return ventana;
    }

    public JPanel getPanelSuperior() {
        return panelSuperior;
    }

    public JPanel getPanelInferior() {
        return panelInferior;
    }

    public double getAreaRadio() {
        return Double.parseDouble(areaRadio.getText());
    }

    public JTextField getAltura() {
        return altura;
    }
}
