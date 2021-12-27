package com.example.mymovies;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieCastResponse implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("cast")
    @Expose
    private List<MovieCasting> cast = null;
    @SerializedName("crew")
    @Expose
    private List<MovieCrew> crew = null;
    private final static long serialVersionUID = 232512510452476944L;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<MovieCasting> getCast() {
        return cast;
    }

    public void setCast(List<MovieCasting> cast) {
        this.cast = cast;
    }

    public List<MovieCrew> getCrew() {
        return crew;
    }

    public void setCrew(List<MovieCrew> crew) {
        this.crew = crew;
    }

}

