/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportProfessor", kind=CommandKind.Query, requestPrimitive="exportProfessor", responsePrimitive="exportProfessorResponse")
public interface ExportProfessor extends MessageHandler {
    
    public ExportProfessorOutput exportProfessor(ExportProfessorInput request);
    
}
