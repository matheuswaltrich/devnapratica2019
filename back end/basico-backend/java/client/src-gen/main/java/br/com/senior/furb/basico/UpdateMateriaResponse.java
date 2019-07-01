/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Materia;

/**
 * Response method for updateMateria
 */
@CommandDescription(name="updateMateriaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMateriaResponse")
public interface UpdateMateriaResponse extends MessageHandler {

	void updateMateriaResponse(Materia response);
	
	void updateMateriaResponseError(ErrorPayload error);

}
