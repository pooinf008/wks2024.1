package br.ifba.inf011.model.protocolos.safety;

import java.util.HashMap;
import java.util.Map;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;

public class SafetyMessageResponse implements MessageResponse{
	
	private Map<String, String> header;
	private char[] body;
	
	
	public SafetyMessageResponse() {
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
		buffer.append("Safety Response\n");
		for(String key : this.header.keySet())
			buffer.append(key + ": " + this.header.get(key) + "\n");
		buffer.append(this.body);
		return buffer.toString();
	}
	

}
