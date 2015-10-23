package br.sceweb.teste;


import static org.junit.Assert.*;

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
		empresaDAO=new  EmpresaDAO();
		empresa=new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("2222");
	}
    @Test
    public void CT01UC01FBCadastra_empresa_com_sucesso(){
	empresaDAO.exclui("89424232000180");
    	assertEquals(1,empresaDAO.adiciona(empresa));
    	empresaDAO.exclui("89424232000180");
    	
}
    public void CT02UC01A1Cadastra_empresa_cnpj_cadastrado(){
    	empresaDAO.adiciona(empresa);
    	assertEquals(0,empresaDAO.adiciona(empresa));
    }
    /*  public void CT03UC01A2Cadastra_empresa_cnpj_invalido(){
    	
    }
public void CT04UC01A3Cadastra_empresa_com_dados_invalidos(){
	
}
public void CT02UC02FBConsultarEmpresa_com_sucesso{
empresaDAO.adiciona(empresa);
Empresa empresa2=new Empresa();
		empresa2.setNomeDaEmpresa("empresa x");
		empresa2.setCnpj("89424232000180");
		empresa2.setNomeFantasia("empresa x");
		empresa2.setEndereco("rua taquari");
		empresa2.setTelefone("2222");

}
*/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
