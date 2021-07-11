import java.util.Date;
public class Filiais  {
	
		private String nome;
		private String cnpj;
		private Date datain;
		private double faturamento;
		
		public void imprimir() {
			System.out.println("Nome: "+nome);
			System.out.println("CNPJ: "+cnpj);
			System.out.println("Inauguracao: "+datain);
			System.out.println("Faturamento: "+faturamento);
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		public Date getDate() {
			return datain;
		}
		public void setDate(Date datain) {
			this.datain = datain;
		}
		//public String getListasocios( ) {
			//return listasocios;		
		//}
		//public void setListasocios(String listasocios) {
			//this.listasocios = listasocios;
		//}
		public double getFaturamento() {
			return faturamento;
		}
		public void setFaturamento(double faturamento) {
			this.faturamento = faturamento;
		}
		
	

 }

