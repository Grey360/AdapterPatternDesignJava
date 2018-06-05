/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercharger;

import adaptercharger.interfaces.IChargeable;

/**
 *
 * @author gpetemoy
 */
public class Chargeur {
// le portable branché sur le chargeur
private IChargeable telephone;
// le voltage en sortie du chargeur
private final int voltage = 10;

    /**
     * branchement d'un portable pour le charger
     * @param portable 
     */
    public void brancherPortable(IChargeable portable) {
        System.out.println("branchement d'un portable");
        this.telephone = portable;
        this.telephone.Recharger(voltage);
    }
}
