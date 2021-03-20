package annotation;


import static annotation.Person.P1;

@MyAnno(value = 12, per = P1, anno2 = @MyAnno2, strs = "bbb")
@MyAnno3
public class Worker {
    @MyAnno3
    public String name = "aaa";

    @MyAnno3
    public void show() {


    }
}
