package org.jnotifyjs.descriptor;

import org.jnotifyjs.ressource.Ressource;
import org.jnotifyjs.ressource.Support;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ActionDescriptor  {
    Support targetedRessource;
    public String getRessourceId(){
        return targetedRessource.getRessourceId("");
    }
    public abstract String whatHappened();
}
