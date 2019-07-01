/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Materia entity.
 */
@CommandDescription(name="createMateria", kind=CommandKind.Create, requestPrimitive="createMateria", responsePrimitive="createMateriaResponse")
public interface CreateMateria extends MessageHandler {
    
    public Materia createMateria(Materia toCreate);
    
}
