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
public class Administrativo extends Assistente {

    Double salario;

    public Administrativo(Double salario, String matricula, String nome) {
        super(matricula, nome);
        this.salario = salario;
    }

    public Double Adicional(String turno) {
        
        if (turno == "dia"){
            return salario;
        }else
            salario = salario+(salario*0.19);
        return salario;
    }

}
