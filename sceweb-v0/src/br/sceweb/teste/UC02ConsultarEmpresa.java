package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC02ConsultarEmpresa {

	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		String test = "60723061055868";
		
		empresa.setCnpj(test);
		empresa.setEndereco(test);
		empresa.setNomeDaEmpresa(test);
		empresa.setNomeFantasia(test);
		empresa.setTelefone(test);
	}

	@Test
	public void CT01UC01Cadastro_Valido() {
		assertEquals(1, empresaDAO.exclui(empresa.getCnpj()));
		assertEquals(1, empresaDAO.adiciona(empresa));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
