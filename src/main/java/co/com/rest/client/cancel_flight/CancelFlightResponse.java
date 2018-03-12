package co.com.rest.client.cancel_flight;

@javax.xml.bind.annotation.XmlRootElement
public class CancelFlightResponse {
	private String id;

	public CancelFlightResponse() {}

	public String getId() { return id; }

	public void setId(String id)
	{
		this.id = id;
	}
}