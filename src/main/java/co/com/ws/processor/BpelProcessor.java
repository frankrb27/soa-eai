package co.com.ws.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import bpel.aerolineas_latinoamericanas.contract.messages.FlightLeg;
import bpel.com.oracle.xmlns.gestioneventosvuelos.eventosaereos.bpeleventosaerolineasla.BPELEventosAerolineasLA;
import bpel.com.oracle.xmlns.gestioneventosvuelos.eventosaereos.bpeleventosaerolineasla.BpeleventosaerolineaslaClientEp;

public class BpelProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		bpel.aerolineas_latinoamericanas.contract.messages.AircratlineMessage req = exchange.getIn().getBody(bpel.aerolineas_latinoamericanas.contract.messages.AircratlineMessage.class);
		try {
			BpeleventosaerolineaslaClientEp service = new BpeleventosaerolineaslaClientEp();
			BPELEventosAerolineasLA port = service.getBPELEventosAerolineasLAPt();
			List<FlightLeg> listTmp = req.getFlightLeg();
			for(FlightLeg leg : listTmp) {
				req.getFlightLeg().clear();
				req.getFlightLeg().add(leg);
				port.process(req);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

}