import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection connection; // Conexão com o banco de dados

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    public void excluirCliente(int clienteId) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, clienteId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Lide com a exceção apropriadamente
        }
    }
}
