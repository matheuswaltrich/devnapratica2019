/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Professor entity.
 */
@CommandDescription(name="createProfessor", kind=CommandKind.Create, requestPrimitive="createProfessor", responsePrimitive="createProfessorResponse")
public interface CreateProfessor extends MessageHandler {
    
    public Professor createProfessor(Professor toCreate);
    
}
