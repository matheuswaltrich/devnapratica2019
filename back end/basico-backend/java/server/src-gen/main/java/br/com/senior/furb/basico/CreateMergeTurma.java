/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Turma entity.
 */
@CommandDescription(name="createMergeTurma", kind=CommandKind.CreateMerge, requestPrimitive="createMergeTurma", responsePrimitive="createMergeTurmaResponse")
public interface CreateMergeTurma extends MessageHandler {
    
    public Turma createMergeTurma(Turma toCreateMerge);
    
}
