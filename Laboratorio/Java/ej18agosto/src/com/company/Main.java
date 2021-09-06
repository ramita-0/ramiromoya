package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(new BorderLayout());
        ventana.setSize(800, 600);


        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(1,5));

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new GridLayout(3,3));

        JButton areaCirculo = new JButton("Circulo");
        JButton areaEsfera = new JButton("Esfera");
        JButton areaCuadrado = new JButton("Cuadrado");
        JButton areaCubo = new JButton("Cubo");
        JButton areaTriangulo = new JButton("Triangulo");

        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");

        // display para el input de los botones
        JLabel inputDisplay = new JLabel();
        inputDisplay.setSize(600,30);
        inputDisplay.setLocation(5,300);

        panelSuperior.add(areaCirculo);
        panelSuperior.add(areaEsfera);
        panelSuperior.add(areaCuadrado);
        panelSuperior.add(areaCubo);
        panelSuperior.add(areaTriangulo);

        panelInferior.add(boton1);
        panelInferior.add(boton2);
        panelInferior.add(boton3);
        panelInferior.add(boton4);
        panelInferior.add(boton5);
        panelInferior.add(boton6);
        panelInferior.add(boton7);
        panelInferior.add(boton8);
        panelInferior.add(boton9);

        ventana.add(panelSuperior, BorderLayout.NORTH);
        ventana.add(panelInferior,BorderLayout.SOUTH);
        ventana.add(inputDisplay);

        ventana.setVisible(true);


    }
}
