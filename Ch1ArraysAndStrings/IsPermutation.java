import java.util.HashMap;


class IsPermutation{

  public static boolean isPermutation(String str1, String str2){

    HashMap<Character, Integer> map1 = getFrequency(str1);
    HashMap<Character, Integer> map2 = getFrequency(str2);

    return  map1.equals(map2);


  }

  public static HashMap<Character, Integer> getFrequency(String str){

      HashMap<Character, Integer> map = new HashMap<>();

      for(char c : str.toCharArray()){

        int val;

          if (map.get(c) == null){
              map.put(c,1);
          }
          else{
              val = map.get(c);
              map.put(c, val + 1);
          }

      }

      return map;

  }


  public static  void main(String args[]){


    System.out.println( isPermutation("abcda", "dcba") );


  }

}
