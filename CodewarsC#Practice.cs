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
