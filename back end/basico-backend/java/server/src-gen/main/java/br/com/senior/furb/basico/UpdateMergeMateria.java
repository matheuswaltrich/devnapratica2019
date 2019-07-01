/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Materia entity.
 */
@CommandDescription(name="updateMergeMateria", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeMateria", responsePrimitive="updateMergeMateriaResponse")
public interface UpdateMergeMateria extends MessageHandler {
    
    public Materia updateMergeMateria(Materia toUpdateMerge);
    
}
