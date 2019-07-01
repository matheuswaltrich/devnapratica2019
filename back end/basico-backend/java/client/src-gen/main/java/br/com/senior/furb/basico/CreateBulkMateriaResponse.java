/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkMateriaOutput;

/**
 * Response method for createBulkMateria
 */
@CommandDescription(name="createBulkMateriaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkMateriaResponse")
public interface CreateBulkMateriaResponse extends MessageHandler {

	void createBulkMateriaResponse(CreateBulkMateriaOutput response);
	
	void createBulkMateriaResponseError(ErrorPayload error);

}
