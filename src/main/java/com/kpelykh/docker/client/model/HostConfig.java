package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;

/**
 *
 * @author Konstantin Pelykh (kpelykh@gmail.com)
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HostConfig {

    @JsonProperty("Binds")
    private String[] binds;

    @JsonProperty("ContainerIDFile")
    private String containerIDFile;

    @JsonProperty("LxcConf")
    private LxcConf[] lxcConf;


    @JsonProperty("Links")
    private String[] links;

    @JsonProperty("PortBindings")
    private Ports portBindings;

    @JsonProperty("Privileged")
    private boolean privileged;

    @JsonProperty("PublishAllPorts")
    private boolean publishAllPorts;

    @JsonProperty("NetworkMode")
    private String networkMode;

    public HostConfig() {
        this.binds = null;
    }


    public String[] getBinds() {
        return binds;
    }

    @JsonIgnore
    public void setBinds(String[] binds) {
        this.binds = binds;
    }
    
    @JsonIgnore
    public void setBinds(final BoundHostVolumes volumes) {
        setBinds(volumes.asBinds());
    }

    public String getContainerIDFile() {
        return containerIDFile;
    }

    public void setContainerIDFile(String containerIDFile) {
        this.containerIDFile = containerIDFile;
    }

    public LxcConf[] getLxcConf() {
        return lxcConf;
    }

    public void setLxcConf(LxcConf[] lxcConf) {
        this.lxcConf = lxcConf;
    }

    public String[] getLinks() {
        return links;
    }

    public void setLinks(String[] links) {
        this.links = links;
    }

    public Ports getPortBindings() {
        return portBindings;
    }

    public void setPortBindings(Ports portBindings) {
        this.portBindings = portBindings;
    }

    public boolean isPrivileged() {
        return privileged;
    }

    public void setPrivileged(boolean privileged) {
        this.privileged = privileged;
    }

    public boolean isPublishAllPorts() {
        return publishAllPorts;
    }

    public void setPublishAllPorts(boolean publishAllPorts) {
        this.publishAllPorts = publishAllPorts;
    }

    public String getNetworkMode() {
        return networkMode;
    }
    
    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }
    
    @Override
    public String toString() {
        return "HostConfig{" +
                "binds=" + Arrays.toString(binds) +
                ", containerIDFile='" + containerIDFile + '\'' +
                ", lxcConf=" + Arrays.toString(lxcConf) +
                ", links=" + Arrays.toString(links) +
                ", portBindings=" + portBindings +
                ", privileged=" + privileged +
                ", publishAllPorts=" + publishAllPorts +
                ", networkMode=" + networkMode +
                '}';
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class LxcConf {
        @JsonProperty("Key")
        public String key;

        @JsonProperty("Value")
        public String value;

        public LxcConf(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public LxcConf() {
        }

        public String getKey() {
            return key;
        }

        public LxcConf setKey(String key) {
            this.key = key;
            return this;
        }

        public String getValue() {
            return value;
        }

        public LxcConf setValue(String value) {
            this.value = value;
            return this;
        }

    }
}
