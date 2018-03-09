package co.com.core.transformer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import co.com.canonical.flights.DomainEventsInfo.OnAirShopping;
import co.com.canonical.flights.FlightLeg;

@Component
public class ShoppingTransformer implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		OnAirShopping airShopping = exchange.getIn().getBody(FlightLeg.class).getDomainEventsInfo().getOnAirShopping();

		StringBuilder xml = new StringBuilder();
		xml.append(leftPadding("1", "0", 10));
		xml.append(leftPadding(airShopping.getCreditCardNumber(), "0", 10));
		xml.append(airShopping.getCreditCardNumber());
		xml.append(leftPadding(String.valueOf(airShopping.getValue()), "0", 4));
		xml.append(leftPadding(airShopping.getDescription(), " ", 100));

		exchange.getIn().setBody(xml.toString());
	}

	public static String leftPadding(String cadena, String caracter, int caracteres){
		if(cadena != null && caracter != null && caracteres >0){
			for(int i=0; i<caracteres; i++){
				if(cadena.length() < caracteres){
					cadena = caracter + cadena;
				}
			}
			return cadena;
		}else{
			return null;
		}
	}

	public static String rightPadding(String cadena, String caracter, int caracteres){
		if(cadena != null && caracter != null && caracteres >0){
			for(int i=0; i<caracteres; i++){
				if(cadena.length() < caracteres){
					cadena = cadena + caracter;
				}
			}
			return cadena;
		}else{
			return null;
		}
	}
}
