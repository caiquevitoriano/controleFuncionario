
package controle;

import java.io.IOException;
import java.util.List;
import modelo.Funcionario;


public interface FuncionarioDao <T>{
    
    public boolean salvar(Funcionario f) throws IOException, ClassNotFoundException;
    
    public Funcionario buscar(String cpf) throws IOException, ClassNotFoundException;
    
    public List<Funcionario> listar() throws IOException, ClassNotFoundException; 
    
    public boolean deletar(Funcionario f) throws IOException, ClassNotFoundException;
    
    public boolean atualizar(Funcionario f) throws IOException, ClassNotFoundException;
    
}
