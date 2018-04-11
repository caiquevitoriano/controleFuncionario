
package modelo;

import java.util.Objects;

public class Funcionario {
    
    public static int num;
    private  int codigo;
    private String nome;
    private String cpf;
    private String datanasci;
    
    

    public Funcionario(String nome, String cpf, String datanasci) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanasci = datanasci;
       
        
    }

    public Funcionario() {
        codigo = num++;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanasci() {
        return datanasci;
    }

    public void setDatanasci(String datanasci) {
        this.datanasci = datanasci;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.cpf);
        hash = 29 * hash + Objects.hashCode(this.datanasci);
        hash = 29 * hash + Objects.hashCode(this.codigo);
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
        final Funcionario other = (Funcionario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.datanasci, other.datanasci);
    }

    @Override
    public String toString() {
        return "funcionarios{" + "nome=" + nome + ", cpf=" + cpf + ", datanasci=" + datanasci + ", codigo=" + codigo + '}';
    } 
    
}
