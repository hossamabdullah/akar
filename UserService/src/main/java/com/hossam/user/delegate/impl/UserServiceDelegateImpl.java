/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hossam.user.delegate.impl;

import com.hossam.common.dto.businessResponse.ServiceDataWrapperDTO;
import com.hossam.common.dto.businessResponse.ServiceStatusDTO;
import com.hossam.user.business.UserServiceController;
import com.hossam.user.delegate.UserServiceDelegate;
import com.hossam.user.dto.LoggedInUser;
import com.hossam.user.dto.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hossam ElDeen
 */
@Component
public class UserServiceDelegateImpl implements UserServiceDelegate{
    
    @Autowired(required = true)
    UserServiceController userServiceController;
    
    @Override
    public ServiceStatusDTO registerUser(UserData userData) {
        ServiceStatusDTO serviceStatusDTO = userServiceController.registerUser(userData);
        return serviceStatusDTO;
    }

    @Override
    public ServiceDataWrapperDTO logInUser(LoggedInUser loggedInUser) {
        ServiceDataWrapperDTO serviceDataWrapperDTO = userServiceController.logInUser(loggedInUser);
        return serviceDataWrapperDTO;
    }
    
}
