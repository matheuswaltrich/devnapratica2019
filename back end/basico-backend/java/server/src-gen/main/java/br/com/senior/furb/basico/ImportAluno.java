/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importAluno", kind=CommandKind.Action, requestPrimitive="importAluno", responsePrimitive="importAlunoResponse")
public interface ImportAluno extends MessageHandler {
    
    public ImportAlunoOutput importAluno(ImportAlunoInput request);
    
}
