package br.sceweb.teste;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {

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
	
	@Test
	public void CT02UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("00000000000000");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT03UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("11111111111111");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT04UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("22222222222222");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT05UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("33333333333333");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT06UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("44444444444444");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT07UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("55555555555555");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT08UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("66666666666666");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT09UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("77777777777777");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT10UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("88888888888888");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT11UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("99999999999999");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT12UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("66");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	
	@Test
	public void CT13UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("13245678912345");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}

	@Test
	public void CT14UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("1c24567a91b345");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	@Test
	public void CT15UC01Cadastro_CNPJ_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setCnpj("12998878912347");
		}catch(Exception e){
			assertEquals("CNPJ Inválido!", e.getMessage());
		}
	}
	
	@Test
	public void CT16UC01Cadastro_Nome_Invalido() {
		Empresa emp2 = empresa;
		try{
			emp2.setNomeDaEmpresa("");
		}catch(Exception e){
			assertEquals("nome da empresa inválido!", e.getMessage());
		}
	}
	//12998878912347
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
