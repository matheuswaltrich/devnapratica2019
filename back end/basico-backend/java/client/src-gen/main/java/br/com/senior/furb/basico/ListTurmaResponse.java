/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listTurma
 */
@CommandDescription(name="listTurmaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listTurmaResponse")
public interface ListTurmaResponse extends MessageHandler {

	void listTurmaResponse(Turma.PagedResults response);
	
	void listTurmaResponseError(ErrorPayload error);

}
