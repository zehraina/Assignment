package com.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

import org.springframework.util.ResourceUtils;
import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
// import co~m.google.firebase.FirebaseOptions.Builder.Builder();

import jakarta.annotation.PostConstruct;

@Service
public class FirebaseConfig {
  @PostConstruct
    public void configureFIrebaseConnectiona() throws IOException {
      File file = ResourceUtils.getFile("classpath:config/assignment-e8727-firebase-adminsdk-s3kjm-a86a8b7582.json");
      FileInputStream serviceAccount = new FileInputStream(file);

FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
  .build();

FirebaseApp.initializeApp(options);

   }
}
