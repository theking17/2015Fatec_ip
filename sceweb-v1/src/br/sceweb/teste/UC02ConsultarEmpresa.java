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
		empresa.setEndereco("wta");
		empresa.setNomeDaEmpresa("what");
		empresa.setNomeFantasia("what");
		empresa.setTelefone("what");
		
		//empresaDAO.adiciona(empresa);
	}

	@Test
	public void CT01UC01Consulta_Valido() {
		assertEquals(empresa, empresaDAO.consultaEmpresas().indexOf(0));
	}

}
