package co.com.rest.client.cancel_flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelResponse", propOrder = {
        "id"
})
public class CancelResponse {
	private String id;

	public CancelResponse() {}

	public String getId() { return id; }

	public void setId(String id)
	{
		this.id = id;
	}
}