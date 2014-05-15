package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Event 
{
	@JsonProperty("status")
	private String status = null;
	
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("from")
	private String from = null;
	
	@JsonProperty
	Long time = null;	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	
    public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	
    @Override
    public String toString() {
        return "Events{" +
                "status='" + status + '\'' +
                ", id='" + id + '\'' +
                ", from='" + from + '\'' +
                ", time='" + time + '\'' +
                '}';
    }	
	
}
