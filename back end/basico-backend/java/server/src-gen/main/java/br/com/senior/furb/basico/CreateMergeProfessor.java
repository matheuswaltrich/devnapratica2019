/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Professor entity.
 */
@CommandDescription(name="createMergeProfessor", kind=CommandKind.CreateMerge, requestPrimitive="createMergeProfessor", responsePrimitive="createMergeProfessorResponse")
public interface CreateMergeProfessor extends MessageHandler {
    
    public Professor createMergeProfessor(Professor toCreateMerge);
    
}
