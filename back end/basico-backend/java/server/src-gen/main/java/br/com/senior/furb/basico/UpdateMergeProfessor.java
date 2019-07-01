/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Professor entity.
 */
@CommandDescription(name="updateMergeProfessor", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeProfessor", responsePrimitive="updateMergeProfessorResponse")
public interface UpdateMergeProfessor extends MessageHandler {
    
    public Professor updateMergeProfessor(Professor toUpdateMerge);
    
}
