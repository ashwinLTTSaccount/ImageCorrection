package com.example.ImageCorrection.ImageCorrection.controller;

import com.example.ImageCorrection.ImageCorrection.models.TaskData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageCorrectionController {
    @PostMapping("/imageCorrection")
    public ResponseEntity<?> imageCorrection(@RequestBody TaskData taskData){
        try {
            Thread.sleep(1000);
            return new ResponseEntity<>(taskData, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
