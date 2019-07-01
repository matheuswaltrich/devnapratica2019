/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.Map;

import br.com.senior.messaging.Message;

/**
 * Normalizers for payloads accepted/produced by endpoints in basico.
 */
public class BasicoNormalizer {
    
    /**
     * Normalizes the Aluno payload.
     */
    public static void normalize(Aluno toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Aluno.Id payload.
     */
    public static void normalize(Aluno.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Professor payload.
     */
    public static void normalize(Professor toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Professor.Id payload.
     */
    public static void normalize(Professor.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Materia payload.
     */
    public static void normalize(Materia toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Materia.Id payload.
     */
    public static void normalize(Materia.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Turma payload.
     */
    public static void normalize(Turma toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Turma.Id payload.
     */
    public static void normalize(Turma.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    
}
