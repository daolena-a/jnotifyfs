package org.jnotifyjs.ressource;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ressource<T> {
    String identifier;
    T objectType;
    public T getObject(){
        return objectType;
    }
    public String getIdentifier (){
         return identifier;
    }
}
