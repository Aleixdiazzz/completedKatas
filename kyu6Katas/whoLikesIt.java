class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
      String toReturn = "";
      if (names.length == 0){
        return "no one likes this";
      }
      if (names.length == 2){
        return (names[0] + " and " + names[1] + " like this");
      }
      if (names.length == 3){
        return (names[0] + ", " + names[1] +  " and " + names[2] + " like this");
      }
      if (names.length > 3){
        return (names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this");
      }
      return (names[0] + " likes this");
    }
}
