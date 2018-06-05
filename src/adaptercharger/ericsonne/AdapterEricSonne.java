/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercharger.ericsonne;

import adaptercharger.interfaces.IChargeable;

/**
 *
 * @author gpetemoy
 */
public class AdapterEricSonne implements IChargeable {

    private final PortableSonneEricSonne portableEricSonne;
    private final int volts = 5;

    public AdapterEricSonne(PortableSonneEricSonne portableEricSonne) {
        this.portableEricSonne = portableEricSonne;
    }

    @Override
    public void Recharger(int volts) {
        this.portableEricSonne.ChargerBatteries(this.volts);
    }
}
