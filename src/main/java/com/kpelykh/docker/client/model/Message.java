package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
	@JsonProperty
	public String stream;
	@JsonProperty
	public String status;
	@JsonProperty
	public Progress progressDetail;
	@JsonProperty
	public String progress;
	@JsonProperty
	public String id;
	@JsonProperty
	public String from;
	@JsonProperty
	public long time;
	@JsonProperty
	public Error errorDetail;
	@JsonProperty
	public String error;
}

