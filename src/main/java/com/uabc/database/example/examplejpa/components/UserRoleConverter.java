package com.uabc.database.example.examplejpa.components;

import com.uabc.database.example.examplejpa.entity.UserRole;
import com.uabc.database.example.examplejpa.model.UserRoleModel;
import org.springframework.stereotype.Component;

@Component("userRoleConverter")
public class UserRoleConverter {
    public UserRole convertToUserRoleModel2UserRole(UserRoleModel userRoleModel){
        UserRole userRole = new UserRole();
        userRole.setId(userRoleModel.getId());
        userRole.setUser(userRoleModel.getUser());
        userRole.setRole(userRoleModel.getRole());
        return userRole;
    }

    public UserRoleModel convertUserRole2UserRoleModel(UserRole userRole){
        UserRoleModel userRoleModel = new UserRoleModel();
        userRoleModel.setId(userRole.getId());
        userRoleModel.setUser(userRole.getUser());
        userRoleModel.setRole(userRole.getRole());
        return userRoleModel;
    }
}
