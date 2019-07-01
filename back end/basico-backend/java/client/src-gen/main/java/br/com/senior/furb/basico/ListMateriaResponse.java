/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listMateria
 */
@CommandDescription(name="listMateriaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listMateriaResponse")
public interface ListMateriaResponse extends MessageHandler {

	void listMateriaResponse(Materia.PagedResults response);
	
	void listMateriaResponseError(ErrorPayload error);

}
