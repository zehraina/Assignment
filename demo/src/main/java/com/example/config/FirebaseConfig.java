package com.example.config;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
// import com.google.firebase.FirebaseOptions.Builder.Builder();

@Service
public class FirebaseConfig {
    public void configureFIrebaseConnectiona() throws IOException {
    FileInputStream serviceAccount =
    new FileInputStream("classpath:config/assignment-e8727-firebase-adminsdk-s3kjm-a86a8b7582.json");

FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
  .build();

FirebaseApp.initializeApp(options);

   }
}
