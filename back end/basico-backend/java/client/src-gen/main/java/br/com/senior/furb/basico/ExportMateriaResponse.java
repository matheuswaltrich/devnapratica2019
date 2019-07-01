/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportMateriaOutput;

/**
 * Response method for exportMateria
 */
@CommandDescription(name="exportMateriaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportMateriaResponse")
public interface ExportMateriaResponse extends MessageHandler {

	void exportMateriaResponse(ExportMateriaOutput response);
	
	void exportMateriaResponseError(ErrorPayload error);

}
