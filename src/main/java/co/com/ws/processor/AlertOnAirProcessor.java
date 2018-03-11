package co.com.ws.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.ws.alert_on_air.AlertOnAirResponse;

public class AlertOnAirProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        AlertOnAirResponse alert = new AlertOnAirResponse();
        alert.setCode("0");
        alert.setDescription("OK");
        exchange.getOut().setBody(alert);
    }

}