/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportProfessorOutput;

/**
 * Response method for importProfessor
 */
@CommandDescription(name="importProfessorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importProfessorResponse")
public interface ImportProfessorResponse extends MessageHandler {

	void importProfessorResponse(ImportProfessorOutput response);
	
	void importProfessorResponseError(ErrorPayload error);

}
