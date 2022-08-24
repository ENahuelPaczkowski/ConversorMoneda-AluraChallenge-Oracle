package app;
import javax.swing.JOptionPane;
import conversores.*;

public class Menu {

	public static void main(String[] args) {
		
		int menu = 0;
		
		while (menu == 0) {			
			String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};			
			String opcion = (String) JOptionPane.showInputDialog(null, "Selecione una opción de conversion", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
			boolean datosCorrectos = true;
			
			if (opcion.equals("Conversor de Moneda")) {
				ConversorMoneda conversor = new ConversorMoneda();
				
				String tipoConversion = (String) JOptionPane.showInputDialog(null, "Selecione una opción de conversión", "Conversor de dinero", JOptionPane.DEFAULT_OPTION, null,
						new String[] {"De Pesos a Dolar","De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japones", "De Pesos a Won Sur-Coreano",
								"De Dolar a Pesos", "De Euros a Pesos", "De Libras Esterllinas a Pesos", "De Yen Japones a Pesos", "De Won Sur-Coreano a Pesos"}, "");
				
				double dinero = 0;
				try {
					dinero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir: ", "Conversor de dinero", JOptionPane.DEFAULT_OPTION));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Cantidad incorrecta", "UPS!", JOptionPane.ERROR_MESSAGE);
					datosCorrectos = false;
				}
				if (datosCorrectos) {
					switch (tipoConversion) {
					case "De Pesos a Dolar":
						conversor.pesosADolar(dinero);
						break;
					case "De Pesos a Euros":
						conversor.pesosAEuro(dinero);
						break;
					case "De Pesos a Libras Esterlinas":
						conversor.pesosALibra(dinero);
						break;
					case "De Pesos a Yen Japones":
						conversor.pesosAYen(dinero);
						break;
					case "De Pesos a Won Sur-Coreano":
						conversor.pesosAWon(dinero);
						break;
					case "De Dolar a Pesos":
						conversor.dolarAPesos(dinero);
						break;
					case "De Euros a Pesos":
						conversor.euroAPesos(dinero);
						break;
					case "De Libras Esterllinas a Pesos":
						conversor.libraAPesos(dinero);
						break;
					case "De Yen Japones a Pesos":
						conversor.yenAPesos(dinero);
						break;
					case "De Won Sur-Coreano a Pesos":
						conversor.wonAPesos(dinero);
						break;
					}
					
				}
				
			}
			if (opcion.equals("Conversor de Temperatura")) {
				ConversorTemperatura conversor = new ConversorTemperatura();
				
				String tipoConversion = (String) JOptionPane.showInputDialog(null, "Selecione una opción de conversión", "Conversor de temperatura", JOptionPane.DEFAULT_OPTION, null,
						new String[] {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"}, "");
				
				double temperatura = 0;
				try {
					temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la temperatura que desea convertir: ", "Conversor de temperatura", JOptionPane.DEFAULT_OPTION));				
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Cantidad incorrecta", "UPS!", JOptionPane.ERROR_MESSAGE);
					datosCorrectos = false;
				}
				
				if (datosCorrectos) {
					switch (tipoConversion) {
					case "De Celsius a Fahrenheit":
						conversor.CelsiusAFahrenheit(temperatura);	
						break;
					case "De Celsius a Kelvin":
						conversor.CelsiusAKelvin(temperatura);
						break;
					case "De Fahrenheit a Celsius":
						conversor.FahrenheitACelsius(temperatura);
						break;
					case "De fahrenheit a Kelvin":
						conversor.FahrenheitAKelvin(temperatura);
						break;
					case "De Kelvin a Celsius":
						conversor.KelvinACelsius(temperatura);
						break;
					case "De Kelvin a Fahrenheit":
						conversor.KelvinAFahrenheit(temperatura);
						break;
					}				
					
				}
			}
			menu = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Menu", JOptionPane.YES_NO_OPTION);
			
			if(menu == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa terminado");				
			}
		}	
		
	}

}
