/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkTurmaOutput;

/**
 * Response method for createBulkTurma
 */
@CommandDescription(name="createBulkTurmaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkTurmaResponse")
public interface CreateBulkTurmaResponse extends MessageHandler {

	void createBulkTurmaResponse(CreateBulkTurmaOutput response);
	
	void createBulkTurmaResponseError(ErrorPayload error);

}
