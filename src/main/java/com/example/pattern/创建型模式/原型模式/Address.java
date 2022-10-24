package com.example.pattern.创建型模式.原型模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liwen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
    private String country;
    private String province;
    private String area;
    private String street;
}
