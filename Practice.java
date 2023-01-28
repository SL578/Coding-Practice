// 12052022

public int close10(int a, int b) {
  if (Math.abs(a - 10) < Math.abs(b - 10)){
    return a;
  }
  if (Math.abs(a - 10) > Math.abs(b - 10)){
    return b;
  }
  else{
    return 0;
  }
}

public boolean in3050(int a, int b) {
  if ((30 <= a && a <= 40) && (30 <= b && b <= 40) || (40 <= a && a <= 50) &&
    (40 <= b && b <= 50)){
    return true;
  }
  else{
    return false;
  }
}

public int max1020(int a, int b) {
  if (10 <= a && a <= 20 && 10 <= b && b <= 20){
    if (a > b){
      return a;
    }
    else{
      return b;
    }
  }
  if (10 <= a && a <= 20){
    return a;
  }
  if (10 <= b && b <= 20){
    return b;
  }
  else{
    return 0;
  }
}

// 12062022

public boolean stringE(String str) {
  int countE = 0;
  
  for (int n = 0; n < str.length(); n++){
    if (str.substring(n, n + 1).equals("e")){
      countE += 1;
    }
  }
  
  if (1 <= countE && countE <= 3){
    return true;
  }
  else{
    return false;
  }
}

public boolean lastDigit(int a, int b) {
  String strA = String.valueOf(a);
  String strB = String.valueOf(b);

  if (strA.substring(strA.length() - 1).equals(strB.substring(strB.length() - 1))){
    return true;
  }
  else{
    return false;
  }
}

public String endUp(String str) {
  if (str.length() < 4){
    return str.toUpperCase();
  }
  else{
    return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
  }
}

public String everyNth(String str, int n) {
  String returnStr = "";
  
  for (int i = 0; i < str.length(); i++){
    if (i % n == 0){
      returnStr += str.substring(i, i + 1);
    }
  }
  
  return returnStr;
}

// 12072022

public String stringTimes(String str, int n) {
  String returnStr = "";
  
  for (int i = 0; i < n; i++){
    returnStr += str;
  }
  return returnStr;
}

public String frontTimes(String str, int n) {
  String returnStr = "";
  
  if (str.length() > 2){
    for (int i = 0; i < n; i++){
      returnStr += str.substring(0, 3);
    }
  }
  else{
    for (int i = 0; i < n; i++){
      returnStr += str;
    }
  }
  return returnStr;
}

int countXX(String str) {
  int countXx = 0;
  
  for (int i = 0; i < str.length() - 1; i++){
    if (str.substring(i, i + 2).equals("xx")){
      countXx += 1;
    }
  }
  return countXx;
}

// 12092022

boolean doubleX(String str) {
  if (str.length() < 2){
    return false;
  }
  for (int i = 0; i < str.length() - 1; i++){
    if (str.substring(i, i + 2).equals("xx")){
      return true;
    }
    if (str.substring(i, i + 1).equals("x")){
      return false;
    }
    continue;
  }
  return false;
}

public String stringBits(String str) {
  String returnStr = "";
  for (int i = 0; i < str.length(); i++){
    if (i % 2 == 0){
      returnStr += str.substring(i, i + 1);
    }
    continue;
  }
  return returnStr;
}

public String stringSplosion(String str) {
  String returnStr = "";
  for (int i = 1; i <= str.length(); i++){
    returnStr += str.substring(0, i);
  }
  return returnStr;
}

// 12102022

public int last2(String str) {
  int count = 0;
  for (int i = 0; i < str.length() - 2; i++){
    if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))){
      count += 1;
    }
  }
  return count;
}

public int arrayCount9(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 9){
      count += 1;
    }
  }
  return count;
}

public boolean arrayFront9(int[] nums) {
  if (nums.length < 4){
    for (int i = 0; i < nums.length; i++){
      if (nums[i] == 9){
        return true;
      }
    }
  }
  else{
    for (int i = 0; i < 4; i++){
      if (nums[i] == 9){
        return true;
      }
    }
  }
  return false;
}

// 12112022

public boolean array123(int[] nums) {
  for (int i = 0; i < nums.length - 2; i++){
    if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
      return true;
    }
  }
  return false;
}

public int stringMatch(String a, String b) {
  int count = 0;
  if (a.length() > b.length()){
    for (int i = 0; i < b.length() - 1; i++){
      if (a.substring(i, i + 2).equals(b.substring(i, i + 2))){
        count += 1;
      }
    }
  }
  else{
    for (int i = 0; i < a.length() - 1; i++){
      if (a.substring(i, i + 2).equals(b.substring(i, i + 2))){
        count += 1;
      }
    }
  }
  return count;
}

public String stringX(String str) {
  String rtrStr = "";
  for (int i = 0; i < str.length(); i++){
    if ((i == 0 || i == str.length() - 1) && str.substring(i, i + 1).equals("x")){
      rtrStr += "x";
    }
    if (!str.substring(i, i + 1).equals("x")){
      rtrStr += str.substring(i, i + 1);
    }
  }
  return rtrStr + "";
}

//12152022

public String altPairs(String str) {
  String rtrStr = "";
  for (int i = 0; i < str.length(); i += 4){
    rtrStr += str.substring(i, i + 1);
    if (i + 1 < str.length()){
      rtrStr += str.substring(i + 1, i + 2);
    }
  }
  return rtrStr;
}

public String stringYak(String str) {
  String rtrStr = "";
  int contCount = 0;
  for (int i = 0; i < str.length(); i++){
    if (contCount > 0){
      contCount -= 1;
      continue;
    }
    if (i + 2 < str.length() && str.substring(i, i + 1).equals("y") && str.substring(i + 2, i + 3).equals("k")){
      contCount = 2;
      continue;
    }
    else{
      contCount -= 1;
      rtrStr += str.substring(i, i + 1);
    }
  }
  return rtrStr;
}

public int array667(int[] nums) {
  int sixCount = 0;
  for (int i = 0; i < nums.length - 1; i++){
    if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)){
      sixCount += 1;
    }
  }
  return sixCount;
}

//12222022

public boolean noTriples(int[] nums) {
  for (int i = 0; i < nums.length - 2; i++){
    if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]){
      return false;
    }
  }
  return true;
}

public boolean has271(int[] nums) {
  for (int i = 0; i < nums.length - 2; i++){
    if (nums[i + 1] == nums[i] + 5 && nums[i + 2] > nums[i] - 4 && nums[i + 2] < nums[i] + 2){
      return true;
    }
  }
  return false;
}

// 12232022

public String helloName(String name) {
  return "Hello " + name + "!";
}

public String makeAbba(String a, String b) {
  return a + b + b + a;
}

public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

// 12242022

public String makeOutWord(String out, String word) {
  return out.substring(0, 2) + word + out.substring(2);
}

public String extraEnd(String str) {
  return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
}

public String firstTwo(String str) {
  if (str.length() > 1){
    return str.substring(0, 2);
  }
  else{
    return str;
  }
}

// 12252022

public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}

public String withoutEnd(String str) {
  if (str.length() > 2){
    return str.substring(1, str.length() - 1);
  }
  else{
    return "";
  }
}

public String comboString(String a, String b) {
  if (a.length() > b.length()){
    return b + a + b;
  }
  else{
    return a + b + a;
  }
}

// 12262022

public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}

public String left2(String str) {
  return str.substring(2) + str.substring(0, 2);
}

public String right2(String str) {
  return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
}

// 12292022

public String theEnd(String str, boolean front) {
  if (front == true){
    return str.substring(0, 1);
  }
  else{
    return str.substring(str.length() - 1, str.length());
  }
}

public String withouEnd2(String str) {
  if (str.length() > 2){
    return str.substring(1, str.length() - 1);
  }
  else{
    return "";
  }
}

public String middleTwo(String str) {
  return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
}

// 12302022

public boolean endsLy(String str) {
  if (str.length() > 1 && str.substring(str.length() - 2).equals("ly")){
    return true;
  }
  else{
    return false;
  }
}

public String nTwice(String str, int n) {
  return str.substring(0, n) + str.substring(str.length()  - n);
}

public String twoChar(String str, int index) {
  if (str.length() < index + 2 || index < 0){
    return str.substring(0, 2);
  }
  else{
    return str.substring(index, index + 2);
  }
}

// 12312022

public String middleThree(String str) {
  return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
}

public boolean hasBad(String str) {
  if ((str.length() > 2 && (str.substring(0, 3).equals("bad")) || (str.length() > 3 && str.substring(1, 4).equals("bad")))){
    return true;
  }
  else{
    return false;
  }
}

public String atFirst(String str) {
  if (str.length() > 1){
    return str.substring(0, 2);
  }
  if (str.length() == 0){
    return "@@";
  }
  else{
    return str + "@";
  }
}

// 01012023

public String lastChars(String a, String b) {
  if (a.length() > 0 && b.length() > 0){
    return a.substring(0, 1) + b.substring(b.length() - 1);
  }
  if (a.length() > 0 && b.length() < 1){
    return a.substring(0, 1) + "@";
  }
  if (a.length() < 1 && b.length() > 0){
    return "@" + b.substring(b.length() - 1);
  }
  else{
    return "@@";
  }
}

public String conCat(String a, String b) {
  if (a.length() > 0 && b.length() > 0 && a.substring(a.length() - 1).equals
    (b.substring(0, 1))){
    return a.substring(0, a.length()) + b.substring(1);
  }
  else{
    return a + b;
  }
}

public String lastTwo(String str) {
  if (str.length() > 1){
    return str.substring(0, str.length() - 2) + str.substring(str.length() - 1)
     + str.substring(str.length() - 2, str.length() - 1);
  }
  else{
    return str;
  }
}

// 01022023

public String seeColor(String str) {
  if (str.length() > 2 && str.substring(0, 3).equals("red")){
    return "red";
  }
  if (str.length() > 3 && str.substring(0, 4).equals("blue")){
    return "blue";
  }
  else{
    return "";
  }
}

public boolean frontAgain(String str) {
  if (str.length() > 1  && str.substring(0, 2).equals(str.substring(str.length() - 2))){
    return true;
  }
  else{
    return false;
  }
}

public String minCat(String a, String b) {
  if (a.length() == b.length()){
    return a + b;
  }
  if (a.length() > b.length()){
    return a.substring(a.length() - b.length()) + b;
  }
  else{
    return a + b.substring(b.length() - a.length());
  }
}

// 01032023

public String extraFront(String str) {
  if (str.length() > 1){
    return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
  }
  else{
    return str + str + str;
  }
}

public String without2(String str) {
  if (str.length() > 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))){
    return str.substring(2);
  }
  if (str.length() == 2){
    return "";
  }
  else{
    return str;
  }
}

public String deFront(String str) {    
  if (str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")){
    return str;
  }
  if (str.substring(1, 2).equals("b") && !str.substring(0, 1).equals("a")){
    return str.substring(1);
  }
  if (!str.substring(0, 1).equals("a") && !str.substring(1, 2).equals("b")){
    return str.substring(2);
  }
  else{
    return str.substring(0, 1) + str.substring(2);
  }
}

// 01042023

public String startWord(String str, String word) {
   if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))){
     return str.substring(0, word.length());
   }
   else{
     return "";
   }
}

// 01062023

public String withoutX(String str) {
  if (str.length() > 1 && (str.substring(0, 1).equals("x") && str.substring(str.length() - 1).equals("x"))){
    return str.substring(1, str.length() - 1);
  }
  if (str.length() > 1 && str.substring(0, 1).equals("x")){
    return str.substring(1);
  }
  if (str.length() > 1 && str.substring(str.length() - 1).equals("x")){
    return str.substring(0, str.length() - 1);
  }
  if (str.length() < 2){
    return "";
  }
  else{
    return str;
  }
}

// 01072023

public String withoutX2(String str) {
  // length == 0 exception
  if (str.length() < 1){
    return "";
  }
  // all "x"es
  if (str.length() > 1 && str.substring(0, 2).equals("xx")){
    return str.substring(2);
  }
  // only first is "x"
  if (str.substring(0, 1).equals("x")){
    return str.substring(1);
  }
  // only second is "x"
  if (str.length() > 1 && str.substring(1, 2).equals("x")){
    return str.substring(0, 1) + str.substring(2);
  }
  // no "x"es
  else{
    return str;
  }
}

// 01082023

public boolean firstLast6(int[] nums) {
  if (nums[0] == 6 || nums[nums.length - 1] == 6){
    return true;
  }
  else{
    return false;
  }
}

public boolean sameFirstLast(int[] nums) {
  if (nums.length > 0 && nums[0] == nums[nums.length - 1]){
    return true;
  }
  else{
    return false;
  }
}

public int[] makePi() {
  int[] makePi = new int[3];
  makePi[0] = 3;
  makePi[1] = 1;
  makePi[2] = 4;
  return makePi;
}

// 01092023

public boolean commonEnd(int[] a, int[] b) {
   if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]){
     return true;
   }
   else{
     return false;
   }
}

// 01112023

public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums;
}

// 01152023

public int[] rotateLeft3(int[] nums) {
  int[] newnums = new int[3];
  newnums[0] = nums[1]; newnums[1] = nums[2]; newnums[2] = nums[0];
  return newnums;
}

// 01192023

public int[] reverse3(int[] nums) {
  int[] returnnums = new int[3];
  returnnums[0] = nums[2]; returnnums[1] = nums[1]; returnnums[2] = nums[0];
  return returnnums;
}

// 01202023

public int[] maxEnd3(int[] nums) {
  int[] rtrnums = new int[3];
  if (nums[0] >= nums[2]){
    rtrnums[0] = nums[0]; rtrnums[1] = nums[0]; rtrnums[2] = nums[0];
  }
  else{
    rtrnums[0] = nums[2]; rtrnums[1] = nums[2]; rtrnums[2] = nums[2];
  }
  return rtrnums;
}

// 01232023

public int sum2(int[] nums) {
  if (nums.length > 1){
    return nums[0] + nums[1];
  }
  else if (nums.length > 0){
    return nums[0];
  }
  else{
    return 0;
  }
}

// 01272023

public int[] middleWay(int[] a, int[] b) {
  int[] rtrInt = new int[2];
  rtrInt[0] = a[1];
  rtrInt[1] = b[1];
  return rtrInt;
}
