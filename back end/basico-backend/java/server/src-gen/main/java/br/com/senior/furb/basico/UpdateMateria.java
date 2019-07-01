/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Materia entity.
 */
@CommandDescription(name="updateMateria", kind=CommandKind.Update, requestPrimitive="updateMateria", responsePrimitive="updateMateriaResponse")
public interface UpdateMateria extends MessageHandler {
    
    public Materia updateMateria(Materia toUpdate);
    
}
