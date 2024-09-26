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
            return "LoggerMessage{" + "\n\r" +
                    "className=" + className + "\n\r" +
                    "methodName=" + methodName + "\n\r"  +
                    "methodArgs=" + methodArgs + "\n\r"  +
                    "timeTaken=" + timeTaken + "\n\r"  +
                    "result=" + new ObjectMapper().writeValueAsString(this.result) +
                    '}';
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
