package br.ifba.inf011.model.af;

import br.ifba.inf011.model.Credencial;
import br.ifba.inf011.model.MessageRequest;
import br.ifba.inf011.model.MessageResponse;
import br.ifba.inf011.model.Protocolo;
import br.ifba.inf011.model.protocolos.safety.SafetyCredencial;
import br.ifba.inf011.model.protocolos.safety.SafetyMessageRequest;
import br.ifba.inf011.model.protocolos.safety.SafetyMessageResponse;
import br.ifba.inf011.model.protocolos.safety.SafetyProtocolo;

public class ProtocoloSafetyFactory implements ProtocoloAbstractFactoryEstendida{
	
	@Override
	public MessageResponse createResponse() {
		return new SafetyMessageResponse();
	}
	@Override
	public MessageRequest createRequest() {
		return new SafetyMessageRequest();
	}
	@Override
	public Protocolo createProtocolo() {
		return new SafetyProtocolo();
	}
	@Override
	public Credencial createCredencial() {
		return new SafetyCredencial();
	}

}
