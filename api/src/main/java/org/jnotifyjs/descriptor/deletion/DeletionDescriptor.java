package org.jnotifyjs.descriptor.deletion;

import org.jnotifyjs.descriptor.ActionDescriptor;
import org.jnotifyjs.ressource.Ressource;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class DeletionDescriptor<T extends Ressource> extends ActionDescriptor<T>{
        @Override
    public String whatHappened() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
