/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportAlunoOutput;

/**
 * Response method for importAluno
 */
@CommandDescription(name="importAlunoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importAlunoResponse")
public interface ImportAlunoResponse extends MessageHandler {

	void importAlunoResponse(ImportAlunoOutput response);
	
	void importAlunoResponseError(ErrorPayload error);

}
