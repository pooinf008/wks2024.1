package br.ifba.inf011.model.protocolos.telnet;

import java.util.HashMap;
import java.util.Map;

import br.ifba.inf011.model.MessageRequest;

public class TelnetMessageRequest implements MessageRequest{
	
	private Map<String, String> header;
	private char[] body;
	
	
	public TelnetMessageRequest() {
		this.header = new HashMap<String, String>();
	}
	
	public void addHeader(String key, String value) {
		this.header.put(key, value);
	}
	
	public void setBody(String body) {
		this.body = body.toCharArray();
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Telnet Request\n");
		for(String key : this.header.keySet())
			buffer.append(key + ": " + this.header.get(key) + "\n");
		if(this.body != null)
			buffer.append(this.body);
		return buffer.toString();
	}
	

}
