package co.com.ws.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.com.ws.cancel_flight.CancelFlightResponse;

public class CancelFlightProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        CancelFlightResponse cancel = new CancelFlightResponse();
        cancel.setCode("0");
        cancel.setDescription("OK");
        exchange.getOut().setBody(cancel);
    }

}