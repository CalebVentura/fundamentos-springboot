package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentOneImpl implements ComponentDependency{

    String nombre = "Cieli";

    @Override
    public void saludar() {
        System.out.println("Hola " + nombre + " Desde la primera componente");
    }// Este método es necesario implementarlo
}
