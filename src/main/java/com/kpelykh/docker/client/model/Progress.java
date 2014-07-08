package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Progress {
	@JsonProperty
	public int current;
	@JsonProperty
	public int total;
	@JsonProperty
	public long start; // start time
	
	@Override
	public String toString() {
		return String.format("%d/%d", current, total);
	}
}