package co.com.ws.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import bpel.com.oracle.xmlns.gestioneventosvuelos.eventosaereos.bpeleventosaerolineasla.BPELEventosAerolineasLA;
import bpel.com.oracle.xmlns.gestioneventosvuelos.eventosaereos.bpeleventosaerolineasla.BpeleventosaerolineaslaClientEp;

public class BpelProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		bpel.aerolineas_latinoamericanas.contract.messages.AircratlineMessage req = exchange.getIn().getBody(bpel.aerolineas_latinoamericanas.contract.messages.AircratlineMessage.class);
		try {
			BpeleventosaerolineaslaClientEp service = new BpeleventosaerolineaslaClientEp();
			BPELEventosAerolineasLA port = service.getBPELEventosAerolineasLAPt();
			port.process(req);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}