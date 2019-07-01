/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportTurma", kind=CommandKind.Query, requestPrimitive="exportTurma", responsePrimitive="exportTurmaResponse")
public interface ExportTurma extends MessageHandler {
    
    public ExportTurmaOutput exportTurma(ExportTurmaInput request);
    
}
