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
public class Assistente extends Funcionario {
    
    private String matricula;

    public Assistente(String matricula, String nome) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibeDados(){
        return this.matricula;
    }
    
}
