/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Turma entity.
 */
@CommandDescription(name="createTurma", kind=CommandKind.Create, requestPrimitive="createTurma", responsePrimitive="createTurmaResponse")
public interface CreateTurma extends MessageHandler {
    
    public Turma createTurma(Turma toCreate);
    
}
