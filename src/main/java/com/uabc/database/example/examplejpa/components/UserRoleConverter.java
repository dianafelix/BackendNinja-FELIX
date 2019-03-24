package com.uabc.database.example.examplejpa.components;

import com.uabc.database.example.examplejpa.entity.User;
import com.uabc.database.example.examplejpa.entity.UserRole;
import com.uabc.database.example.examplejpa.respository.UserRepository;
import com.uabc.database.example.examplejpa.model.UserRoleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userRoleConverter")
public class UserRoleConverter {

    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;

    public UserRole convertToUserRoleModel2UserRole(UserRoleModel userRoleModel){
        UserRole userRole = new UserRole();
        userRole.setRole(userRoleModel.getRole());
        User user = userRepository.findByUsername(userRoleModel.getUser());
        userRole.setUser(user);
        userRole.setId(userRoleModel.getId());
        return userRole;
    }

    public UserRoleModel convertUserRole2UserRoleModel(UserRole userRole){
        UserRoleModel userRoleModel = new UserRoleModel();
        userRoleModel.setId(userRole.getId());
        userRoleModel.setUser(userRole.getUser().getUsername());
        userRoleModel.setRole(userRole.getRole());
        return userRoleModel;
    }
}
