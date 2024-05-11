package com.example.studentmanagament.Services.Imp;

import com.example.studentmanagament.DTO.BaseResponse;
import com.example.studentmanagament.DTO.UserDTO;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserImp {
    BaseResponse<List<UserDTO>> getAllUser();
    BaseResponse<UserDTO> getUserById(Long userId);
    BaseResponse<Page<UserDTO>> getAllByPage(Integer page, Integer limit);
    BaseResponse<UserDTO> addUser(UserDTO userDTO);
    BaseResponse<UserDTO> updateUser(UserDTO userDTO, Long userId);
    BaseResponse<UserDTO> deleteUser(Long userId);
}
