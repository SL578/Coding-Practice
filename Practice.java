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
