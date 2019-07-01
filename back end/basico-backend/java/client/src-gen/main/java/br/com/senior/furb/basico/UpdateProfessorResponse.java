/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Professor;

/**
 * Response method for updateProfessor
 */
@CommandDescription(name="updateProfessorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateProfessorResponse")
public interface UpdateProfessorResponse extends MessageHandler {

	void updateProfessorResponse(Professor response);
	
	void updateProfessorResponseError(ErrorPayload error);

}
