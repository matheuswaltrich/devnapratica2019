/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Turma entity.
 */
@CommandDescription(name="updateTurma", kind=CommandKind.Update, requestPrimitive="updateTurma", responsePrimitive="updateTurmaResponse")
public interface UpdateTurma extends MessageHandler {
    
    public Turma updateTurma(Turma toUpdate);
    
}
