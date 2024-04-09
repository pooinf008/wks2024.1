package br.ifba.inf011.model.protocolos.ftp;

import java.util.HashMap;
import java.util.Map;

import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;

public class FTPMessageResponse implements MessageResponse{
	
	private Map<String, String> header;
	private char[] body;
	
	
	public FTPMessageResponse() {
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
		buffer.append("FTP Response\n");
		for(String key : this.header.keySet())
			buffer.append(key + ": " + this.header.get(key) + "\n");
		buffer.append(this.body);
		return buffer.toString();
	}
	

}
