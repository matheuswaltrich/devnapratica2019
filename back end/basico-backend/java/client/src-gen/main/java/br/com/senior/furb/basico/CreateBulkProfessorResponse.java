/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkProfessorOutput;

/**
 * Response method for createBulkProfessor
 */
@CommandDescription(name="createBulkProfessorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkProfessorResponse")
public interface CreateBulkProfessorResponse extends MessageHandler {

	void createBulkProfessorResponse(CreateBulkProfessorOutput response);
	
	void createBulkProfessorResponseError(ErrorPayload error);

}
