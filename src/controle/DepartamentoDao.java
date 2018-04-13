/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.util.List;
import modelo.Departamento;

/**
 *
 * @author caiq-
 */
public interface DepartamentoDao {
    
    public boolean salvar(Departamento d);
    
    public Departamento buscar(int codigo);
    
    public List<Departamento> listar() throws IOException, ClassNotFoundException;
    
    public boolean deletar(Departamento d);
    
    public boolean atualizar(Departamento d) throws IOException, ClassNotFoundException; 
    
    
}
