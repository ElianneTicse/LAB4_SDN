package net.floodlightcontroller.mactracker;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = InfoMACSerializer.class)
public class InfoMAC {
    private String MAC;
    private String atchp;

    public InfoMAC(String MAC, String atchp) {
        this.MAC = MAC;
        this.atchp = atchp;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public String getAtchp() {
        return atchp;
    }

    public void setAtchp(String atchp) {
        this.atchp = atchp;
    }
}
