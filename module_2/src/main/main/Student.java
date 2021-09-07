package main.main;

public class Student {
    public String name;
    public String code;
    public int birthday;
    // SETTER
    public void setName(String vname){
        this.name = vname ;
    }
    public void setCode(String vcode){
        this.code = vcode ;
    }
    public void setBirthday(int vbirthday){
        this.birthday = vbirthday ;
    }
    //GETTER
    public String getName(){
        return this.name;
    }
    public String getCode(){
        return this.code;
    }
    public int getBirthday(){
        return this.birthday;
    }

}
