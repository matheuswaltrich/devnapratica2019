/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Professor entity.
 */
@CommandDescription(name="retrieveProfessor", kind=CommandKind.Retrieve, requestPrimitive="retrieveProfessor", responsePrimitive="retrieveProfessorResponse")
public interface RetrieveProfessor extends MessageHandler {
    
    public Professor retrieveProfessor(Professor.Id id);
    
}
