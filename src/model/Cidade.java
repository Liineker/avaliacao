/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lineker
 */
public class Cidade {
        private String nome;
    private String codIbge;
    private Estado estado;

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCodIbge() {return codIbge;}

    public void setCodIbge(String codIbge) {this.codIbge = codIbge;}

    public Estado getEstado() {return estado;}

    public void setEstado(Estado estado) {this.estado = estado;}

    @Override
    public String toString() {
        return "Cidade" + "\n Nome: " + nome + 
                "\n IBGE:" + codIbge +
                "\n" + estado.toString();
    }
}
