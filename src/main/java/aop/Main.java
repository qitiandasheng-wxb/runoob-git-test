package aop;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

public class Main {
    public static void main(String[] args)  {


//        CurrentHashMap
        Bean1 bean1=new Bean1();
        bean1.setO(new Object());
        Bean1 bean2=new Bean1();
        System.out.println(bean1.getO());
        BeanUtils.copyProperties(bean1,bean2);
        System.out.println(bean2.getO());
    }
}
