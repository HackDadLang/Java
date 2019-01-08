interface Pet{
    String getName();
    int getAge();
}
class PetShop{
    private Link pets = new Link();
    public void add(Pet pet){
        this.pets.add(pet);
    }
    public void delete(Pet pet){
        this.pets.remove(pet);
    }
    public Link search(String keyWord){
        Link result = new Link();
        Object obj[] = this.pets.toArray();
        for (int i = 0; i < obj.length; i++) {
            Pet p = (Pet)obj[i];
            if (p.getName().contains(keyWord)){
                result.add(p);
            }
        }
        return result;
    }
}
class Cat implements Pet{
    private String name;
    private int age;
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat c = (Cat)obj;
        if (this.name.equals(c.name) && this.age == c.age){
            return true;
        }
        return false;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        return"猫的名字:"+this.name+",年龄:"+this.age;
    }
}
class Dog implements Pet{
    private String name;
    private int age;
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Dog)){
            return false;
        }
        Dog c = (Dog)obj;
        if (this.name.equals(c.name) && this.age == c.age){
            return true;
        }
        return false;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        return "狗的名字:"+this.name+",够的年龄:"+this.age;
    }
}
public class PetDemo {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        shop.add(new Cat("aaa",2));
        shop.add(new Dog("bbb",3));
        shop.add(new Dog("abc",3));
        Link all = shop.search("b");
        Object obj[] = all.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
