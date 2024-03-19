/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evento1.demo.models;

/**
 *
 * @author raulprudente
 */
public class Evento {
    
    
    private String nome;
    private String local;
    private String data;
    private String horario;
    
    
    public void Setnome(String nome){
        this.nome=nome;
    }
    public String Getnome(){
        return nome;
    }
    public void Setlocal(String local){
        this.local=local;
    }
    public String Getlocal(){
        return local;
    }
    
    public void Setdata(String data){
        this.data=data;
    }
    
    public void Sethorario(String horario){
        this.horario=horario;
    }
    public String Gethorario(){
        return horario;
    }
}


