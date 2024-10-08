package glimmertask5;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class Person {
	private String name;
    private int age;
    private int sex;
//    private static int count=0;//静态变量，记录Person对象的数量
    
    private static final ArrayList<WeakReference<Person>> references = new ArrayList<>(); //用容器来存储对象的WeakReference
    
    public Person() {
    	//count++;//每次创建Person类对象时，计数器加一
    	references.add(new WeakReference<Person>(this));
    }
    
    //清除被销毁的对象
    private static void clean() {
    	references.removeIf(ref -> ref.get() == null);//遍历容器检查是否存在已被回收对象，如存在那么该对象被移除容器
    }
    

    public static int getCount() {
    	clean();
    	return references.size();
    }//返回references的大小
    
    
    
    private void eat() {
    	System.out.println(name+"正在吃东西");
    }

    private void sleep() {
    
    }

    private void dadoudou() {
    	
    }
    public void setPerson(String name,int age,int sex) {
    	this.name = name;
    	this.age = age;
    	this.sex = sex;
    }
 
}
