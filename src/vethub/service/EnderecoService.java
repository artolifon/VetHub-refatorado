package vethub.service;

import vethub.model.Endereco;
import vethub.repository.EnderecoDAO;
import java.sql.SQLException;

/**
 *
 * @author Arthur
 */
public class EnderecoService {
    EnderecoDAO enderecoDao = new EnderecoDAO();
    
    public int cadastrar(Endereco endereco) throws SQLException{
        return enderecoDao.cadastrar(endereco);
    }
}
