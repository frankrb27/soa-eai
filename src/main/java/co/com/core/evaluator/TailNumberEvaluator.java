package co.com.core.evaluator;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class TailNumberEvaluator {

	public boolean validate(final Exchange exchange) {
		bpel.aerolineas_latinoamericanas.contract.messages.AircratlineMessage req = exchange.getIn().getBody(bpel.aerolineas_latinoamericanas.contract.messages.AircratlineMessage.class);
		return (req.getTailNumber()!=null && getTailNumber().contains(req.getTailNumber()));
	}

	public List<String> getTailNumber(){
		List<String> listNumber = new ArrayList<String>();	
		listNumber.add("MK00012");
		listNumber.add("MK00013");
		listNumber.add("MK00014");
		listNumber.add("MK00015");
		listNumber.add("MK00016");
		listNumber.add("MK00017");
		listNumber.add("MK00018");
		
		return listNumber;
	}
}
