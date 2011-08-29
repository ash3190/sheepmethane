/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uwa.cits3200.sheepmethane.model;

/**
 *
 * @author Darren
 */
public interface Importer {

    /**
     * Checks to see if imported file is valid.
     * @return true if valid
     */
    public boolean isValid();

    public void importFile(Experiment exp);
}
