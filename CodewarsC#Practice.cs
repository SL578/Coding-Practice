// 08122023 https://www.codewars.com/kata/55f73be6e12baaa5900000d4/train/csharp
public class Kata
{
  public static int GetGoals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals)
  {
    return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
  }
}

// 08122023 https://www.codewars.com/kata/56b1f01c247c01db92000076/train/csharp
public class Kata
{
  public static string DoubleChar(string s)
  {
    string returnString = "";
    foreach (char ch in s){
      returnString += ch.ToString() + ch.ToString();
    }
    return returnString;
  }
}

// 08132023 https://www.codewars.com/kata/56efc695740d30f963000557/train/csharp
// I don't actually know how this works. I just messed around and it started working.
using System;

namespace Extensions
{
  public static class StringExt
  {
    public static string ToAlternatingCase (this string s)
    {
      char[] characters = s.ToCharArray();
      for (int i = 0; i < characters.Length; i+=1) {
        if (char.IsUpper(characters[i])){
          characters[i] = char.ToLower(characters[i]);
        }
        else if (char.IsLower(characters[i])){
          characters[i] = char.ToUpper(characters[i]);
        }
      }
      string text = new string(characters);
      return text;
    }
  }
}

// 08142023 https://www.codewars.com/kata/58ca658cc0d6401f2700045f/train/csharp
using System.Collections.Generic;

public class Kata
{
  public static List<int> FindMultiples(int integer, int limit)
  {
    List<int> rtrLst = new List<int>();
    for (int n = 1; n <= limit / integer; n++){
      rtrLst.Add(integer * n);
    }
    return rtrLst;
  }
}

// 08152023 https://www.codewars.com/kata/523b623152af8a30c6000027/train/csharp
public class Kata
{
  public static double Square(double dbl){
    return dbl * dbl;
  }
}

// 08162023 https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/train/csharp
using System;
public class Cockroach
{
  public static int CockroachSpeed(double x)
  {
    return Convert.ToInt32(Math.Floor(x * 250 / 9));
  }
}

// 08172023 https://www.codewars.com/kata/57202aefe8d6c514300001fd/train/csharp
public class Kata
{
  public static int SaleHotDogs(int n)
  {
    if (n < 5){
      return 100 * n;
    }
    else if (n >= 5 && n < 10){
      return 95 * n;
    }
    else{
      return 90 * n;
    }
  }
}

// 08182023 https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/csharp
using System;

public class Kata
{
  public static string NumberToString(int num)
  {
    return num.ToString();
  }
}

// 08192923 https://www.codewars.com/kata/55ca77fa094a2af31f00002a/train/csharp
using System;

public static class Kata 
{
    public static int la_liga_goals = 43;
    public static int champions_league_goals = 10;
    public static int copa_del_rey_goals = 5;
    public static int total_goals = 58;
}

// 08202023 https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/csharp
using System;
using System.Linq;

public static class Kata
{
  public static int Sum(int[] numbers)
  {
    if (numbers == null){
      return 0;
    }
    else if (numbers.Length > 1){
      int highest = numbers[0];
      int lowest = numbers[0];
      int sum = 0;
      
      foreach (int i in numbers){
        if (i > highest){
         highest = i;
        }
        else if (i < lowest){
         lowest = i;
        }
      }
      foreach (int n in numbers){
        sum += n;
      }
      return sum - highest - lowest;
    }
    else{
      return 0;
    }
  }
}

// 08212023 https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/csharp
using System.Collections.Generic;
public class LineNumbering 
{
    public static List<string> Number(List<string> lines) 
    {
      List<string> rtrLst = new List<string>();
      if (lines.Count > 0){
        for (int i = 1; i <= lines.Count; i++){
          rtrLst.Add(i.ToString() + ": " + lines[i - 1]);
        }
      }
      return rtrLst;
    }
}
