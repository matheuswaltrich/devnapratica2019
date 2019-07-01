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
 * Response method for updateMergeTurma
 */
@CommandDescription(name="updateMergeTurmaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeTurmaResponse")
public interface UpdateMergeTurmaResponse extends MessageHandler {

	void updateMergeTurmaResponse(Turma response);
	
	void updateMergeTurmaResponseError(ErrorPayload error);

}
