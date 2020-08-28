import javax.swing.*;

public enum Face {
     HEAD("HEAD"),
     TAIL("TAIL");
private String faceValue;

private Face(String faceValue)
{
     this.faceValue = faceValue ==null ? "HEAD" : faceValue;

}

     public String toString()
     {
          return String.format("Face: %s", faceValue);
     }

}
