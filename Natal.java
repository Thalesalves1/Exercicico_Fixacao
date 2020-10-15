package pkg3.bimestre2.semestre;

public class Natal extends CartaoWeb {
	public Natal(String destinatario){
		setDestinatario(destinatario);
	}
	
	protected String retornarMensagem(String remetente){
		return "\nFeliz Natal " + getDestinatario() 
			+ " para você e toda a sua família. São os votos mais sinceros de " 
			+ remetente + ".\n";
	}
}
