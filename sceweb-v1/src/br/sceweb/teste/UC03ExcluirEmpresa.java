package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC03ExcluirEmpresa {
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
		
	}

	@Test
	public void CT01UC01Excluir_Valido() {
		assertEquals(0, empresaDAO.exclui(empresa.getCnpj()));
	}

	@Test
	public void CT02UC01Excluir_Invalido() {
		assertEquals(0, empresaDAO.exclui("'1234'"));
	}
}
