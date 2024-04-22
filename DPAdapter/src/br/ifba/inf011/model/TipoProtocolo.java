package br.ifba.inf011.model;

import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.af.ProtocoloFTPFactory;
import br.ifba.inf011.model.af.ProtocoloHTTPFactory;
import br.ifba.inf011.model.af.ProtocoloTelnetFactory;

public enum TipoProtocolo {
	
	FTP {
		@Override
		public ProtocoloAbstractFactory af() {
			// TODO Auto-generated method stub
			return new ProtocoloFTPFactory();
		}
		
		@Override
		public String nome() {
			return "FTP";
		}		
		
	}, 
	
	HTTP{
		@Override
		public ProtocoloAbstractFactory af() {
			// TODO Auto-generated method stub
			return new ProtocoloHTTPFactory();
		}

		@Override
		public String nome() {
			return "HTTP";
		}		
		
		
	}, 
	
	TELNET{
		@Override
		public ProtocoloAbstractFactory af() {
			return new ProtocoloTelnetFactory();
		}
		
		@Override
		public String nome() {
			return "Telnet";
		}		
	};	
	
	public abstract ProtocoloAbstractFactory af();
	public abstract String nome();
	
}
