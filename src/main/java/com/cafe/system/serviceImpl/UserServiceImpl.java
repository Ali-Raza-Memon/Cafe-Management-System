package com.cafe.system.serviceImpl;

import com.cafe.system.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {



    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {


    }

    private boolean validateSignUpMap(Map<String,String> requestMap){
       if (requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
                && requestMap.containsKey("email") && requestMap.containsKey("password")){
           return true;
       }
       return false;
    }


}
