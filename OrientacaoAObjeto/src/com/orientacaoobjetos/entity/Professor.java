package com.orientacaoobjetos.entity;

public class Professor {

    public String escola  ;
    public String nome  ;
    public String materia  ;
    public int idade ;

    public void lecionarMateria(){

        System.out.println("O professor " + nome + " está dando a materia " + materia + " na escola " + escola);


    }

    public void finalizarMateria(){

        System.out.println("O professor " + nome + " finalizou  a materia " + materia + " na escola " + escola);




    }

    @Override
    public String toString(){

        return "\nNome: " + nome + "\nEscola: " + escola + "\nMateria: " + materia + "\nIdade: " + idade ;
    }



}
