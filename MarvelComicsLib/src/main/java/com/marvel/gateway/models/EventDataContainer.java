/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EventDataContainer 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4791678928315940783L;
    private int count;
    private int limit;
    private int offset;
    private List<Event> results;
    private int total;
    /** GETTER
     * The total number of results returned by this call.
     */
    @JsonGetter("count")
    public int getCount ( ) { 
        return this.count;
    }
    
    /** SETTER
     * The total number of results returned by this call.
     */
    @JsonSetter("count")
    public void setCount (int value) { 
        this.count = value;
        notifyObservers(this.count);
    }
 
    /** GETTER
     * The requested result limit.
     */
    @JsonGetter("limit")
    public int getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * The requested result limit.
     */
    @JsonSetter("limit")
    public void setLimit (int value) { 
        this.limit = value;
        notifyObservers(this.limit);
    }
 
    /** GETTER
     * The requested offset (number of skipped results) of the call.
     */
    @JsonGetter("offset")
    public int getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * The requested offset (number of skipped results) of the call.
     */
    @JsonSetter("offset")
    public void setOffset (int value) { 
        this.offset = value;
        notifyObservers(this.offset);
    }
 
    /** GETTER
     * The list of events returned by the call
     */
    @JsonGetter("results")
    public List<Event> getResults ( ) { 
        return this.results;
    }
    
    /** SETTER
     * The list of events returned by the call
     */
    @JsonSetter("results")
    public void setResults (List<Event> value) { 
        this.results = value;
        notifyObservers(this.results);
    }
 
    /** GETTER
     * The total number of resources available given the current filter set.
     */
    @JsonGetter("total")
    public int getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * The total number of resources available given the current filter set.
     */
    @JsonSetter("total")
    public void setTotal (int value) { 
        this.total = value;
        notifyObservers(this.total);
    }
 
}
 