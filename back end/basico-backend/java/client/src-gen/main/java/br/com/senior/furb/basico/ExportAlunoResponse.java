/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportAlunoOutput;

/**
 * Response method for exportAluno
 */
@CommandDescription(name="exportAlunoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportAlunoResponse")
public interface ExportAlunoResponse extends MessageHandler {

	void exportAlunoResponse(ExportAlunoOutput response);
	
	void exportAlunoResponseError(ErrorPayload error);

}
