package net.floodlightcontroller.mactracker;

import net.floodlightcontroller.core.module.IFloodlightService;

import java.util.List;

public interface MACTrackerService extends IFloodlightService {
    public List<InfoMAC> getList();
}
