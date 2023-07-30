package principal;

import javax.swing.JOptionPane;
import conversorMoneda.*;
import conversorTemperatura.*;

public class principal {

	public static void main(String[] args) {
		
		convertidorDeMonedaAPesos pesos = new convertidorDeMonedaAPesos();
		convertidorDePesosAMonedas monedas = new convertidorDePesosAMonedas();
		convertidorDeTemperatura temperatura = new convertidorDeTemperatura();
		boolean estado = true;
        double Minput = 0.0;
        int respuesta = 0;
        String opciones = "";
        String input;
        
        
        while(estado) {
        	try {
        		opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda",
        			"Conversor de Temperatura"}, "Seleccion")).toString();
        	}catch(NullPointerException e) {
                    System.exit(0);
        	}

        	switch(opciones) {
        	
        	case "Conversor de Moneda":
        		 input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
        		 
        		 if(ValidarNumero(input) == true) {
                     Minput = Double.parseDouble(input);
        		 }else {
                     JOptionPane.showMessageDialog(null, "Valor inválido");
                     break;
                 }
        		 
        		 String opcionesDeMonedas = (JOptionPane.showInputDialog(null, "Seleccione una opción de moneda ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {
        				 "De Pesos a Dólar","De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano",
        				 "De Dólar a Pesos","De Euro a Pesos","De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, "Seleccion")).toString();
        		 switch(opcionesDeMonedas) {
        	        case "De Pesos a Dólar":
        	        	monedas.ConvertirPesosADolares(Minput);
        	        	break;
        	        case "De Pesos a Euro":
        	        	monedas.ConvertirPesosAEuros(Minput);
        	        	break;
        	        case "De Pesos a Libras":
        	        	monedas.ConvertirPesosALibras(Minput);
        	        	break;
        	        case "De Pesos a Yen":
        	        	monedas.ConvertirPesosAYen(Minput);
        	        	break;
        	        case "De Pesos a Won Coreano":
        	        	monedas.ConvertirPesosAWon(Minput);
        	        	break;    	    	                          
        	        case "De Dólar a Pesos":
        	        	pesos.ConvertirDolaresAPesos(Minput);
        	        	break;
        	        case "De Euro a Pesos":
        	        	pesos.ConvertirEurosAPesos(Minput);
        	        	break;
        	        case "De Libras a Pesos":
        	        	pesos.ConvertirLibrasAPesos(Minput);
        	        	break;
        	        case "De Yen a Pesos":
        	        	pesos.ConvertirYenAPesos(Minput);
        	        	break;
        	        case "De Won Coreano a Pesos":
        	            pesos.ConvertirWonAPesos(Minput);
        	            break;
        	        }
                     respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "Programa terminado"); 
                        	estado = false;
                     }
                     break;
                     
           /////////////////////////////////////////////////////////////////////////////////////////////////////////////
                     
	        case "Conversor de Temperatura":
	        	input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
	        	
	        	if(ValidarNumero(input) == true) {
                    Minput = Double.parseDouble(input);
       		 	}else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                    break;
                }
	        	
	        	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
	            switch(opcion) {
	            case "Grados Celcius a Grados Farenheit":
	            	temperatura.ConvertirCelciusAFarenheit(Minput);
	            	break;
	            case "Grados Celcius a Kelvin":
	                temperatura.ConvertirCelciusAKelvin(Minput);
	                break;
	            case "Grados Farenheit a Grados Celcius":
	               temperatura.ConvertirFarenheitACelcius(Minput);
	               break;
	            case "Kelvin a Grados Celcius":
	               temperatura.ConvertirKelvinACelcius(Minput);
	               break;
	            case "Kelvin a Grados Farenheit":
	            	temperatura.ConvertirKelvinAFarenheit(Minput);
	            	break;
	            }
	            respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                if (JOptionPane.OK_OPTION == respuesta){
                	System.out.println("opción Afirmativa Seleccionada");
                }else{
                   	JOptionPane.showMessageDialog(null, "Programa terminado"); 
                   	estado = false;
                }
	        	break;
        	}     
                 
    }
               
  }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }

}
