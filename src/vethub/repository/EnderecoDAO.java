package vethub.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import vethub.model.Endereco;
import vethub.util.Conexao;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Arthur
 */
public class EnderecoDAO {
    private Connection conn;
    private PreparedStatement ps;
    
    public int cadastrar(Endereco e) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }

            String sql = "INSERT INTO endereco (rua_numero, bairro, cidade, estado, cep) VALUES (?, ?, ?, ?, ?)";

            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, e.getRuaNumero());
            ps.setString(2, e.getBairro());
            ps.setString(3, e.getCidade());
            ps.setString(4, e.getEstado());
            ps.setString(5, e.getCep().replace("-", ""));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if(rs.next()){
                return rs.getInt(1);
            }

            return 0;    
        } finally {
            Conexao.desconectar(conn);
        }
        
    }
}
