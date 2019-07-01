/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Aluno entity.
 */
@CommandDescription(name="createMergeAluno", kind=CommandKind.CreateMerge, requestPrimitive="createMergeAluno", responsePrimitive="createMergeAlunoResponse")
public interface CreateMergeAluno extends MessageHandler {
    
    public Aluno createMergeAluno(Aluno toCreateMerge);
    
}
