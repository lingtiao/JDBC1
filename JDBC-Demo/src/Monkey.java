public class Monkey {
    String name;
    String feature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
    public Monkey(String name, String feature) {
        this.name = name;
        this.feature = feature;
    }
    public Monkey() {
    setName("长尾猴");
    setFeature("尾巴长");
    }

    class test{
        public  void main(String[] args) {
            Monkey monkey = new Monkey();
            monkey.setName("白头叶猴");
            monkey.setFeature("头上有白毛，喜欢吃树叶");
            System.out.println(monkey.getName());
            System.out.println(monkey.getFeature());
        }

    }
}
