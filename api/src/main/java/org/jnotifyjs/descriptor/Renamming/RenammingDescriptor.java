package org.jnotifyjs.descriptor.Renamming;

import org.jnotifyjs.descriptor.ActionDescriptor;
import org.jnotifyjs.ressource.Ressource;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class RenammingDescriptor<T extends Ressource> extends ActionDescriptor<T> {
    T previous;
    T after;
    @Override
    public String whatHappened() {
        return ""+previous.getIdentifier()+"has been renamed in"+after.getIdentifier();
    }
}
