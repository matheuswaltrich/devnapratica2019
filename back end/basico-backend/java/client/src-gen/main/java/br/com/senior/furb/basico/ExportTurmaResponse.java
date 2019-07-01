/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportTurmaOutput;

/**
 * Response method for exportTurma
 */
@CommandDescription(name="exportTurmaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportTurmaResponse")
public interface ExportTurmaResponse extends MessageHandler {

	void exportTurmaResponse(ExportTurmaOutput response);
	
	void exportTurmaResponseError(ErrorPayload error);

}
