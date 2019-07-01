/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkAlunoOutput;

/**
 * Response method for createBulkAluno
 */
@CommandDescription(name="createBulkAlunoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkAlunoResponse")
public interface CreateBulkAlunoResponse extends MessageHandler {

	void createBulkAlunoResponse(CreateBulkAlunoOutput response);
	
	void createBulkAlunoResponseError(ErrorPayload error);

}
