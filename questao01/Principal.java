package pkg3.bimestre2.semestre;

import javax.swing.JOptionPane;

public class Principal {
	private String lerDestinatario(){
		return JOptionPane.showInputDialog(null, "Destinatário: ", 
			"Cartão Web", JOptionPane.QUESTION_MESSAGE);
	}
	
	private String lerRementente(){
		//String tipo = obj.toString();
		return JOptionPane.showInputDialog(null, "Remetente: ", 
			"Cartão Web", JOptionPane.QUESTION_MESSAGE);
	}
	
	public static void main(String[] args){
		Principal principal = new Principal();
		CartaoWeb[] cartoes = new CartaoWeb[5];
		
		DiaDosNamorados xodo1 = new DiaDosNamorados(principal.lerDestinatario());
		Natal natal1 = new Natal(principal.lerDestinatario());
		Aniversario aniversario = new Aniversario(principal.lerDestinatario());
		Natal natal2 = new Natal(principal.lerDestinatario());
		DiaDosNamorados xodo2 = new DiaDosNamorados(principal.lerDestinatario());
		
		cartoes[0] = xodo1;
		cartoes[1] = natal1;
		cartoes[2] = aniversario;
		cartoes[3] = natal2;
		cartoes[4] = xodo2;
		
		for(short cartao = 0; cartao < cartoes.length; cartao++){
			if(cartoes[cartao] != null)
				System.out.println(cartoes[cartao]
					.retornarMensagem(principal.lerRementente()));
		}
	}    
}
