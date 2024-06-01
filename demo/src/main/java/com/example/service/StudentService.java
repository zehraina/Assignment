package com.example.service;
package com.example.beans;

import org.springframework.stereotype.Service;
import java.lang.InterruptedException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
// import com.google.cloud.firestore.v1.FirestoreClient;
import com.example.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.google.firebase.cloud.FirestoreClient;
// import com.google.firestore.v1.Document;
 
@Service
public class StudentService {
    @Autowired
    StudentCreateResponse studentCreateResponse;
    public StudentCreateResponse createStudent(Student student) throws InterruptedException{

        Firestore fireStore=FirestoreClient.getFirestore();
        DocumentReference docReference = fireStore.collection("student").document();
        student.setId(docReference.getId());
        ApiFuture<WriteResult> apiFuture = docReference.set(student);
        studentCreateResponse.setUpdatedTime(apiFuture.get().getUpdatedTime().toDate());
        studentCreateResponse.setId(student.getId());

        return customerCreateResponse;
        }
}
