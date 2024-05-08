package com.example.studentmanagament.Services;

import com.example.studentmanagament.DTO.BaseResponse;
import com.example.studentmanagament.DTO.UserDTO;
import com.example.studentmanagament.Models.Role;
import com.example.studentmanagament.Models.User;
import com.example.studentmanagament.Repositories.UserRepository;
import com.example.studentmanagament.Services.Imp.UserImp;
import com.example.studentmanagament.Utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserImp {
    @Autowired
    private UserRepository userRepository;

    @Override
    public BaseResponse<List<UserDTO>> getAllUser() {
        BaseResponse<List<UserDTO>> baseResponse = new BaseResponse<>();
        List<UserDTO> userDTOList = new ArrayList<>();
        try {
            List<User> userList = userRepository.findAll();
            if (userList.isEmpty() || userList == null) {
                baseResponse.setMessage(Constant.EMPTY_ALL_USER);
                baseResponse.setCode(Constant.NOT_FOUND_CODE);
                return baseResponse;
            }
            for (User user : userList) {
                UserDTO userDTO = new UserDTO();
                userDTO.setUserId(user.getId());
                userDTO.setAddress(user.getAddress());
                userDTO.setPassword(user.getPassword());
                userDTO.setUsername(user.getUsername());
                userDTO.setFisrtName(user.getFisrtName());
                userDTO.setLastName(user.getLastName());
                userDTO.setEmail(user.getEmail());
                userDTO.setCreateAt(user.getCreateAt());
                userDTO.setUpdateAt(user.getUpdateAt());
                userDTOList.add(userDTO);
            }
            baseResponse.setData(userDTOList);
            baseResponse.setMessage(Constant.SUCCESS_MESSAGE);
            baseResponse.setCode(Constant.SUCCESS_CODE);
        } catch (Exception ex) {
            baseResponse.setMessage(Constant.ERROR_TO_GET_USER);
            baseResponse.setCode(Constant.INTERNAL_SERVER_ERROR_CODE);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse<UserDTO> getUserById(Long userId) {
        BaseResponse<UserDTO> baseResponse = new BaseResponse<>();
        try {
            User user = userRepository.findUserById(userId);
            if (user == null) {
                baseResponse.setMessage(Constant.EMPTY_USER_ID);
                baseResponse.setCode(Constant.NOT_FOUND_CODE);
                return baseResponse;
            }
            UserDTO userDTO = new UserDTO();
            userDTO.setUserId(user.getId());
            userDTO.setAddress(user.getAddress());
            userDTO.setPassword(user.getPassword());
            userDTO.setUsername(user.getUsername());
            userDTO.setFisrtName(user.getFisrtName());
            userDTO.setLastName(user.getLastName());
            userDTO.setEmail(user.getEmail());
            userDTO.setCreateAt(user.getCreateAt());
            userDTO.setUpdateAt(user.getUpdateAt());
            baseResponse.setData(userDTO);
            baseResponse.setMessage(Constant.SUCCESS_MESSAGE);
            baseResponse.setCode(Constant.SUCCESS_CODE);
        } catch (Exception exception) {
            baseResponse.setMessage(Constant.ERROR_TO_GET_USER);
            baseResponse.setCode(Constant.INTERNAL_SERVER_ERROR_CODE);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse<UserDTO> addUser(UserDTO userDTO) {
        BaseResponse<UserDTO> baseResponse = new BaseResponse<>();
        try {
            User checkUserUsernameExists = userRepository.findUserByUsername(userDTO.getUsername());
            if (checkUserUsernameExists != null) {
                baseResponse.setMessage(Constant.EXISTS_USER_USERNAME + userDTO.getUsername());
                baseResponse.setCode(Constant.BAD_REQUEST_CODE);
                return baseResponse;
            }
            User checkUserEmailExists = userRepository.findUserByEmail(userDTO.getEmail());
            if (checkUserEmailExists != null) {
                baseResponse.setMessage(Constant.EXISTS_USER_USERNAME + userDTO.getEmail());
                baseResponse.setCode(Constant.BAD_REQUEST_CODE);
                return baseResponse;
            }
            User user = new User();
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setFisrtName(userDTO.getFisrtName());
            user.setLastName(userDTO.getLastName());
            user.setAddress(userDTO.getAddress());
            user.setEmail(userDTO.getEmail());
            user.setCreateAt(userDTO.getCreateAt());
            user.setUpdateAt(userDTO.getUpdateAt());
            user.setRole(Role.USER);
            userRepository.save(user);
            baseResponse.setMessage(Constant.SUCCESS_ADD_MESSAGE);
            baseResponse.setCode(Constant.SUCCESS_CODE);
        } catch (Exception exception) {
            baseResponse.setMessage(Constant.ERROR_TO_GET_USER);
            baseResponse.setCode(Constant.INTERNAL_SERVER_ERROR_CODE);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse<UserDTO> updateUser(UserDTO userDTO, Long userId) {
        BaseResponse<UserDTO> baseResponse = new BaseResponse<>();
        try {
            User user = userRepository.findUserById(userId);
            User checkUserUsernameExists = userRepository.findUserByUsername(userDTO.getUsername());
            User checkUserEmailExists = userRepository.findUserByEmail(userDTO.getEmail());
            if (user == null) {
                baseResponse.setMessage(Constant.EMPTY_USER_ID);
                baseResponse.setCode(Constant.NOT_FOUND_CODE);
            } else {
                if (!user.getUsername().equals(userDTO.getUsername())) {
                    if (checkUserUsernameExists != null) {
                        baseResponse.setMessage(Constant.EXISTS_USER_USERNAME + userDTO.getUsername());
                        baseResponse.setCode(Constant.BAD_REQUEST_CODE);
                        return baseResponse;
                    }
                }
                if (!user.getEmail().equals(userDTO.getEmail())) {
                    if (checkUserEmailExists != null) {
                        baseResponse.setMessage(Constant.EXISTS_USER_EMAIL + userDTO.getEmail());
                        baseResponse.setCode(Constant.BAD_REQUEST_CODE);
                        return baseResponse;
                    }
                }
            }
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setFisrtName(userDTO.getFisrtName());
            user.setLastName(userDTO.getLastName());
            user.setAddress(userDTO.getAddress());
            user.setEmail(userDTO.getEmail());
            user.setCreateAt(userDTO.getCreateAt());
            user.setUpdateAt(userDTO.getUpdateAt());
            user.setRole(Role.USER);
            userRepository.save(user);
            baseResponse.setMessage(Constant.SUCCESS_UPDATE_MESSAGE);
            baseResponse.setCode(Constant.SUCCESS_CODE);
        } catch (Exception ex) {
            baseResponse.setMessage(Constant.ERROR_TO_GET_USER);
            baseResponse.setCode(Constant.INTERNAL_SERVER_ERROR_CODE);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse<UserDTO> deleteUser(Long userId) {
        BaseResponse<UserDTO> baseResponse = new BaseResponse<>();
        try {
           User user = userRepository.findUserById(userId);
           if (user == null){
               baseResponse.setMessage(Constant.EMPTY_USER_ID);
               baseResponse.setCode(Constant.NOT_FOUND_CODE);
           }
           userRepository.delete(user);
           baseResponse.setMessage(Constant.SUCCESS_DELETE_MESSAGE);
           baseResponse.setCode(Constant.SUCCESS_CODE);
        } catch (Exception ex){
            baseResponse.setMessage(Constant.ERROR_TO_GET_USER);
            baseResponse.setCode(Constant.INTERNAL_SERVER_ERROR_CODE);
        }
        return baseResponse;
    }
}
