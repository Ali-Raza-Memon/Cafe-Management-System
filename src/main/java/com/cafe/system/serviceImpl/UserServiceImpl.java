package com.cafe.system.serviceImpl;

import com.cafe.system.constants.CafeConstants;
import com.cafe.system.service.UserService;
import com.cafe.system.utils.CafeUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.bridge.MessageUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

import static org.hibernate.id.enhanced.StandardOptimizerDescriptor.log;

@Slf4j
@Service
public class UserServiceImpl implements UserService {



    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {

        MessageUtil log;
        log.info("Inside signup {}",requestMap);

        if(validateSignUpMap(requestMap)){

        }else {
            return CafeUtils.getResponseEntity(CafeConstants.INVALID_DATA, HttpStatus.BAD_REQUEST);
        }
    }

    private boolean validateSignUpMap(Map<String,String> requestMap){
       if (requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
                && requestMap.containsKey("email") && requestMap.containsKey("password")){
           return true;
       }
       return false;
    }

}
