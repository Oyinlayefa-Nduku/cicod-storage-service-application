package com.project.cicodstorageservice.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

// This contains the bucket name of the storage service
public enum BucketName {
    TODO_IMAGE("cicod-storage-service");
    private final String bucketName;
}
