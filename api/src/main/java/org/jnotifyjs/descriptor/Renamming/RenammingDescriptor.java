package org.jnotifyjs.descriptor.Renamming;

import org.jnotifyjs.descriptor.ActionDescriptor;
import org.jnotifyjs.ressource.Ressource;
import org.jnotifyjs.ressource.Support;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class RenammingDescriptor<T extends Support> extends ActionDescriptor<T> {
    T previous;
    T after;
    @Override
    public String whatHappened() {
        return ""+previous.getRessourceId()+"has been renamed in"+after.getRessourceId();
    }
}
