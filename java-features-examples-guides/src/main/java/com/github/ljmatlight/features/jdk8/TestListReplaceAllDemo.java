package com.github.ljmatlight.features.jdk8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 * <br /> Author： ljmatlight
 */
public class TestListReplaceAllDemo {

    public void test() {

        List<MyBean> list = new ArrayList<MyBean>() {
            {
                add(new MyBean("第一个元素", 130));
                add(new MyBean("第二个元素", 130));
            }
        };

        if (null != list && list.size() > 0) {
            list.replaceAll(myBean -> {
                if (myBean.getStatus() == 130) {
                        myBean = this.comfirePayingOrder(myBean);
                }
                return myBean;
            });
        }

        System.out.println("List<MyBean>: == " + new ObjectAnalyzer().toString(list));

    }

    private MyBean comfirePayingOrder(MyBean myBean) {
        myBean.setStatus(150);
        return myBean;
    }

    class MyBean {
        String name;
        Integer status;

        public MyBean(String name, Integer status) {
            this.name = name;
            this.status = status;
        }

        public MyBean() {

        }

//        @Override
//        public String toString() {
//            return "MyBean{" + "name='" + name + '\'' + ", status=" + status + '}';
//        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MyBean)) return false;

            MyBean myBean = (MyBean) o;

            if (getName() != null ? !getName().equals(myBean.getName()) : myBean.getName() != null) return false;
            return getStatus() != null ? getStatus().equals(myBean.getStatus()) : myBean.getStatus() == null;
        }

        @Override
        public int hashCode() {
            int result = getName() != null ? getName().hashCode() : 0;
            result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
            return result;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

    }

    /**
     * toString 工具类
     */
    class ObjectAnalyzer{
        /**
         * 标记是否被访问过
         */
        private ArrayList<Object> visited = new ArrayList<>();


        public String toString(Object object){
            // 如果为null，就返回一个null字符串
            if(object==null){
                return "null";
            }
            // 记录该对象是否被访问过
            if(visited.contains(object)){
                return "...";
            }
            // 标记该对象被访问
            visited.add(object);
            // 获取class实例
            Class cl = object.getClass();
            // 如果是String的类直接返回string
            if(cl == String.class){
                return (String) object;
            }
            // 如果是一个数组类型
            if(cl.isArray()){
                // 获取该数组的数据类型->开始数组
                String r = cl.getComponentType()+"[]{";
                // 遍历该数组
                for(int i = 0;i<Array.getLength(object);i++){
                    // 如果不是第一个需要输入,(方便查看)
                    if(i>0){
                        r+=",";
                    }
                    // 获取当前数组的对象
                    Object val = Array.get(object, i);
                    // 判断是否为基本类型，如果不是基本类型还要继续遍历(递归)
                    if(cl.getComponentType().isPrimitive()){
                        // 如果是基本类型就添加到字符串
                        r+=val;
                    }else{
                        // 递归（使用+=继续拼接字符串）
                        r+=toString(val);
                    }
                }
                //->闭合数组字符串
                return r+"}";
            }
            // 如果不是数组
            // 获取类的名称
            String r = cl.getName();
            do{
                // 开始拼接字符串
                r+="[";
                // 获取所有的实力域
                Field[] fields = cl.getDeclaredFields();
                // 设置所有的于可以访问(由于有的类中的属性字段为private的类型)
                AccessibleObject.setAccessible(fields, true);
                // 遍历该field
                for(Field f:fields){
                    // 判断如果是非静态的属性
                    if(!Modifier.isStatic(f.getModifiers())){
                        // 如果不是第一个[,使用,号隔开，目的是方便查看
                        if(!r.endsWith("[")){
                            r+=",";
                        }
                        // 获取名称，并拼接字符串
                        r+= f.getName()+"=";
                        try {
                            // 获取属性的数据类型
                            Class t = f.getType();
                            // 获取该属性的数据值
                            Object val = f.get(object);
                            // 判断是否为基本类型,如果是拼接字符，如果不是，就再次递归（同上）
                            if(t.isPrimitive()){
                                r+=val;
                            }else{
                                r+=toString(val);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                // 结束标记
                r+="]";
                // 获取到超类,一直向上遍历
                cl = cl.getSuperclass();
            }while(cl!=null);
            // 返回最终的字符串
            return r;
        }
    }


}
