package org.azati.cources.entity;

public class Request {
    private static Integer idRequest = 0;
    private String text;
    private Boolean isReady;
    private Employeer stuff;
    private Thing thing;

    public Request(String text, Boolean isReady, Employeer stuff, Thing thing){
        idRequest++;
        this.isReady = isReady;
        this.stuff = stuff;
        this.thing = thing;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setReady(Boolean ready) {
        isReady = ready;
    }

    public void setStuff(Employeer stuff) {
        this.stuff = stuff;
    }

    public void setThing(Thing thing) {
        this.thing = thing;
    }

    public Integer getIdRequest() {
        return idRequest;
    }

    public String getText() {
        return text;
    }

    public Boolean getReady() {
        return isReady;
    }

    public Employeer getStuff() {
        return stuff;
    }

    public Thing getThing() {
        return thing;
    }
}
