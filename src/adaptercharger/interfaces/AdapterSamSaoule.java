/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercharger.interfaces;

import adaptercharger.samsaoule.PortableSamSaoule;

/**
 *
 * @author gpetemoy
 */
public class AdapterSamSaoule implements IChargeable {

    private final PortableSamSaoule portableSamSaoule;
    private final int volts = 10;
    
    public AdapterSamSaoule(PortableSamSaoule portableSamSaoule) {
        this.portableSamSaoule = portableSamSaoule;
    }

    @Override
    public void Recharger(int volts) {
        this.portableSamSaoule.ChargerPortable(this.volts);
    }
}
