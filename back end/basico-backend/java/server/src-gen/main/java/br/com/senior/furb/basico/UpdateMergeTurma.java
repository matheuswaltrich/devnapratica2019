/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Turma entity.
 */
@CommandDescription(name="updateMergeTurma", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeTurma", responsePrimitive="updateMergeTurmaResponse")
public interface UpdateMergeTurma extends MessageHandler {
    
    public Turma updateMergeTurma(Turma toUpdateMerge);
    
}
