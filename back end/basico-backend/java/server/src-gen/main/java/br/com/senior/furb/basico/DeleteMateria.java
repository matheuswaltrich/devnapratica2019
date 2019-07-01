/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Materia entity.
 */
@CommandDescription(name="deleteMateria", kind=CommandKind.Delete, requestPrimitive="deleteMateria", responsePrimitive="deleteMateriaResponse")
public interface DeleteMateria extends MessageHandler {
    
    public void deleteMateria(Materia.Id id);
    
}
