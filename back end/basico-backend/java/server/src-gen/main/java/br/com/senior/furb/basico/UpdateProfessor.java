/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Professor entity.
 */
@CommandDescription(name="updateProfessor", kind=CommandKind.Update, requestPrimitive="updateProfessor", responsePrimitive="updateProfessorResponse")
public interface UpdateProfessor extends MessageHandler {
    
    public Professor updateProfessor(Professor toUpdate);
    
}
