class objectPassDemo<objectPass>{
    int a,b;
    objectPassDemo(int a,int b){
        this.a=a;
        this.b=b;
    }
    boolean equalTo(objectPass o){
        return(o.a==a && o.b==b);
    }
}
public class ObjectsReference {
    public static void main(Sting[] args)
    {
        objectPass ob1=new objectPass(100,22);
        objectPass ob2=new objectPass(100,22);
        objectPass ob3=new objectPass(-1,-1);
        System.out.println("ob1==ob2: "+ob2.equalTo(ob2));
        System.out.println("ob2==ob3: "+ob2.equalTo(ob3));
    }
    
}
