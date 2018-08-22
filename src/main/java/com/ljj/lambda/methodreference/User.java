/**
 * 文件名称:          		User.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.methodreference;

/**
 * 
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-22 10:58
 * 
 */
public class User {
    
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private int sex;
    /**
     * 年龄
     */
    private int age;
    
    public User(String name, int sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }
    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return Returns the sex.
     */
    public int getSex() {
        return sex;
    }
    /**
     * @param sex The sex to set.
     */
    public void setSex(int sex) {
        this.sex = sex;
    }
    /**
     * @return Returns the age.
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }
    

    /** 
     *(non-Javadoc)
     * @see java.lang.Object#toString()
     * 
     */
    @ Override
    public String toString() {
        return "User [name=" + name + ", sex=" + sex + ", age=" + age + "]";
    }

}
