/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportAluno", kind=CommandKind.Query, requestPrimitive="exportAluno", responsePrimitive="exportAlunoResponse")
public interface ExportAluno extends MessageHandler {
    
    public ExportAlunoOutput exportAluno(ExportAlunoInput request);
    
}
