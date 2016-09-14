/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Creator 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5492222196408107188L;
    private ComicList comics;
    private EventList events;
    private String firstName;
    private String fullName;
    private int id;
    private String lastName;
    private String middleName;
    private Date modified;
    private String resourceURI;
    private SeriesList series;
    private StoryList stories;
    private String suffix;
    private Thumbnail thumbnail;
    private List<Url> urls;
    /** GETTER
     * A resource list containing the comics which feature work by this creator.
     */
    @JsonGetter("comics")
    public ComicList getComics ( ) { 
        return this.comics;
    }
    
    /** SETTER
     * A resource list containing the comics which feature work by this creator.
     */
    @JsonSetter("comics")
    public void setComics (ComicList value) { 
        this.comics = value;
        notifyObservers(this.comics);
    }
 
    /** GETTER
     * A resource list containing the events which feature work by this creator.
     */
    @JsonGetter("events")
    public EventList getEvents ( ) { 
        return this.events;
    }
    
    /** SETTER
     * A resource list containing the events which feature work by this creator.
     */
    @JsonSetter("events")
    public void setEvents (EventList value) { 
        this.events = value;
        notifyObservers(this.events);
    }
 
    /** GETTER
     * The first name of the creator.
     */
    @JsonGetter("firstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * The first name of the creator.
     */
    @JsonSetter("firstName")
    public void setFirstName (String value) { 
        this.firstName = value;
        notifyObservers(this.firstName);
    }
 
    /** GETTER
     * The full name of the creator (a space-separated concatenation of the above four fields).
     */
    @JsonGetter("fullName")
    public String getFullName ( ) { 
        return this.fullName;
    }
    
    /** SETTER
     * The full name of the creator (a space-separated concatenation of the above four fields).
     */
    @JsonSetter("fullName")
    public void setFullName (String value) { 
        this.fullName = value;
        notifyObservers(this.fullName);
    }
 
    /** GETTER
     * The unique ID of the creator resource.
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique ID of the creator resource.
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * The last name of the creator.
     */
    @JsonGetter("lastName")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * The last name of the creator.
     */
    @JsonSetter("lastName")
    public void setLastName (String value) { 
        this.lastName = value;
        notifyObservers(this.lastName);
    }
 
    /** GETTER
     * The middle name of the creator.
     */
    @JsonGetter("middleName")
    public String getMiddleName ( ) { 
        return this.middleName;
    }
    
    /** SETTER
     * The middle name of the creator.
     */
    @JsonSetter("middleName")
    public void setMiddleName (String value) { 
        this.middleName = value;
        notifyObservers(this.middleName);
    }
 
    /** GETTER
     * The date the resource was most recently modified.
     */
    @JsonGetter("modified")
    public Date getModified ( ) { 
        return this.modified;
    }
    
    /** SETTER
     * The date the resource was most recently modified.
     */
    @JsonSetter("modified")
    public void setModified (Date value) { 
        this.modified = value;
        notifyObservers(this.modified);
    }
 
    /** GETTER
     * The canonical URL identifier for this resource.
     */
    @JsonGetter("resourceURI")
    public String getResourceURI ( ) { 
        return this.resourceURI;
    }
    
    /** SETTER
     * The canonical URL identifier for this resource.
     */
    @JsonSetter("resourceURI")
    public void setResourceURI (String value) { 
        this.resourceURI = value;
        notifyObservers(this.resourceURI);
    }
 
    /** GETTER
     * A resource list containing the series which feature work by this creator.
     */
    @JsonGetter("series")
    public SeriesList getSeries ( ) { 
        return this.series;
    }
    
    /** SETTER
     * A resource list containing the series which feature work by this creator.
     */
    @JsonSetter("series")
    public void setSeries (SeriesList value) { 
        this.series = value;
        notifyObservers(this.series);
    }
 
    /** GETTER
     * A resource list containing the stories which feature work by this creator.
     */
    @JsonGetter("stories")
    public StoryList getStories ( ) { 
        return this.stories;
    }
    
    /** SETTER
     * A resource list containing the stories which feature work by this creator.
     */
    @JsonSetter("stories")
    public void setStories (StoryList value) { 
        this.stories = value;
        notifyObservers(this.stories);
    }
 
    /** GETTER
     * The suffix or honorific for the creator.
     */
    @JsonGetter("suffix")
    public String getSuffix ( ) { 
        return this.suffix;
    }
    
    /** SETTER
     * The suffix or honorific for the creator.
     */
    @JsonSetter("suffix")
    public void setSuffix (String value) { 
        this.suffix = value;
        notifyObservers(this.suffix);
    }
 
    /** GETTER
     * The representative image for this creator.
     */
    @JsonGetter("thumbnail")
    public Thumbnail getThumbnail ( ) { 
        return this.thumbnail;
    }
    
    /** SETTER
     * The representative image for this creator.
     */
    @JsonSetter("thumbnail")
    public void setThumbnail (Thumbnail value) { 
        this.thumbnail = value;
        notifyObservers(this.thumbnail);
    }
 
    /** GETTER
     * A set of public web site URLs for the resource.
     */
    @JsonGetter("urls")
    public List<Url> getUrls ( ) { 
        return this.urls;
    }
    
    /** SETTER
     * A set of public web site URLs for the resource.
     */
    @JsonSetter("urls")
    public void setUrls (List<Url> value) { 
        this.urls = value;
        notifyObservers(this.urls);
    }
 
}
 