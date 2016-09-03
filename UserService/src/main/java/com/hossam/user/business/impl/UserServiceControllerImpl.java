/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hossam.user.business.impl;

import com.hossam.common.dto.businessResponse.ServiceDataWrapperDTO;
import com.hossam.common.dto.businessResponse.ServiceStatusDTO;
import com.hossam.user.business.UserServiceController;
import com.hossam.user.dto.LoggedInUser;
import com.hossam.user.dto.UserData;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Hossam ElDeen
 */
@Controller
public class UserServiceControllerImpl implements UserServiceController{

    @Override
    public ServiceStatusDTO registerUser(UserData userData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServiceDataWrapperDTO logInUser(LoggedInUser loggedInUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
