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
