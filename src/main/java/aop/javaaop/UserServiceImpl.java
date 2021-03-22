package aop.javaaop;

public class UserServiceImpl implements  UserService {
    @Override
    public void save() {
        ThreadLocal<String> t=new ThreadLocal<>();
        t.set("");
        //Thread-->ThreadLocalMap<ThreadLocal,value>
        //             new Entry[INITIAL_CAPACITY]
        //                    Entry(ThreadLocal<?> k, Object v) extends weakreference
       //                         Entry(ThreadLocal<?> k, Object v) {
        //                              super(k);//弱引用
        //                              value = v;}
        // 只具有弱引用的对象拥有更短暂的生命周期。 在垃圾回收器线程扫描它所管辖的内存区域的过程中，
        // 一旦发现了只具有弱引用的对象，不管当前内存空间足够与否，都会回收它的内存。不过，由于垃圾回收器是一个优先级很低的线程，
        //  因此不一定会很快发现那些只具有弱引用的对象
         System.out.println("save method");
    }

    @Override
    public void delete() {
        System.out.println("delete method");
    }
}
