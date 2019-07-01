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
 * Response method for createMergeProfessor
 */
@CommandDescription(name="createMergeProfessorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeProfessorResponse")
public interface CreateMergeProfessorResponse extends MessageHandler {

	void createMergeProfessorResponse(Professor response);
	
	void createMergeProfessorResponseError(ErrorPayload error);

}
