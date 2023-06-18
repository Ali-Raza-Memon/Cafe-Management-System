package com.cafe.system.restImpl;

import com.cafe.system.rest.UserRest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {


    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        return null;
    }



}
