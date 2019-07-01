/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Turma entity.
 */
@CommandDescription(name="deleteTurma", kind=CommandKind.Delete, requestPrimitive="deleteTurma", responsePrimitive="deleteTurmaResponse")
public interface DeleteTurma extends MessageHandler {
    
    public void deleteTurma(Turma.Id id);
    
}
