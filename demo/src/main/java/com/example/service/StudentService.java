package com.example.service;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
// import com.google.cloud.firestore.v1.FirestoreClient;
import com.example.entity.*;
import com.google.firebase.cloud.FirestoreClient;
// import com.google.firestore.v1.Document;
 
@Service
public class StudentService {
    public void createStudent(Student student) {

        Firestore fireStore=FirestoreClient.getFirestore();
        DocumentReference docReference = fireStore.collection("student").document();
        student.setId(docReference.getId());
        ApiFuture<WriteResult> apiFuture=docReference.set(student);
        }
}
