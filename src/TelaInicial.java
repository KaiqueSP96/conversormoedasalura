import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class TelaInicial {

	public static void main(String[] args) {
		
		while(true) {
		
		BigDecimal cotacao_dolar = BigDecimal.valueOf(4.81);
		BigDecimal cotacao_euro = BigDecimal.valueOf(5.25);
		BigDecimal cotacao_peso = BigDecimal.valueOf(0.19);
		
		
		String valorConverter = JOptionPane.showInputDialog(null, "Digite um valor para Converter:");
		Integer valor = Integer.parseInt(valorConverter);
		
		
			
			
			 Object[] tiposConversao = { 
					 "De Reais para Dolares", 
					 "De Reais para Euros", 
					 "De Reais para Pesos" 
					 };
			 

			 Object escolhaMoeda = JOptionPane.showInputDialog(null,
			             "Escolha uma moeda para Conversão", "Seleção da Moeda",
			             JOptionPane.INFORMATION_MESSAGE, null,
			             tiposConversao, tiposConversao[0]);
			 
			 
			 	
	if(escolhaMoeda.equals("De Reais para Dolares")) {
						 BigDecimal cot1 = BigDecimal.valueOf(valor / cotacao_dolar.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
						 JOptionPane.showMessageDialog(null, "Valor Convertido: "+ cot1 + " Dolares");

	} else if (escolhaMoeda.equals("De Reais para Euros")) {
		BigDecimal cot2 = BigDecimal.valueOf(valor / cotacao_euro.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		JOptionPane.showMessageDialog(null, "Valor Convertido: "+ cot2 + " Euros");
	 
	} else if (escolhaMoeda.equals("De Reais para Pesos")) {
		BigDecimal cot3 = BigDecimal.valueOf(valor / cotacao_peso.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		JOptionPane.showMessageDialog(null, "Valor Convertido: "+ cot3 + " Pesos");
	}
			 		
		}
	}
}

