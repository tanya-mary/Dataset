package org.examples.ShoppingClicks;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tijo.streaming.impl.domain.generic.GenericEvent;

public class ShoppingClicks extends GenericEvent {
    @JsonProperty("time")
    public String getTime() {
        return time;
    }
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }
    @JsonProperty("action")
    public String getAction() {
        return action;
    }
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }
    @JsonProperty("userid")
    public String getUserid() {
        return userid;
    }
    @JsonProperty("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @JsonProperty("time")
    private String time;

    @JsonProperty("action")
    private String action;

    @JsonProperty("userid")
    private String userid;
}
