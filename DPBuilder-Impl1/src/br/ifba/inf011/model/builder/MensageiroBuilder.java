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

public class MensageiroBuilder implements MessageBuilder{

	private AplicacaoProtocolo aplicacao;
	private TransporteProtocolo transporte;
	private MessageRequest request;
	private MessageResponse response;
	private Credencial credencial;
	private Compactador compactador;

	
	@Override
	public void reset() {
		this.aplicacao = null;
		this.transporte = null;
		this.request = null;
		this.response = null;
		this.credencial = null;
		this.compactador = null;
	}

	@Override
	public void setTipoProtocolo(TipoProtocolo ftp) {
		ProtocoloAbstractFactory paf = ftp.af();
		this.aplicacao = paf.createProtocolo();
		this.request = paf.createRequest();
		this.response = paf.createResponse();
	}

	@Override
	public void setConfiavel(Boolean confiavel) {
		this.transporte = (confiavel) ? new TCPProtocolo()
								      : new UDPProtocolo();
		
	}

	@Override
	public void setSeguro(Boolean seguro) {
		this.credencial = (seguro) ? new AdminCredencial()
			      				   : new AbertaCredencial();
		
	}

	@Override
	public void setCompactador(Compactador compactador) {
		this.compactador = compactador;
	}

	public Mensageiro<String> getMensageiro() {
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
