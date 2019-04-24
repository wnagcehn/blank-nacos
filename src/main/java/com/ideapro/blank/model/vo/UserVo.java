package com.ideapro.blank.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value="漫画用户")
public class UserVo implements Serializable{

    @ApiModelProperty(value="id" ,required=false)
    private Integer id;
    @ApiModelProperty(value="用户名" ,required=false)
    private String username;
    @ApiModelProperty(value="密码" ,required=false)
    private String password;
    @ApiModelProperty(value="电话号码" ,required=false)
    private String telephone;
    @ApiModelProperty(value="邮箱" ,required=false)
    private String email;
    @ApiModelProperty(value="个性签名" ,required=false)
    private String sign;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
