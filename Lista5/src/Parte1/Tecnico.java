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
public class Tecnico extends Assistente {
    
    public Tecnico(String matricula, String nome) {
        super(matricula, nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    
    public Double bonus(Double salario){
        salario = salario + (salario * 0.25);   
        return salario;
    }

}
