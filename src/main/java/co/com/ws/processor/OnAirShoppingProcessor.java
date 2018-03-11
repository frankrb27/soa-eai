package co.com.ws.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.ws.on_air_shopping.OnAirShoppingResponse;

public class OnAirShoppingProcessor implements Processor {
    
    public void process(Exchange exchange) throws Exception {
    	OnAirShoppingResponse out = new OnAirShoppingResponse();
        out.setCode("0");
        out.setDescription("OK");
        exchange.getOut().setBody(out);
	}
}