public class Vector  {

    private double x;
    private double y;
    private double z;

    Vector () {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        System.out.println("(0;0;0) vector created.");
    }

    Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Vector ("+x+";"+y+";"+z+") vector created.");
    }

    public double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double skalar(Vector v){
        return x*v.x+y*v.y+z*v.z;
    }

    public Vector cross(Vector v) {
        return new Vector(
                this.y*v.z-this.z*v.y,
                this.z*v.x-this.x-v.z,
                this.x*v.y-this.y*v.x);
    }


    public double getangle(Vector b) {
        return this.skalar(b)/(this.length()*b.length());
    }

    public Vector add(Vector b) {
        return new Vector(
                x + b.x,
                y + b.y,
                z + b.z);
    }

   public Vector subtract(Vector b) {
        return new Vector(
                x-b.x,
                y-b.y,
                z-b.z);
    }
    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for ( int i = 0; i < n; i++)
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        return vectors;
    }
}
