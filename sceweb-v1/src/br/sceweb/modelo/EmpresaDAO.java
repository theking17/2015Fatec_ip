package br.sceweb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDAO {

	/*
	 * public String adiciona (Empresa empresa){ try (Connection conn = new
	 * FabricaDeConexoes().getConnection()){ }catch(SQLException e){ throw new
	 * RuntimeException (e); } return "Cadastro realizado com SUCESSO"; }
	 */

	public int adiciona(Empresa empresa) {
		PreparedStatement ps;
		int codigoRetorno = 0;

		try(Connection conn = new FabricaDeConexoes().getConnection()){
			
			ps = conn.prepareStatement(
					"insert into empresa (cnpj, nomeDaEmpresa, nomeFantasia, endereco, telefone) values (?,?,?,?,?)");
			ps.setString(1, empresa.getCnpj());
			ps.setString(2, empresa.getNomeDaEmpresa());
			ps.setString(3, empresa.getNomeFantasia());
			ps.setString(4, empresa.getEndereco());
			ps.setString(5, empresa.getTelefone());
			codigoRetorno = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return codigoRetorno;
	}

	public int exclui(String cnpj) {
		PreparedStatement ps;
		int codigoRetorno = 0;
		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			ps = conn.prepareStatement("delete from empresa where cnpj = ?");
			ps.setString(1, cnpj);
			codigoRetorno = ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return codigoRetorno;
	}
	
	/*
     * consulta todas as empresas
     * entrada n/a
     * saida - um arraylist com todas as empresas listadas no db
     */
	public List<Empresa> consultaEmpresas() {
		List<Empresa> empresas = new ArrayList<Empresa>();
		PreparedStatement ps;
		try (Connection conn = new FabricaDeConexoes().getConnection()) {
			ps = conn.prepareStatement("select * from empresa");
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				Empresa empresa = new Empresa();
				empresa.setNomeDaEmpresa(resultSet.getString("nomeDaEmpresa"));
				//os outros atributos nao foram implementados
				empresas.add(empresa);
			}
			resultSet.close();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return empresas;
	}
}


