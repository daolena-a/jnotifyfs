package org.jnotifyjs.descriptor;

import org.jnotifyjs.ressource.Ressource;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ActionDescriptor <T extends Ressource> {
    T targetedRessource;
    public String getRessourceId(){
        return targetedRessource.getIdentifier();
    }
    public abstract String whatHappened();
}
