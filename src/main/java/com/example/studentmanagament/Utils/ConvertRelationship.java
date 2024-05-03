package com.example.studentmanagament.Utils;

import com.example.studentmanagament.DTO.UserDTO;
import com.example.studentmanagament.Models.User;
import org.springframework.stereotype.Component;

@Component
public class ConvertRelationship {
    public User convertUserDTOToUser(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setAddress(userDTO.getAddress());
        user.setFisrtName(userDTO.getFisrtName());
        user.setLastName(userDTO.getLastName());
        user.setUsername(userDTO.getUsername());
        user.setCreateAt(userDTO.getCreateAt());
        user.setPassword(userDTO.getPassword());
        user.setUpdateAt(userDTO.getUpdateAt());
        return user;
    }
    public UserDTO convertUserToUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setAddress(user.getAddress());
        userDTO.setFisrtName(user.getFisrtName());
        userDTO.setLastName(user.getLastName());
        userDTO.setUsername(user.getUsername());
        userDTO.setCreateAt(user.getCreateAt());
        userDTO.setPassword(user.getPassword());
        userDTO.setUpdateAt(user.getUpdateAt());
        return userDTO;
    }
}
