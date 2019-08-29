/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

/**
 *
 * @author s.lucas
 */
public class Agenda {
    private int codigo;
    private String nome;
    private String celular;
    private String telefone;
    private String email;
    private String dataAni;
    
//construtor
    public Agenda(){
        
    }
        public Agenda(int codigo, String nome, String celular, String telefone, String email, String dataAni){
        this.codigo= codigo;    
        this.nome= nome;
        this.celular= celular;
        this.telefone= telefone;
        this.email= email;
        this.dataAni= dataAni;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataAni() {
        return dataAni;
    }

    public void setDataAni(String dataAni) {
        this.dataAni = dataAni;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", celular=" + celular + ", telefone=" + telefone + ", email=" + email + ", dataAni=" + dataAni + '}';
    }
        
}
