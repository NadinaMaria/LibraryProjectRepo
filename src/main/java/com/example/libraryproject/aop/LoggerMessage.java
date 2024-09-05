package com.example.libraryproject.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoggerMessage {

    private String className;
    private String methodName;
    private String methodArgs;
    private Long timeTaken;
    private Object result;

    @Override
    public String toString() {
        try {
            return "LoggerMessage{" +
                    "className='" + className + '\'' +
                    ", methodName='" + methodName + '\'' +
                    ", methodArgs='" + methodArgs + '\'' +
                    ", timeTaken=" + timeTaken +
                    ", result=" + new ObjectMapper().writeValueAsString(this.result) +
                    '}';
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
