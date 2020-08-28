import java.util.Random;

public class Coin {
    private Random rand;
    private  Face face;




    public Coin(Face face)
    {
        rand = new Random();
        setFace(face);
    }



    public final Face getFace()
    {
        return  face;
    }

    public final void  setFace(Face face)
    {
        this.face = face == null ? Face.HEAD : face;
    }
    boolean isHead()
    {
        return (face == Face.HEAD);
    }


    public void flip()
    {

        int result= 0;

        result = rand.nextInt(2);

        if (result == 0)
        {
            System.out.println("You flip Head");
             face = Face.HEAD;
        }
        else
        {
            System.out.println("You flip tail");
            face = Face.TAIL;
        }
    }



    public String toString()
    {
        return face.toString();
    }

}
