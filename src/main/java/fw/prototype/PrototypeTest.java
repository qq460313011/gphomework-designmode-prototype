package fw.prototype;

import java.io.IOException;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 15:33
 * @Description:
 */
public class PrototypeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        PersonPrototype prototype=new PersonPrototype();
        prototype.DeepClone();

    }
}
