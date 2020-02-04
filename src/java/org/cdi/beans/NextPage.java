/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cdi.beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
/**
 *
 * @author Mobile Apps
 */
@Named
@ApplicationScoped
public class NextPage {
    
    public String nextPage(){
        return "nextPage";
    }
}
