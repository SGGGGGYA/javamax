package 异常;
//*自定义的编译时异常*1、继承Exception做爸爸。*2、重写Exception的构造器。
//哪里要用这个异常，哪里就返回这个异常对象。
 public class idhema extends  Exception{
     public idhema(String message){
         super(message);
     }
     public idhema(){
         super();
     }
}
