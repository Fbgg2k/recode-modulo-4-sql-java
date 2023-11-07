import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection connection; // Conexão com o banco de dados

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    public Cliente obterClientePorId(int clienteId) {
        String sql = "SELECT * FROM clientes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, clienteId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Lide com a exceção apropriadamente
        }
        return null; // Retorne null se o cliente não for encontrado
    }
}
