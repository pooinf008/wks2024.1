package br.ifba.inf011.model.builder;

import br.ifba.inf011.model.AplicacaoProtocolo;
import br.ifba.inf011.model.Compactador;
import br.ifba.inf011.model.Credencial;
import br.ifba.inf011.model.Mensageiro;
import br.ifba.inf011.model.MensageiroINF011;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.TipoProtocolo;
import br.ifba.inf011.model.TransporteProtocolo;
import br.ifba.inf011.model.af.ProtocoloAbstractFactory;
import br.ifba.inf011.model.compactadores.DummyCompactador;
import br.ifba.inf011.model.compactadores.EspacoCompactador;
import br.ifba.inf011.model.credencial.AbertaCredencial;
import br.ifba.inf011.model.credencial.AdminCredencial;
import br.ifba.inf011.model.protocolos.transporte.TCPProtocolo;
import br.ifba.inf011.model.protocolos.transporte.UDPProtocolo;

public class MensageiroBuilder{

	private AplicacaoProtocolo aplicacao;
	private TransporteProtocolo transporte;
	private MessageRequest request;
	private MessageResponse response;
	private Credencial credencial;
	private Compactador compactador;

	
	public MensageiroBuilder reset() {
		this.aplicacao = null;
		this.transporte = null;
		this.request = null;
		this.response = null;
		this.credencial = null;
		this.compactador = null;
		return this;
	}

	public MensageiroBuilder comProtocolo(TipoProtocolo ftp) {
		ProtocoloAbstractFactory paf = ftp.af();
		this.aplicacao = paf.createProtocolo();
		this.request = paf.createRequest();
		this.response = paf.createResponse();
		return this;
	}
	
	/*
	 * public MensageiroBuilder comProtocolo(AplicacaoProtocolo aplicacao) {
	 * this.aplicacao = aplicacao; return this; }
	 */
	
	
	public MensageiroBuilder confiavel() {
		this.setConfiavel(true);
		return this;
	}
	
	public MensageiroBuilder naoConfiavel() {
		this.setConfiavel(false);
		return this;
	}
	

	private void setConfiavel(Boolean confiavel) {
		this.transporte = (confiavel) ? new TCPProtocolo()
								      : new UDPProtocolo();
		
	}
	
	public MensageiroBuilder seguro() {
		this.setSeguro(true);
		return this;
	}
	
	public MensageiroBuilder naoSeguro() {
		this.setSeguro(false);
		return this;
	}	

	public void setSeguro(Boolean seguro) {
		this.credencial = (seguro) ? new AdminCredencial()
			      				   : new AbertaCredencial();
	}

	public MensageiroBuilder comCompactador(Compactador compactador) {
		this.compactador = compactador;
		return this;
	}

	public Mensageiro<String> build() {
		this.transporte = (this.transporte == null) ?
					 	   new TCPProtocolo() :
					 	   this.transporte;
		this.credencial = (this.credencial == null) ? new AbertaCredencial() : 
						   this.credencial;
		this.compactador = (this.compactador == null) ? new DummyCompactador() : 
							this.compactador;
			
		this.aplicacao.setTransporte(this.transporte);
		
		return new MensageiroINF011(this.aplicacao, this.transporte,
				 					this.request, this.response, 
				 					this.credencial, this.compactador);
	}

}
