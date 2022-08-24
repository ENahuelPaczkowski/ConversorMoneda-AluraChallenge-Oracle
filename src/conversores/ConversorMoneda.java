package conversores;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorMoneda {

	private double dolar = 0.0072;
	private double euro = 0.0074;
	private double libra = 0.0062;
	private double yen = 1;
	private double won = 9.79;
	
	DecimalFormat formato = new DecimalFormat();
	
	public void pesosADolar(double pesos) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesos * this.dolar) + " Dolares");
	}
	
	public void pesosAEuro(double pesos) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesos * this.euro) + " Euros");
	}
	
	public void pesosALibra(double pesos) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesos * this.libra) + " Libras Esterlinas");
	}
	
	public void pesosAYen(double pesos) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesos * this.yen) + " Yen Japoneses");
	}
	
	public void pesosAWon(double pesos) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesos * this.won) + " Won Sur-Coreanos");
	}
	
	public void dolarAPesos(double dolares) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(dolares / this.dolar) + " Pesos");
	}
	
	public void euroAPesos(double euros) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(euros / this.euro) + " Pesos");
	}
	
	public void libraAPesos(double libras) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(libras / this.libra) + " Pesos");
	}
	
	public void yenAPesos(double yenes) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(yenes / this.yen) + " Pesos");
	}
	
	public void wonAPesos(double wones) {
		JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(wones / this.won) + " Pesos");
	}
}
