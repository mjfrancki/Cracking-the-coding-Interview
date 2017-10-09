import java.util.HashMap;

public class IsUnique{


public static boolean isUnique(String input){

  if (input == null) return true;

HashMap<Character, Integer> map = new HashMap<Character, Integer>();

  for(char c : input.toCharArray()){

    int val;

      if (map.get(c) == null){
          map.put(c,1);
      }
      else{
          val = map.get(c);
          map.put(c, val + 1);
      }

  }

  for(Integer i : map.values() ){

      if(i >1) return false;

  }

  return true;
}




public static void main(String args[]){
String s = "";
try{
   s = args[0];
}
catch(Exception e){

  System.out.println("Bad input");

}

  System.out.println("you entered: " + s );

  if( isUnique(s) ) System.out.println("it is unique" );
  else System.out.println("it is NOT unique" );

}


}
