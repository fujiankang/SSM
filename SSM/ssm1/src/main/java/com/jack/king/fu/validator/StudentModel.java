package com.jack.king.fu.validator;


import javax.validation.constraints.*;

public class StudentModel {
    @NotNull(message="姓名不能为空")
    @Size(min=3,max=6,message="姓名长度应该在{min}-{max}个字符")
    private String name;
    @Min(value = 0,message = "成绩不能小于{value}")
    @Max(value = 100,message="成绩不能大于{value}")
    private Double score;
    @NotNull(message="手机号不能为空")
    @Pattern(regexp = "^1[34578]\\d{9}$",message = "手机号格式不正确")
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
