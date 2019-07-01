/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Materia entity.
 */
@CommandDescription(name="listMateria", kind=CommandKind.List, requestPrimitive="listMateria", responsePrimitive="listMateriaResponse")
public interface ListMateria extends MessageHandler {
    
    public Materia.PagedResults listMateria(Materia.PageRequest pageRequest);
    
}
