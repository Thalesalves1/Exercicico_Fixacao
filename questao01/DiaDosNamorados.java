package pkg3.bimestre2.semestre;

public class DiaDosNamorados extends CartaoWeb {
	public DiaDosNamorados(String destinatario){
		setDestinatario(destinatario);
	}
	
	protected String retornarMensagem(String remetente){
		return "\n" + getDestinatario() + ", meu amor, " 
			+ "juntos estamos escrevendo a história de amor mais linda de todas.\n" 
			+ "Te amo muito! Feliz Dia dos Namorados!!!\n" 
			+ "Assinado: " + remetente + ".\n";
	}   
}
