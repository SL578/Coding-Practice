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
