import java.util.Date;
public class EmpresaBillSoft {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.setNome("BillSoft");
		empresa.setCnpj("53.479.498/0001-38");
		empresa.setDate(new Date());
		empresa.setListasocios("TipSoft");
		empresa.setFaturamento(150.933);
		empresa.imprimir();
		
		
		
	}

}
