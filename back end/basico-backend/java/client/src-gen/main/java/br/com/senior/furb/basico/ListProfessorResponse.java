/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listProfessor
 */
@CommandDescription(name="listProfessorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listProfessorResponse")
public interface ListProfessorResponse extends MessageHandler {

	void listProfessorResponse(Professor.PagedResults response);
	
	void listProfessorResponseError(ErrorPayload error);

}
