/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.List;
import java.util.Objects;

/**
 *
 * @author caique
 */
public class Departamento {
    
    private String nome;
    private int codigo;
    private Supervisor supervisor;
    private List produtos[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public List[] getProdutos() {
        return produtos;
    }

    public void setProdutos(List[] produtos) {
        this.produtos = produtos;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Departamento other = (Departamento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
        
        
    }

    @Override
    public String toString() {
        return "Departamento{" + "nome=" + nome + ", codigo=" + codigo + ", supervisor=" + supervisor + ", produtos=" + produtos + '}';
    }

   
   

    
}
