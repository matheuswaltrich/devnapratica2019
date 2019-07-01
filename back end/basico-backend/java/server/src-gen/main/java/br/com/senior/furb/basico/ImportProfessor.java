/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importProfessor", kind=CommandKind.Action, requestPrimitive="importProfessor", responsePrimitive="importProfessorResponse")
public interface ImportProfessor extends MessageHandler {
    
    public ImportProfessorOutput importProfessor(ImportProfessorInput request);
    
}
