package net.floodlightcontroller.mactracker;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import java.util.ArrayList;
import java.util.List;

public class MACTrackerResource extends ServerResource {
    @Get("json")
    public List<InfoMAC> retrieve() {
        MACTrackerService pihr = (MACTrackerService)getContext().getAttributes().get(MACTrackerService.class.getCanonicalName());
        List<InfoMAC> l = new ArrayList<InfoMAC>();
        l.addAll(pihr.getList());
        return l;
    }
}
