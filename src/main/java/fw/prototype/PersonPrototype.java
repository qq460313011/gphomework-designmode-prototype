package fw.prototype;

import java.io.*;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 15:05
 * @Description:
 */
public class PersonPrototype implements Cloneable,Serializable {

    private String name;
    private int age;
    private String sex;
    private String birthday;

    public void setPersonInfo(String name, int age, String sex, String birthday) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    //浅克隆
    public Object clone(){
        PersonPrototype clone=null;
        try {
            clone= (PersonPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    //深克隆
    public void DeepClone() throws IOException, ClassNotFoundException {
        PersonPrototype clone=new PersonPrototype();
        //1.将s1对象序列化为一个数组
        //通过ObjectOutputStream将对象clone读给ByteArrayOutputStream流
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(clone);
        //ByteArrayOutputStream转给byte数组
        byte[] bytes=bos.toByteArray();

        //2.将字节数组中的对象反序列化成一个PersonPrototype对象
        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=new ObjectInputStream(bis);
        PersonPrototype clone1= (PersonPrototype) ois.readObject();

        System.out.println(clone);
        System.out.println(clone1);
    }

}
