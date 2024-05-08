package com.example.studentmanagament.Services.Imp;

import com.example.studentmanagament.DTO.BaseResponse;
import com.example.studentmanagament.DTO.UserDTO;

import java.util.List;

public interface UserImp {
    BaseResponse<List<UserDTO>> getAllUser();
    BaseResponse<UserDTO> getUserById(Long userId);
    BaseResponse<UserDTO> addUser(UserDTO userDTO);
    BaseResponse<UserDTO> updateUser(UserDTO userDTO, Long userId);
    BaseResponse<UserDTO> deleteUser(Long userId);
}
