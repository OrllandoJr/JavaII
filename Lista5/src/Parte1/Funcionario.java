/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;

/**
 *
 * @author Orllando Jr
 */
public abstract class Funcionario {
    
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    public abstract String exibeDados();
    
}
