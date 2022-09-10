package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entities.Fornecedor;
import factories.ConnectionFactory;
import interfaces.IFornecedorRepository;

public class FornecedorRepository implements IFornecedorRepository {

	@Override
	public void create(Fornecedor obj) throws Exception {

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("insert into fornecedor(nome, cnpj) values(?, ?)");
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getCnpj());
		statement.execute();

		connection.close();
	}

	@Override
	public void update(Fornecedor obj) throws Exception {

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection
				.prepareStatement("update fornecedor set nome=?, cnpj=? where idfornecedor=?");
		statement.setString(1, obj.getNome());
		statement.setString(2, obj.getCnpj());
		statement.setInt(3, obj.getIdForcenedor());
		statement.execute();

		connection.close();
	}

	@Override
	public void delete(Fornecedor obj) throws Exception {

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("delete from fornecedor where idfornecedor=?");
		statement.setInt(1, obj.getIdForcenedor());
		statement.execute();

		connection.close();
	}

	@Override
	public List<Fornecedor> findAll() throws Exception {

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("select * from fornecedor");
		ResultSet resultSet = statement.executeQuery(); // execute query - retorna uma lista de resultados

		List<Fornecedor> lista = new ArrayList<Fornecedor>();

		// while - enquanto ele encontrar registro,vai percorrer toda a lista...
		while (resultSet.next()) {
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setIdForcenedor(resultSet.getInt("idfornecedor"));
			fornecedor.setNome(resultSet.getString("nome"));
			fornecedor.setCnpj(resultSet.getString("cnpj"));

			lista.add(fornecedor);
		}

		connection.close();
		return lista;
	}

	@Override
	public Fornecedor findById(Integer id) throws Exception {
		// TODO Auto-generated method stub

		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("select * from fornecedor where idfornecedor=?");
		statement.setInt(1, id);
		ResultSet resultSet = statement.executeQuery(); // Resultset -

		Fornecedor fornecedor = null;
		// null - objeto esta sendo inicializado vazio,se ele encontrar algum registro
		// ele retorna o msm,se não...retorna vazio,null.

		if (resultSet.next()) {

			fornecedor = new Fornecedor();

			fornecedor.setIdForcenedor(resultSet.getInt("idfornecedor"));
			fornecedor.setNome(resultSet.getString("nome"));
			fornecedor.setCnpj(resultSet.getString("cnpj"));
		}
		connection.close();
		return fornecedor;
	}

	@Override
	public List<Fornecedor> findByNome(String nome) throws Exception {
		Connection connection = ConnectionFactory.createConnection();

		PreparedStatement statement = connection.prepareStatement("select * from Fornecedor where nome=?");
		statement.setString(1, nome);
		ResultSet resultSet = statement.executeQuery();

		List<Fornecedor> lista = new ArrayList<Fornecedor>();

		while (resultSet.next()) {

			Fornecedor fornecedor = new Fornecedor();

			fornecedor.setIdForcenedor(resultSet.getInt("idfornecedor"));
			fornecedor.setNome(resultSet.getString("nome"));
			fornecedor.setCnpj(resultSet.getString("cnpj"));

			lista.add(fornecedor);
		}

		connection.close();
		return lista;
	}

}
