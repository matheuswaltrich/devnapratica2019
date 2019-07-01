/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Professor entity.
 */
@CommandDescription(name="deleteProfessor", kind=CommandKind.Delete, requestPrimitive="deleteProfessor", responsePrimitive="deleteProfessorResponse")
public interface DeleteProfessor extends MessageHandler {
    
    public void deleteProfessor(Professor.Id id);
    
}
