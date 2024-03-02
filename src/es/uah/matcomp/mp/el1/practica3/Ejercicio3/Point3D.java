package es.uah.matcomp.mp.el1.practica3.Ejercicio3;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){
        super();
        this.z=z;
    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] result=new float[3];
        result[0]=super.getX();
        result[1]=super.getY();
        result[2]=getZ();
        return result;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        setZ(z);
    }

}
