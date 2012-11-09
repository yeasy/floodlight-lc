package net.floodlightcontroller.dcm;

import java.util.Map;

import net.floodlightcontroller.core.IOFSwitch;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.core.types.MacVlanPair;

public interface IDCMService extends IFloodlightService {
    /**
     * Returns the DCM's learned host table
     * @return The learned host table
     */
    public Map<IOFSwitch, Map<MacVlanPair,Short>> getTable();
}
