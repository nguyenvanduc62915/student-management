package com.example.studentmanagament.Controllers;

import com.example.studentmanagament.DTO.BaseResponse;
import com.example.studentmanagament.DTO.UserDTO;
import com.example.studentmanagament.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getAll")
    public ResponseEntity<BaseResponse<List<UserDTO>>> getAllUser(){
        BaseResponse<List<UserDTO>> baseResponse = userService.getAllUser();
        return new ResponseEntity<>(baseResponse, HttpStatus.valueOf(baseResponse.getCode()));
    }
    @GetMapping("/getId")
    public ResponseEntity<BaseResponse<UserDTO>> getByUserId(@RequestParam("id") Long userId){
        BaseResponse<UserDTO> baseResponse = userService.getUserById(userId);
        return new ResponseEntity<>(baseResponse, HttpStatus.valueOf(baseResponse.getCode()));
    }
    @PostMapping("/add")
    public ResponseEntity<BaseResponse<UserDTO>> addUser(@Valid @RequestBody UserDTO userDTO){
        BaseResponse<UserDTO> baseResponse = userService.addUser(userDTO);
        return new ResponseEntity<>(baseResponse, HttpStatus.valueOf(baseResponse.getCode()));
    }
    @PutMapping("/update")
    public ResponseEntity<BaseResponse<UserDTO>> updateUser(
            @Valid @RequestBody UserDTO userDTO,
            @RequestParam("id") Long userId
    ){
        BaseResponse<UserDTO> baseResponse = userService.updateUser(userDTO, userId);
        return new ResponseEntity<>(baseResponse, HttpStatus.valueOf(baseResponse.getCode()));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<BaseResponse<UserDTO>> deleteUser(@RequestParam("id") Long userId){
        BaseResponse<UserDTO> baseResponse = userService.deleteUser(userId);
        return new ResponseEntity<>(baseResponse, HttpStatus.valueOf(baseResponse.getCode()));
    }
}
