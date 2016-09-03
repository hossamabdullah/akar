/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hossam.user.service;

import com.hossam.common.dto.businessResponse.ServiceDataWrapperDTO;
import com.hossam.common.dto.businessResponse.ServiceStatusDTO;
import com.hossam.common.util.ValidationUtil;
import com.hossam.exception.types.BusinessException;
import com.hossam.user.delegate.UserServiceDelegate;
import com.hossam.user.dto.LoggedInUser;
import com.hossam.user.dto.UserData;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hossam ElDeen
 */
@Service
@Path("/user")
public class UserService {

    @Context
    private HttpServletRequest request;

    @Autowired(required = true)
    private UserServiceDelegate userServiceDelegate;

    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    public ServiceStatusDTO registerUser(@FormParam("username") String username,
            @FormParam("email") String email,
            @FormParam("profile_picture") String profilePicturePath,
            @FormParam("password") String password) {
        Map argumentsMap = new HashMap<String, Object>();
        argumentsMap.put("username", username);
        argumentsMap.put("email", email);
        argumentsMap.put("profile_picture", profilePicturePath);
        argumentsMap.put("password", password);
        String argumentsErrorMessage = ValidationUtil.checkExistenceOfArguments(argumentsMap);
        if (argumentsErrorMessage != null) {
            return new ServiceStatusDTO("FAILED", argumentsErrorMessage);
        }

        UserData userData =  new UserData(username, email, profilePicturePath, password, null, false);
        ServiceStatusDTO serviceStatusDTO = userServiceDelegate.registerUser(userData);
        return serviceStatusDTO;
    }

    public ServiceDataWrapperDTO logIn(@FormParam("email") String email,
            @FormParam("password") String password) {
        Map argumentsMap = new HashMap<String, Object>();
        argumentsMap.put("email", email);
        argumentsMap.put("password", password);
        String argumentsErrorMessage = ValidationUtil.checkExistenceOfArguments(argumentsMap);
        if (argumentsErrorMessage != null) {
            return new ServiceDataWrapperDTO(null, "FAILED", argumentsErrorMessage);
        }

        LoggedInUser loggedInUser = new LoggedInUser(email, password);
        ServiceDataWrapperDTO serviceDataWrapperDTO = userServiceDelegate.logInUser(loggedInUser);
        return serviceDataWrapperDTO;
    }
}
