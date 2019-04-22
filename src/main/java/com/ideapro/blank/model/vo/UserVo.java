package com.ideapro.blank.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value="漫画用户")
public class UserVo implements Serializable{

    @ApiModelProperty(value="id" ,required=true)
    private Integer id;
    @ApiModelProperty(value="电话号码" ,required=true)
    private String mobilePhoneNumber;
    @ApiModelProperty(value="密码" ,required=true)
    private String password;
    @ApiModelProperty(value="邮箱" ,required=true)
    private String email;
    @ApiModelProperty(value="创建时间" ,required=true)
    private LocalDateTime createTime;
    @ApiModelProperty(value="更新时间" ,required=true)
    private LocalDateTime updateTime;

    @ApiModelProperty(value="姓名" ,required=true)
    private String name;
    @ApiModelProperty(value="座右铭" ,required=true)
    private String motto;
    @ApiModelProperty(value="简介" ,required=true)
    private String profile;
    @ApiModelProperty(value="职业" ,required=true)
    private String profession;
    @ApiModelProperty(value="所在地" ,required=true)
    private String location;
    @ApiModelProperty(value="性别" ,required=true)
    private String gender;
    @ApiModelProperty(value="生日" ,required=true)
    private String birthday;
    @ApiModelProperty(value="年龄" ,required=true)
    private Integer age;
    @ApiModelProperty(value="关注作家数" ,required=true)
    private Integer followTotal;
    @ApiModelProperty(value="粉丝数" ,required=true)
    private Integer followerTotal;
    @ApiModelProperty(value="收藏漫画册数" ,required=true)
    private Integer favoriteTotal;
    @ApiModelProperty(value="漫画册数量" ,required=true)
    private Integer bookTotal;
    @ApiModelProperty(value="头像" ,required=true)
    private String avatarUrl;
    @ApiModelProperty(value="个人肖像" ,required=true)
    private String portraitUrl;

    @ApiModelProperty(value = "是否授权", required=true)
    private Boolean authorize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFollowTotal() {
        return followTotal;
    }

    public void setFollowTotal(Integer followTotal) {
        this.followTotal = followTotal;
    }

    public Integer getFollowerTotal() {
        return followerTotal;
    }

    public void setFollowerTotal(Integer followerTotal) {
        this.followerTotal = followerTotal;
    }

    public Integer getFavoriteTotal() {
        return favoriteTotal;
    }

    public void setFavoriteTotal(Integer favoriteTotal) {
        this.favoriteTotal = favoriteTotal;
    }

    public Integer getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(Integer bookTotal) {
        this.bookTotal = bookTotal;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public Boolean getAuthorize() {
        return authorize;
    }

    public void setAuthorize(Boolean authorize) {
        this.authorize = authorize;
    }

}
