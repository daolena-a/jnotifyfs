package org.jnotifyjs.ressource;

import org.jnotifyjs.api.EventListener;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Support<E extends Ressource, T extends SupportType<E>> {
    T supportType;
    E ressource;
    public String getRessourceId(String id){
        return supportType.getRessource(id).getIdentifier();
    }

       EventListener<Support> listener;

}
