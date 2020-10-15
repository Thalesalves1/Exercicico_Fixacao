package pkg3.bimestre2.semestre;

public abstract class CartaoWeb {

   private String destinatario;
	
	/*
	* Métodos de cartão webs
	*/
	protected abstract String retornarMensagem(String remetente);
	
	/*
	* Métodos acessórios e modificadores
	*/
	public void setDestinatario(String destinatario){
		this.destinatario = destinatario;
	}
	
	public String getDestinatario(){
		return destinatario;
	}
    
}
