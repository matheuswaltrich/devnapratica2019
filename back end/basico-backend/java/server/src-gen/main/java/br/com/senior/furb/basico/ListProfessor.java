/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Professor entity.
 */
@CommandDescription(name="listProfessor", kind=CommandKind.List, requestPrimitive="listProfessor", responsePrimitive="listProfessorResponse")
public interface ListProfessor extends MessageHandler {
    
    public Professor.PagedResults listProfessor(Professor.PageRequest pageRequest);
    
}
