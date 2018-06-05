/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercharger;

import adaptercharger.ericsonne.AdapterEricSonne;
import adaptercharger.ericsonne.PortableSonneEricSonne;
import adaptercharger.interfaces.AdapterSamSaoule;
import adaptercharger.samsaoule.PortableSamSaoule;
import adaptercharger.interfaces.IChargeable;

/**
 *
 * @author gpetemoy
 */
public class AdapterCharger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Telephones
        PortableSamSaoule portableSamSaoule = new PortableSamSaoule();
        PortableSonneEricSonne portableEricSonne = new PortableSonneEricSonne();
        
        IChargeable chargeableSamSaoule = new AdapterSamSaoule(portableSamSaoule);
        IChargeable chargeableEricSonne = new AdapterEricSonne(portableEricSonne);
        
        Chargeur chargeur = new Chargeur();
        chargeur.brancherPortable(chargeableSamSaoule);
        chargeur.brancherPortable(chargeableEricSonne);
    }
    
}
