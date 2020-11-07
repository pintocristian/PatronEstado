/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;
/**
 *
 * @author Cristian Pinto
 */
public class PayedState extends OrderState{

    public PayedState(Order order) {
        super(order);
    }

    @Override
    public String getStateDescription() {
        return "Pagada";
    }
    
}
