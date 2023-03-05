package com.cbeyond.cbeyondservice.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    @ApiModelProperty(value = "Unique id for department", required = true, example = "1")
    private int id;
    private String fullName;
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNumber;
    private String emailId;
    private String schoolName;
    private String dateOfBirth;
    private String classCode;
    private String password;
    private int countrycode;
    private Date createdAt;




}
