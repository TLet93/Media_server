/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mediaserver.exceptions;

/**
 *
 * @author Tomek
 */
public class ServerNotFoundException extends Exception{
    public ServerNotFoundException(){
        super("Server is not in the list");
    }
    
}
