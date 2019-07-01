/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importTurma", kind=CommandKind.Action, requestPrimitive="importTurma", responsePrimitive="importTurmaResponse")
public interface ImportTurma extends MessageHandler {
    
    public ImportTurmaOutput importTurma(ImportTurmaInput request);
    
}
