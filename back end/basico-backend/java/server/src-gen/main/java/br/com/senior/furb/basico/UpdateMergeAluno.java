/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Aluno entity.
 */
@CommandDescription(name="updateMergeAluno", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeAluno", responsePrimitive="updateMergeAlunoResponse")
public interface UpdateMergeAluno extends MessageHandler {
    
    public Aluno updateMergeAluno(Aluno toUpdateMerge);
    
}
