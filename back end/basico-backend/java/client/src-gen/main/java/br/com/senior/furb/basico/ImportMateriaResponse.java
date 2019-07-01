/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportMateriaOutput;

/**
 * Response method for importMateria
 */
@CommandDescription(name="importMateriaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importMateriaResponse")
public interface ImportMateriaResponse extends MessageHandler {

	void importMateriaResponse(ImportMateriaOutput response);
	
	void importMateriaResponseError(ErrorPayload error);

}
