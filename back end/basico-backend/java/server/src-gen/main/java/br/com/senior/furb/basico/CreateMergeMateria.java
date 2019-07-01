/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Materia entity.
 */
@CommandDescription(name="createMergeMateria", kind=CommandKind.CreateMerge, requestPrimitive="createMergeMateria", responsePrimitive="createMergeMateriaResponse")
public interface CreateMergeMateria extends MessageHandler {
    
    public Materia createMergeMateria(Materia toCreateMerge);
    
}
