public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private String nickName;

    @Override
    public String toString() {
        return   
                "name: " + name + "\n" +
                " age: " + age + "\n"+
                " gender: " + gender + "\n" +
                " nickName: " + nickName + "\n" ;
    }

    public Animal(String name, int age, String gender, String nickName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
