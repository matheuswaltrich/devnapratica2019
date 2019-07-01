/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportProfessorOutput;

/**
 * Response method for exportProfessor
 */
@CommandDescription(name="exportProfessorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportProfessorResponse")
public interface ExportProfessorResponse extends MessageHandler {

	void exportProfessorResponse(ExportProfessorOutput response);
	
	void exportProfessorResponseError(ErrorPayload error);

}
