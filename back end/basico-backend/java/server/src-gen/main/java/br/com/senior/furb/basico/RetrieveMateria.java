/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Materia entity.
 */
@CommandDescription(name="retrieveMateria", kind=CommandKind.Retrieve, requestPrimitive="retrieveMateria", responsePrimitive="retrieveMateriaResponse")
public interface RetrieveMateria extends MessageHandler {
    
    public Materia retrieveMateria(Materia.Id id);
    
}
