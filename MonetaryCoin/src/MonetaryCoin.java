public class MonetaryCoin extends Coin {
  private int value;



    public MonetaryCoin(Face face,int value)
  {
     super(face);
      setValue(value);
  }

    public int getValue() {
        return value;
    }


    public void setValue(int value) {
      if(value ==1 || value == 2 || value == 5 || value == 10 || value ==20 || value == 50 || value ==100 || value == 200)
      {
          this.value = value;

      }
      this.value = 1;


    }

    public String toString()
    {
        return  String.format("%s, Value: %d ", super.toString(),value);
    }



}
