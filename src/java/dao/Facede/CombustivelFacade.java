/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.Facede;

import entity.Combustivel;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@Stateless
public class CombustivelFacade extends AbstractFacade<Combustivel> {
    @PersistenceContext(unitName = "academico_SLCPPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CombustivelFacade() {
        super(Combustivel.class);
    }
    
}
