package co.com.ws.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.ws.on_air_shopping.OnAirShoppingRequest;
import co.com.ws.on_air_shopping.OnAirShoppingResponse;

public class OnAirShoppingProcessor implements Processor {
    
    public void process(Exchange exchange) throws Exception {
    	OnAirShoppingResponse out = new OnAirShoppingResponse();
        List soaList = exchange.getIn().getBody(List.class);
        OnAirShoppingRequest airShopping = (OnAirShoppingRequest) soaList.get(0);

		StringBuilder xml = new StringBuilder();
		xml.append(leftPadding("1", "0", 10));
		xml.append(leftPadding(airShopping.getCreditCard(), "0", 10));
		xml.append(airShopping.getCreditCard());
		xml.append(leftPadding(String.valueOf(airShopping.getValue()), "0", 4));
		xml.append(leftPadding(airShopping.getDescription(), " ", 100));

        out.setCode("0");
        out.setDescription("OK");
        exchange.getOut().setBody(out);
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