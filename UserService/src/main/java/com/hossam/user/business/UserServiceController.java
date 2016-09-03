/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hossam.user.business;

import com.hossam.common.dto.businessResponse.ServiceDataWrapperDTO;
import com.hossam.common.dto.businessResponse.ServiceStatusDTO;
import com.hossam.user.dto.LoggedInUser;
import com.hossam.user.dto.UserData;

/**
 *
 * @author Hossam ElDeen
 */
public interface UserServiceController {

    public ServiceStatusDTO registerUser(UserData userData);

    public ServiceDataWrapperDTO logInUser(LoggedInUser loggedInUser);
    
}
