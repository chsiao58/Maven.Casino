public class Person {
    private Double wallet;
    private String name;
    private Integer age;

    public Person(Double wallet, String name, Integer age) {
        this.wallet = wallet;
        this.name = name;
        this.age = age;
    }
    public Person() {
        this.wallet = 0.0;
        this.name = "Will";
        this.age = 27;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
