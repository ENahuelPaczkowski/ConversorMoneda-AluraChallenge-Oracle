package conversores;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	DecimalFormat formato = new DecimalFormat();

	public void CelsiusAFahrenheit(double celsius) {
		JOptionPane.showMessageDialog(null, "Tienes " + formato.format(celsius * 1.8 + 32) + "° Fahernheit");
	}
	
	public void CelsiusAKelvin(double celsius) {
		JOptionPane.showMessageDialog(null, "Tienes " + formato.format(celsius + 273.15) + "° Kelvin");
	}
	
	public void FahrenheitACelsius(double fahrenhei) {
		JOptionPane.showMessageDialog(null, "Tienes " + formato.format((fahrenhei - 32) * (5/9)) + "° Celsius");
	}
	
	public void FahrenheitAKelvin(double fahrenhei) {
		JOptionPane.showMessageDialog(null, "Tienes " + formato.format((fahrenhei - 32) * (5/9) + 273.15) + "° Kelvin");
	}
	
	public void KelvinACelsius(double kelvin) {
		JOptionPane.showMessageDialog(null, "Tienes " + formato.format(kelvin - 273.15) + "° Celsius");
	}
	
	public void KelvinAFahrenheit(double kelvin) {
		JOptionPane.showMessageDialog(null, "Tienes " + formato.format((kelvin - 273.15) * 1.8 + 32) + "° Fahrenheit");
	}
}
