package org.azati.cources.entity;

public class Request {
    private Integer idRequest;
    private String text;
    private Boolean isReady;
    private Employee stuff;
    private Thing thing;

    public Request(Integer idRequest, String text, Boolean isReady, Employee stuff, Thing thing) {
        this.idRequest = idRequest;
        this.text = text;
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

    public void setStuff(Employee stuff) {
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

    public Employee getStuff() {
        return stuff;
    }

    public Thing getThing() {
        return thing;
    }

    @Override
    public String toString() {
        return "Request{" +
                "number request=" + idRequest +
                "text='" + text + '\'' +
                ", isReady=" + isReady +
                ", stuff=" + stuff +
                ", thing=" + thing +
                '}';
    }
}
