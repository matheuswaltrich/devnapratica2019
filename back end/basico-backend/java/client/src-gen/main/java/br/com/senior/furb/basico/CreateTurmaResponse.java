/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Turma;

/**
 * Response method for createTurma
 */
@CommandDescription(name="createTurmaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createTurmaResponse")
public interface CreateTurmaResponse extends MessageHandler {

	void createTurmaResponse(Turma response);
	
	void createTurmaResponseError(ErrorPayload error);

}
